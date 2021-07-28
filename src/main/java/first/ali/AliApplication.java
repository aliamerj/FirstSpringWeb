package first.ali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import first.ali.model.Students;

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

	@GetMapping(value = "/students")
	public Students getStudents(){
		var newStudent = new Students(123L,"ali","amer",21);
		return newStudent;

	}

}
