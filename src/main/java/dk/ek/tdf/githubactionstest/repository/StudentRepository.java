package dk.ek.tdf.githubactionstest.repository;


import dk.ek.tdf.githubactionstest.model.Student;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepository {

    public List<Student> findAll() {
        return List.of(
                new Student(1, "Anna"),
                new Student(2, "Peter"),
                new Student(3, "Emma")
        );
    }
}
