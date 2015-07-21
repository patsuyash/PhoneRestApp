package com.myphoneapp;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.RequestContextFilter;

import com.myphoneapp.rest.service.PhoneService;

/**
 * Class to register Jersey configuration and resource/endpoint classes.
 * @author Rakhi
 *
 */
public class JerseyConfig extends ResourceConfig{

	@Inject
    public JerseyConfig(ServletContext servletContext) {
        WebApplicationContext springFactory = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        register(RequestContextFilter.class);
        register(springFactory.getBean(PhoneService.class));
        register(LoggingFilter.class);
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        property(ServerProperties.MOXY_JSON_FEATURE_DISABLE, true);
        property(ServerProperties.JSON_PROCESSING_FEATURE_DISABLE, false);

        register(JacksonFeature.class);
        setApplicationName("phone-application");
    }
}
