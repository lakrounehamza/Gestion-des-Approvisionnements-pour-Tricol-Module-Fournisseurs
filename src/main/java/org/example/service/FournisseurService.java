package org.example.service;

import org.example.DAO.FournisseurRepository;
import org.example.model.Fournisseur;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Transactional
public class FournisseurService implements  IFournisseuerService{
    private FournisseurRepository fournisseurRepository;

    public FournisseurService(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    public  Fournisseur save(Fournisseur fournisseur){
        return fournisseurRepository.save(fournisseur);
    }
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    public  Fournisseur update(Long id,Fournisseur fournisseur){
       Optional<Fournisseur> four= fournisseurRepository.findById(id);
       if(four.isPresent()){
           four.get().setSociete(fournisseur.getSociete());
           four.get().setAdresse(fournisseur.getAdresse());
           four.get().setContact(fournisseur.getContact());
           four.get().setEmail(fournisseur.getEmail());
           four.get().setTelephone(fournisseur.getTelephone());
           four.get().setVille(fournisseur.getVille());
           four.get().setIce(fournisseur.getIce());
           return fournisseurRepository.save(four.get());
       }else {
           return  null;
       }

    }

    public String delete(Long id){
        Optional<Fournisseur> fournisseur=fournisseurRepository.findById(id);
        if(fournisseur.isPresent()){
            fournisseurRepository.delete(fournisseur.get());
            return " fournisseur supprime avec sucess";
        }
        return "fournisseur n'existe pas";
    }

    public  List<Fournisseur> getFournisseurByName(String email){
        List<Fournisseur> all = fournisseurRepository.findAll();
        return all.stream()
                .filter(f -> f.getEmail() != null && f.getEmail().equalsIgnoreCase(email))
                .collect(Collectors.toList());
    }


}
