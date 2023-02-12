package ba.sum.fsre.ednevnik.repositories;


import ba.sum.fsre.ednevnik.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
