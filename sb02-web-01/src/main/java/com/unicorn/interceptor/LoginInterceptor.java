package com.unicorn.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *     登录拦截器
 * </p>
 * Created on 2021/04/14 21:57
 *
 * @author Unicorn
 */
// 拦截器都需要实现HandlerInterceptor接口
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进来了拦截器");
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null){
            // 放行
            return true;
        }
        // 拦截
//        return false;
        return true;
    }
}
