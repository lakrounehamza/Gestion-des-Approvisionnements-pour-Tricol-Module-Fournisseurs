package countroller;

import entity.Fournisseur;
import  service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/fournisseurs")
public class FournisseurController {

    @Autowired
    private FournisseurService service;

    @GetMapping
    public List<Fournisseur> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Fournisseur getById(@PathVariable Long id) {
        Optional<Fournisseur> fr = service.getById(id);
        if (fr.isPresent())
            return fr.get();
        else
            return  null;
    }

    @PostMapping
    public Fournisseur create(@RequestBody Fournisseur fournisseur) {
        return service.save(fournisseur);
    }

    @PutMapping("/{id}")
    public Fournisseur update( @RequestBody Fournisseur fournisseur) {
        return service.update(fournisseur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
