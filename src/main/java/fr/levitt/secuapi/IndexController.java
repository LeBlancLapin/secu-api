package fr.levitt.secuapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public Utilisateur index() {
        return new Utilisateur("james", "bond");
    }
}
