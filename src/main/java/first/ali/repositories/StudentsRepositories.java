package first.ali.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import first.ali.model.Students;

@Repository
public interface StudentsRepositories extends JpaRepository<Students,Long> {
    
}
