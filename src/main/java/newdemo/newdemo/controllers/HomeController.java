package newdemo.newdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import newdemo.newdemo.models.Student;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/resgiter")
    public String register(Model model,  @ModelAttribute("student") Student student) {
        
        return "resgiter";
    }
    
    @PostMapping("/resgiter/new")
    public String newUser(Model model, @ModelAttribute @Valid Student student, Errors errors) {   

        
        if (errors.hasErrors()) {
            model.addAttribute("errorMessage", "Cần nhập đúng các trường dữ liệu!!");
        } else {
            model.addAttribute("message", "Đã nhập đúng các trường dữ liệu!!");
        }
        return "resgiter";
    }
    
    
}
