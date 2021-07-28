package first.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AliApplication {

	public static void main(String[] args) {
		SpringApplication.run(AliApplication.class, args);
	}


	@GetMapping(value = "/hello")
	public String hello (){
		return "Hello world";
	}

}
