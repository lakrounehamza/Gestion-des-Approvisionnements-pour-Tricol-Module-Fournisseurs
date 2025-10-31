package org.example.service;

import org.example.model.Fournisseur;

import java.util.List;

public interface IFournisseuerService {
    public Fournisseur save(Fournisseur fournisseur);
    public List<Fournisseur> getAllFournisseurs();
    public  Fournisseur update(Long id,Fournisseur fournisseur);
    public String delete(Long id);
    public  List<Fournisseur> getFournisseurByName(String email);
}
