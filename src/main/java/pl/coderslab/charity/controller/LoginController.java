package pl.coderslab.charity.controller;

import com.sun.xml.bind.v2.TODO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    String login(){
        return "login";
    }



    // TODO: 27/06/2022 - - czy tak ma wyglądać sprawdzenie użytkownika, czy tuaj jest if dla admina i przekierowanie na stronę dla admina? 
//    @PostMapping("/login")
//    public String loginError(Model model, HttpServletRequest request) {
//        List<User> users = userRepository.findAll();
//        for (User user: users) {
//            if ((user.getUsername().equals(request.getParameter("username")) && request.getParameter("password").equals("")) || (user.getUsername().equals(request.getParameter("username")) && !user.getPassword().equals(request.getParameter("password")))) {
//                model.addAttribute("error", 1); /* 1 - user exist but password not matches */
//            } else if(!user.getUsername().equals(request.getParameter("username")) || request.getParameter("username").equals("")) {
//                model.addAttribute("error", 0); /* 0 - user not exist, or exist but username incorrect*/
//            }
//        }
//        return "loginError";



}
