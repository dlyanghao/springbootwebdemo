package work.yanghao.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * The Class extend SpringBootServletInitializer let the project support servlet3.0, and the container startup can read the configurations
 */
@SpringBootApplication
@ComponentScan(basePackages = {"work.yanghao"})
public class ProjectApplication extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class,args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProjectApplication.class);
    }
}
