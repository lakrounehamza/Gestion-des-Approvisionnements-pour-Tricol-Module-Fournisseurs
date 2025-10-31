package org.example.DAO;

import org.example.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FournisseurRepository  extends  JpaRepository<Fournisseur, Long>{

}
