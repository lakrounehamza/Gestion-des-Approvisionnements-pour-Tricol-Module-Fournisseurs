package service;


import entity.Fournisseur;

import java.util.List;
import java.util.Optional;

public interface IFournisseurService {
    public Fournisseur save(Fournisseur f);
    public List<Fournisseur>   getAll();
    public  Fournisseur  update(Fournisseur f);
    public  void  delete(Long id);
    public Optional<Fournisseur>  getById(Long id);

}
