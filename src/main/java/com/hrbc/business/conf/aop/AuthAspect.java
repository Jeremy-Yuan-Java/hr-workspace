package com.hrbc.business.conf.aop;


import com.hrbc.business.common.JwtToken;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 后续数据权限使用
 */
@Aspect
public class AuthAspect {
    private static final String pointcut =
            "execution(* com.hrbc.business.mapper..*.select*(..))||" +
                    "execution(* com.hrbc.business.mapper..*.count*(..))||" +
                    "execution(* com.hrbc.business.mapper..*.query*(..))||" +
                    "execution(* com.hrbc.business.mapper..*.find*(..))||" +
                    "execution(* com.hrbc.business.mapper..*.get*(..))";

    @Pointcut(pointcut)
    public void dataaccessPointCut() {
    }

    @Before(" dataaccessPointCut()")
    public void dataaccessBefore(JoinPoint joinpoint) throws Throwable {
        if (joinpoint.getArgs().length < 1) {
            return;
        }
        String username = JwtToken.getUser();

    }


}
