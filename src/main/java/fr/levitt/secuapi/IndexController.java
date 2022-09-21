package fr.levitt.secuapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
public class IndexController {
    @GetMapping("/")
    public Utilisateur index() {
        return new Utilisateur("james", "bond");
    }

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @GetMapping("/test-new-user")
    public void addRandomUser() {
        Utilisateur utilisateur = new Utilisateur("Lol" + Math.random(), "Lilol" + Math.random());
        utilisateurRepository.save(utilisateur);
    }

    @GetMapping("/users")
    public Iterable<Utilisateur> all() {
        return utilisateurRepository.findAll();
    }
}
