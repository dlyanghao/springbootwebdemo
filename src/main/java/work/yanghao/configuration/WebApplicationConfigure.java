package work.yanghao.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import work.yanghao.interceptor.MVCInterceptor;

/**
 * 配置springMVC的bean
 *
 */
@Configuration
public class WebApplicationConfigure implements WebMvcConfigurer {

    /**
     * 先前跳转页面需要在Controller中写一个方法，现在通过configureViewResolvers可以不用写控制器就能达到目的了
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("").setViewName("index");
    }



    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MVCInterceptor()).addPathPatterns("/intercept");
    }
}
