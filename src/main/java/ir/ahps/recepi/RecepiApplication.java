package ir.ahps.recepi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class RecepiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecepiApplication.class, args);
	}

}
