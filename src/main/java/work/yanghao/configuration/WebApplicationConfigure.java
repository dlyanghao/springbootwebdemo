package work.yanghao.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import work.yanghao.interceptor.MVCInterceptor;

@Configuration
public class WebApplicationConfigure implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MVCInterceptor()).addPathPatterns("/intercept");
    }
}
