package com.james.config;

import com.james.shiro.LoginShiroRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.DelegatingFilterProxy;

@Configuration
public class ShiroConfig {
////    @Bean
////    public FilterRegistrationBean delegatingFilterProxy(){
////        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
////        DelegatingFilterProxy proxy = new DelegatingFilterProxy();
////        proxy.setTargetFilterLifecycle(true);
////        proxy.setTargetBeanName("shiroFilter");
////        filterRegistrationBean.setFilter(proxy);
////        return filterRegistrationBean;
////    }
//    @Bean("shiroFilter")
//        public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager")DefaultWebSecurityManager defaultWebSecurityManager){
//         ShiroFilterFactoryBean filterFactoryBean=new ShiroFilterFactoryBean();
//         //设置登陆页面
//        filterFactoryBean.setLoginUrl("/login");
//        //无权限跳转到
//        filterFactoryBean.setUnauthorizedUrl("/unauth");
//        filterFactoryBean.setSecurityManager(defaultWebSecurityManager);
//        return filterFactoryBean;
//    }
//    @Bean("defaultWebSecurityManager")
//    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("loginShiroRealm")LoginShiroRealm loginShiroRealm){
//        DefaultWebSecurityManager defaultWebSecurityManager=new DefaultWebSecurityManager();
//        defaultWebSecurityManager.setRealm(loginShiroRealm);
//        return defaultWebSecurityManager;
//    }
//
//        @Bean
//        public LoginShiroRealm loginShiroRealm(@Qualifier("hashedCredentialsMatcher")HashedCredentialsMatcher hashedCredentialsMatcher){
//        LoginShiroRealm loginShiroRealm=new LoginShiroRealm();
//        loginShiroRealm.setAuthenticationCachingEnabled(false);
//        loginShiroRealm.setCredentialsMatcher(hashedCredentialsMatcher);
//        return loginShiroRealm;
//        }
//    /**
//     * 密码校验规则HashedCredentialsMatcher
//     * 这个类是为了对密码进行编码的 ,
//     * 防止密码在数据库里明码保存 , 当然在登陆认证的时候 ,
//     * 这个类也负责对form里输入的密码进行编码
//     * 处理认证匹配处理器：如果自定义需要实现继承HashedCredentialsMatcher
//     */
//         @Bean("hashedCredentialsMatcher")
//    public HashedCredentialsMatcher hashedCredentialsMatcher(){
//        HashedCredentialsMatcher credentialsMatcher=new HashedCredentialsMatcher();
//        //指定加密方式MD5
//             credentialsMatcher.setHashAlgorithmName("MD5");
//             //加密次数
//             credentialsMatcher.setHashIterations(1024);
//             credentialsMatcher.setStoredCredentialsHexEncoded(true);
//             return credentialsMatcher;
//         }
//    /**
//     * 开启Shiro注解(如@RequiresRoles,@RequiresPermissions),
//     * 需借助SpringAOP扫描使用Shiro注解的类,并在必要时进行安全逻辑验证
//     * 配置以下两个bean(DefaultAdvisorAutoProxyCreator和AuthorizationAttributeSourceAdvisor)
//     */
//    @Bean
//    public DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator(){
//        DefaultAdvisorAutoProxyCreator advisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
//        advisorAutoProxyCreator.setProxyTargetClass(true);
//        return advisorAutoProxyCreator;
//    }
//    /**
//     * 开启aop注解支持
//     */
//    @Bean
//    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager) {
//        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
//        authorizationAttributeSourceAdvisor.setSecurityManager(defaultWebSecurityManager);
//        return authorizationAttributeSourceAdvisor;
//    }
//


}
