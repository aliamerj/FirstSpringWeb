package first.ali.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import first.ali.model.Students;
import first.ali.repositories.StudentsRepositories;

@Service
public class StudentsService {

    private final StudentsRepositories studentsRepositories;

    @Autowired
    public StudentsService(StudentsRepositories studentsRepositories) {
        this.studentsRepositories = studentsRepositories;
    }
    
    public List<Students> getStudents(){
		
		return studentsRepositories.findAll();

	}
    
}
