package springCouldZull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableAutoConfiguration
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class SpringcloudzuulApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringcloudzuulApplication.class, args);
	}
	
}