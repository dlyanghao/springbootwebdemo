package work.yanghao.configuration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * datasource configuration
 * @Configuration the annotation can replace the xml file, as the springframework old configure file the application.xml
 * @ConditionalOnMissingBean if the bean haven created by spring boot,the method will not be executed
 * @Bean the annotation up the method can get a object(bean) as write the xml code(<bean></bean>) in application.xml
 */
@Configuration
@AutoConfigureAfter(WebApplicationConfigure.class)
@PropertySource(value={"classpath:jdbc.properties"},ignoreResourceNotFound=true)
public class DataSourceConfigure {

    @Value("${jdbc.driverClassName}")
    private String driverClass;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    @ConditionalOnMissingBean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(20);
        dataSource.setMinIdle(10);
        dataSource.setDefaultAutoCommit(false);
        return dataSource;
    }

}
