package service;

import entity.Fournisseur;
import repository.IFourniseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FournisseurService implements IFournisseurService {

    private IFourniseurRepository iFourniseurRepository;


    @Override
    public Fournisseur save(Fournisseur f) {
        return iFourniseurRepository.save(f);
    }

    @Override
    public List<Fournisseur> getAll() {
        return iFourniseurRepository.findAll();
    }

    @Override
    public Fournisseur update(Fournisseur f) {
        if (iFourniseurRepository.existsById(f.getId()))
            return iFourniseurRepository.save(f);
        return null;
    }

    @Override
    public void delete(Long id) {
        if (iFourniseurRepository.existsById(id))
            iFourniseurRepository.deleteById(id);

    }

    @Override
    public Optional<Fournisseur> getById(Long id) {
        return iFourniseurRepository.findById(id);
    }
}
