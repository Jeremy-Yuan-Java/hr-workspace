package com.hrbc.business.conf.aop;


import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.Staffs;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

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
        Staffs staffs = JwtToken.CURRENTSTAFFMAP.get(username);
        System.out.println(username + staffs.getStaffno());
        /*JSysUserMapping um = JwtToken.getCurrentMapping();
        if(um!=null){
            if(!CollectionUtils.isEmpty(um.getAccessAffList())){
                Object object = joinpoint.getArgs()[0];
                if(object instanceof Map){
                    ((Map) object).put(ACCESS_AFF_FIELD, um.getAccessAffList());
                }
                if(object instanceof OfferActiveDayExample){
                    OfferActiveDayExample example = ((OfferActiveDayExample) object);
                    if(CollectionUtils.isEmpty(example.getOredCriteria())){
                        example.createCriteria();
                    }

                    example.getOredCriteria().get(0).andAffidIn(um.getAccessAffList().stream().map(n->Integer.parseInt(n)).collect(Collectors.toList()));
                }
                if(object instanceof JActivateExample){
                    JActivateExample example = ((JActivateExample) object);
                    if(CollectionUtils.isEmpty(example.getOredCriteria())){
                        example.createCriteria();
                    }
                    example.getOredCriteria().get(0).andAffiliateidIn(um.getAccessAffList());
                }
                if(object instanceof JOfferExample){
                    JOfferExample example = ((JOfferExample) object);
                    if(CollectionUtils.isEmpty(example.getOredCriteria())){
                        example.createCriteria();
                    }

                    example.getOredCriteria().get(0).andAffiliateidIn(um.getAccessAffList().stream().map(n->Short.parseShort(n)).collect(Collectors.toList()));
                }

                if(object instanceof JAffiliateExample){
                    JAffiliateExample example = ((JAffiliateExample) object);
                    if(CollectionUtils.isEmpty(example.getOredCriteria())){
                        example.createCriteria();
                    }
                    example.getOredCriteria().get(0).andIdIn(um.getAccessAffList().stream().map(n->Integer.parseInt(n)).collect(Collectors.toList()));
                }

            }
        }*/

    }


}
