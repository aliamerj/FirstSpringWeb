package first.ali.Services;


import java.util.List;
import java.util.Optional;

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

    public void addNewStudent(Students students){
        Optional<Students> studentOptional = studentsRepositories.findById(students.getId());
        if (studentOptional.isPresent())
            throw new IllegalStateException("ID token");

        studentsRepositories.save(students);


    }
    public void removeStudentX(Long studentId){
      var isPresent =  studentsRepositories.existsById(studentId);
      if (isPresent)
        studentsRepositories.deleteById(studentId);
      throw new  IllegalStateException( studentId+ "dose not exists");  

    }
    
}
