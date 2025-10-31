package org.example.controller;

import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import org.example.model.Fournisseur;
import org.example.service.FournisseurService;
import org.example.service.IFournisseuerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/fournisseurs")
public class FournisseurController {
    private IFournisseuerService fournisseurService;

    public FournisseurController(IFournisseuerService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    @PostMapping
    public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur){
     return fournisseurService.save(fournisseur);
    }
    @PutMapping("/{id}")
    public  Fournisseur updateFournisseur(@PathVariable("id") Long id,@RequestBody Fournisseur fournisseur){
        return  fournisseurService.update(id,fournisseur);
    }
    @DeleteMapping("/{id}")
    public  String deleteFournisseur(@PathVariable("id") Long id){
        return fournisseurService.delete(id);
    }
    @GetMapping
    public  List<Fournisseur> getAllFournisseurs(){
        return fournisseurService.getAllFournisseurs();
    }
    @GetMapping("/search")
    public  List<Fournisseur> getFournisseursByName(@RequestParam("email") String email){
        return  fournisseurService.getFournisseurByName(email);
    }



}
