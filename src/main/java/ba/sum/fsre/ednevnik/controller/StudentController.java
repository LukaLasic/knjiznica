package ba.sum.fsre.ednevnik.controller;

import ba.sum.fsre.ednevnik.model.Book;
import ba.sum.fsre.ednevnik.model.Student;
import ba.sum.fsre.ednevnik.model.UserDetails;
import ba.sum.fsre.ednevnik.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("students")
    public String listStudents (Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        model.addAttribute("userDetails", userDetails);
        List<Student> listStudents = studentRepository.findAll();
        model.addAttribute("listStudents", listStudents);
        model.addAttribute("activeLink", "Studenti");
        return "students";
    }
    /*@GetMapping("books")
    public String listBooks (Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        model.addAttribute("userDetails", userDetails);
        List<Book> listBooks = bookRepo.findAll();
        model.addAttribute("listBooks", listBooks);
        model.addAttribute("activeLink", "Knjige");
        return "books";
    }*/
    @GetMapping("students/add")
    public String showAddStudentForm (Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        model.addAttribute("activeLink", "Studenti");
        model.addAttribute("userDetails", userDetails);
        model.addAttribute("student", new Student());
        return "add_student";
    }
}
