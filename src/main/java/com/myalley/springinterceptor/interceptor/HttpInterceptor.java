package com.myalley.springinterceptor.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@Component
public class HttpInterceptor implements HandlerInterceptor {

    /**
    filter : dispatcher전의 대한 처리
    interceptor : dispatcher후의 HttpServletRequest, HttpServletResponse에 대한 처리
    */
    
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {
        if(log.isDebugEnabled()) {
            log.info("================ Before Method : 맵핑되기 전 처리");
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) {
        if(log.isDebugEnabled()) {
            log.info("================ Method Executed : 맵핑되고난 후 처리");
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) {
        if(log.isDebugEnabled()) {
            log.info("================ Method Completed : 모든 작업이 완료된 후 실행");
        }
    }

}
