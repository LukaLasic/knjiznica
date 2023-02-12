package ba.sum.fsre.ednevnik;

import ba.sum.fsre.ednevnik.model.Student;
import ba.sum.fsre.ednevnik.repositories.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EDnevnikApplication {

    StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(EDnevnikApplication.class, args);
    }
}
