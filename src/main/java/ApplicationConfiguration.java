import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ApplicationConfiguration</p>
 * <p>Base Application Configuration</p>
 *
 * @author Joel Wickard (Object Partners Inc.)
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ApplicationConfiguration {

	public static void main(String[] args){
		SpringApplication.run(ApplicationConfiguration.class, args);
	}

}
