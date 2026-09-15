package dk.ek.tdf.githubactionstest.controller;

import dk.ek.tdf.githubactionstest.repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    public String showStudents(Model model) {

        model.addAttribute("students",
                repository.findAll());

        return "students";
    }
}