package br.com.letscode.letsgoal.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class PreRequestHandler implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        log.info("#################### PRE HANDLE ####################");
        log.info("####### Método: " + request.getMethod());
        log.info("####### Remote Addr: " + request.getRemoteAddr());
        log.info("#################### PRE HANDLE ####################");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
    @Override
    public void postHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler,
                             ModelAndView modelAndView) throws Exception {
        log.info("#################### POST HANDLE ####################");
        log.info("####### Método: " + request.getMethod());
        log.info("####### Remote Addr: " + request.getRemoteAddr());
        log.info("#################### POST HANDLE ####################");
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }
}
