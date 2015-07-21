package com.myphoneapp;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.myphoneapp.dao.PhoneDao;

@EnableAutoConfiguration(exclude={ErrorMvcAutoConfiguration.class})
@Configuration
@ComponentScan
@EnableTransactionManagement
@EnableCaching
public class ApplicationConfig extends SpringBootServletInitializer{

	private static final Logger log = LoggerFactory.getLogger(ApplicationConfig.class);
	public static final String BASE_PATH = "/phonetestservice/rest/*";
    
	
	@Component
    static class Runner implements CommandLineRunner {
        @Autowired
        private PhoneDao phoneDao;;

        @Override
        public void run(String... args) throws Exception {
            log.info(".... Fetching books");
            log.info("isbn-1234 -->" + phoneDao.findPhoneById(10));
            log.info("isbn-4567 -->" + phoneDao.findPhoneById(10));
            log.info("isbn-1234 -->" + phoneDao.findPhoneById(10));
            log.info("isbn-4567 -->" + phoneDao.findPhoneById(10));
            log.info("isbn-1234 -->" + phoneDao.findPhoneById(10));
            log.info("isbn-1234 -->" + phoneDao.findPhoneById(10));
        }
    }
	
	@Bean
    public CacheManager cacheManager() {
        return new ConcurrentMapCacheManager("phones");
    }
    public static void main(String[] args) {
        SpringApplication.run(ApplicationConfig.class, args);
    }
    
    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(),
                BASE_PATH);
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());
        return registration;
    }
}
