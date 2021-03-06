package com.hrbc.business.conf;


import com.hrbc.business.common.JwtToken;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huangyongchao
 */
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (HttpMethod.OPTIONS.name().equals(request.getMethod())) {
            return true;
        }
        if (request.getRequestURI().indexOf(PathConf.ACCESS_PATH)>=0) {
            return true;
        }
        String token = request.getHeader("USERTOKEN");
        if(StringUtils.isEmpty(token)&&request.getRequestURI().indexOf("upload")>=0){
            token = request.getParameter("key");
        }
        if (StringUtils.isEmpty(token)) {
            request.getRequestDispatcher("/api/auth/tokeninvalid").forward(request,response);
            return false;
        } else {

            String user = JwtToken.checkUser(token);
            /**
             * 如果用户过期 就跳转到token过期进行重新登录
             */
            if (StringUtils.isEmpty(user)) {
                request.getRequestDispatcher("/api/auth/tokeninvalid").forward(request,response);
                return false;
            } else {
                JwtToken.setUserLocal(user);
                return true;
            }

        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
