package fr.levitt.secuapi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Utilisateur {
    private @Id @GeneratedValue Long id;
    private String nom;
    private String prenom;

    public Utilisateur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Long id() {
        return this.id;
    }

    public void id(Long id) {
        this.id = id;
    }

    public String nom() {
        return this.nom;
    }

    public void nom(String nom) {
        this.nom = nom;
    }

    public void prenom(String prenom) {
        this.prenom = prenom;
    }

    public String prenom() {
        return this.prenom;
    }
}
