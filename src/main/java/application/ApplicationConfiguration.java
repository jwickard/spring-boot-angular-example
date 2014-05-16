package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

/**
 * <p>ApplicationConfiguration</p>
 * <p>Base Application Configuration</p>
 *
 * @author Joel Wickard (Object Partners Inc.)
 */
@Configuration
@EnableAutoConfiguration
@Import(RepositoryRestMvcConfiguration.class)
@ComponentScan
public class ApplicationConfiguration {

	public static void main(String[] args){
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

}
