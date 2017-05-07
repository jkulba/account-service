package us.kulba.accounts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.IOException;

@SpringBootApplication
@ConfigurationProperties(prefix = "app")
public class Application {
    final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws IOException {

		SpringApplication.run(Application.class, args);

	}
}
