package fr.levitt.secuapi;

public class Utilisateur {
    private String nom;
    private String prenom;

    public Utilisateur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
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
