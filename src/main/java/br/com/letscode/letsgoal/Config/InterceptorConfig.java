package br.com.letscode.letsgoal.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class InterceptorConfig implements WebMvcConfigurer {

    PreRequestHandler preRequestHandler;

    @Autowired
    public InterceptorConfig(PreRequestHandler preRequestHandler) {
        this.preRequestHandler = preRequestHandler;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(preRequestHandler);
    }
}
