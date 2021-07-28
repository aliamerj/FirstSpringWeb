package first.ali.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import first.ali.Services.StudentsService;
import first.ali.model.Students;

@RestController
@RequestMapping(path = "/student")
class StudentsController {

    private StudentsService studentsService;
    


    @GetMapping
	public List<Students> getStudents(){
		var newStudent = studentsService.getStudents();
		return newStudent;

	}
	@PostMapping
	public void registerNewStudent(@RequestBody Students students){
		studentsService.addNewStudent(students);

	}
	@DeleteMapping(path = "{studentId}")
	public void removeStudent(@PathVariable("studentId") Long id){


	}


    
}