package com.unicorn.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * <p>
 * </p>
 * Created on 2021/04/15 17:06
 *
 * @author Unicorn
 */
@Configuration
public class DruidConfig {

    // 添加自定义的数据源(Druid)
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")  // 绑定配置
    public DataSource dataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        // 开启监控统计功能
//        druidDataSource.setFilters("stat");
        return druidDataSource;
    }

    // 添加一个Servlet开启Druid的内置监控页面
    @Bean
    public ServletRegistrationBean statViewServlet(){
        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(statViewServlet,"/druid/*");
        return servletRegistrationBean;
    }
}
