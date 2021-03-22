package it.achtelik.conference.domains.registration.entrypoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registrationDto") RegistrationDto registrationDto) {
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@ModelAttribute("registrationDto") RegistrationDto registrationDto) {
        System.out.println(String.format("Registraion: %s", registrationDto.getName()));
        return "redirect:registration";
    }
}
