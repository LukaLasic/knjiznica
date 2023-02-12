package ba.sum.fsre.ednevnik.controller;

import ba.sum.fsre.ednevnik.model.Student;
import ba.sum.fsre.ednevnik.model.StudentDetails;
import ba.sum.fsre.ednevnik.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController {
    @Autowired
    private StudentRepository studoRep;

    @GetMapping("/students")
    public String listStudents(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        StudentDetails studentDetails = (StudentDetails) authentication.getPrincipal();
        List<Student> listStudents = studoRep.findAll();
        model.addAttribute("listStudents", listStudents);
        model.addAttribute("studentDetails", studentDetails);
        model.addAttribute("activeLink", "Studenti");
        return "students";
    }
    /*@GetMapping("/users")
    public String listUsers(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetåails = (UserDetails) authentication.getPrincipal();
        List<User> listUsers = userRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        model.addAttribute("userDetails", userDetails);
        model.addAttribute("activeLink", "Korisnici");
        return "users";
    }*/
}
