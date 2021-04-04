package it.achtelik.conference.domains.registration.entrypoints;

import javax.validation.constraints.NotBlank;

public class RegistrationDto {
    //@NotBlank(message = "{registration.validation.name_is_blank_or_empty}")
    @NotBlank(message = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
