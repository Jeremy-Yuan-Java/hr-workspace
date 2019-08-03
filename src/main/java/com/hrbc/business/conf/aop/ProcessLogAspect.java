package com.hrbc.business.conf.aop;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.ExecutorPool;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.OpLog;
import com.hrbc.business.mapper.OpLogMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;


/**
 * @author huangyongchao
 */
@Aspect
public class ProcessLogAspect {
    private static final String pointcut = "execution(* com.hrbc.business.service.impl.*.*(..))";

    @Autowired
    private OpLogMapper opLogMapper;


    @Pointcut(pointcut)
    public void serviceMethod() {
    }

    @After("serviceMethod() && @annotation(pl)")
    public void processAfter(JoinPoint joinpoint, ProcessLog pl) {
        String user = JwtToken.getUser();
        if (pl != null) {
            String methodName = pl.methodName();
            String businessName = pl.businessName();
            ExecutorPool.getExecutor().execute(() -> {
                try {
                    OpLog opLog = new OpLog();
                    Object[] args = joinpoint.getArgs();
                    if (args.length > 0) {
                        opLog.setOpcontent(JSONObject.toJSONString(args[0]));
                        if (StringUtils.isEmpty(opLog.getOpcontent()) && opLog.getOpcontent().length() > 2000) {
                            opLog.setOpcontent(opLog.getOpcontent().substring(0, 2000));
                        }
                    }
                    opLog.setBusiness(businessName);
                    opLog.setFunc(methodName);
                    if (!StringUtils.isEmpty(user)) {
                        opLog.setOpuser(user);
                    }
                    opLogMapper.insertSelective(opLog);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }

    }

}
