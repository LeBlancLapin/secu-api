package fr.levitt.secuapi.sql;

import fr.levitt.secuapi.core.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {}
