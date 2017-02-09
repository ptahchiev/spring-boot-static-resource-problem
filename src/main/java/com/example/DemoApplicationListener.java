package com.example;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.logging.LoggingApplicationListener;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.env.PropertiesPropertySource;

import java.util.Properties;

/**
 * @author Petar Tahchiev
 * @since 1.5
 */
public class DemoApplicationListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent>, Ordered {

    private int order = LoggingApplicationListener.DEFAULT_ORDER - 1;

    @Override
    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        Properties properties = new Properties();
        properties.put("property.x", "test");
        event.getEnvironment().getPropertySources().addLast(new PropertiesPropertySource("webJarsVersions", properties));
    }
}
