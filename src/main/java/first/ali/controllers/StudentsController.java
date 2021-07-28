package first.ali.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import first.ali.Services.StudentsService;
import first.ali.model.Students;

@RestController
@RequestMapping(path = "/student")
class StudentsController {

    private StudentsService studentsService;

    @Autowired
    public StudentsController(StudentsService studentsService) {
        this.studentsService = studentsService;
    }


    @GetMapping
	public Students getStudents(){
		var newStudent = studentsService.getStudents();
		return newStudent;

	}


    
}