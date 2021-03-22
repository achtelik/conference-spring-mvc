package it.achtelik.conference.domains.conference.entrypoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class ConferenceController {

    @GetMapping("conference")
    public String getConference(Map<String, Object> model) {
        model.put("conference_name", "Achtelik IT Summit");
        return "conference";
    }
}
