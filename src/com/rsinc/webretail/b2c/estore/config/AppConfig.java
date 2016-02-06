/**
 * 
 */
package com.rsinc.webretail.b2c.estore.config;

import javax.inject.Inject;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Roshan Titus
 *
 */
@Configuration
@Import(DataConfig.class)
@ComponentScan({ "com.rsinc.webretail.b2c.estore.manager" })
public class AppConfig {

	@Inject
	DataConfig dataConfig;
	
//	@Bean
//    public UserDao<T> userDao() {
//        
//    }
}
