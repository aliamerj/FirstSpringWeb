package first.ali.Services;


import org.springframework.stereotype.Service;

import first.ali.model.Students;

@Service
public class StudentsService {
    
    public Students getStudents(){
		var newStudent = new Students(123L,"ali","amer",21);
		return newStudent;

	}
    
}
