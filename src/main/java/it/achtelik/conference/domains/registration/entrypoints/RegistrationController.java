package it.achtelik.conference.domains.registration.entrypoints;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    private final static Logger LOGGER = LoggerFactory.getLogger(RegistrationController.class);

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registrationDto") RegistrationDto registrationDto) {
        return "registration";
    }

    @PostMapping("registration")
    public String postRegistration(@Valid @ModelAttribute("registrationDto") RegistrationDto registrationDto,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            LOGGER.error("Registration failed for: {}", registrationDto.getName());
            return "registration";
        }
        LOGGER.info("Registration successful for: {}", registrationDto.getName());
        return "redirect:registration";
    }
}
