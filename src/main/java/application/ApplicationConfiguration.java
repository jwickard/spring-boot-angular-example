package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>application.ApplicationConfiguration</p>
 * <p>Base Application Configuration</p>
 *
 * @author Joel Wickard (Object Partners Inc.)
 */
@Configuration
//@EnableJpaRepositories
//@Import(RepositoryRestMvcConfiguration.class)
@ComponentScan
@EnableAutoConfiguration
public class ApplicationConfiguration {

	public static void main(String[] args){
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

}
