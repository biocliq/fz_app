package com.zitlab.palmyra.jetty;

//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.zitlab.palmyra.cinch.core.audit.ChangeLogger;
import com.zitlab.palmyra.spring.SpringConfigJacksonMapper;

@Configuration
@Import(SpringConfigJacksonMapper.class)
@ImportResource("classpath:spring/spring-config.xml")
public class JavaConfiguration {

	@Bean
	public ChangeLogger getLogger() {
		return ChangeLogger.NOOP;
	}

}
