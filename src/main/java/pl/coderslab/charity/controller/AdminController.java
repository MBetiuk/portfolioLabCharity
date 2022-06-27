package pl.coderslab.charity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.model.User;
import pl.coderslab.charity.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {



    private final UserRepository userRepository;

    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public String userAll (Model model){
        List<User> userList = userRepository.findAll();
        model.addAttribute("userList", userList);
        return "userAll";
    }

@GetMapping("/update/{id}")
    public String updateUser(@PathVariable Long id, Model model){
        model.addAttribute("user", userRepository.findById(id));
        return "userUpdate";
}

@PostMapping("/update/{id}")
    public String updateUser (User user){
        userRepository.save(user);
        return "redirect:/admin/all";
}
}
