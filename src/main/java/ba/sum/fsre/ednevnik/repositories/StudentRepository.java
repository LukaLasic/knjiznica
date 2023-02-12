package ba.sum.fsre.ednevnik.repositories;


import ba.sum.fsre.ednevnik.model.Student;
import ba.sum.fsre.ednevnik.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
