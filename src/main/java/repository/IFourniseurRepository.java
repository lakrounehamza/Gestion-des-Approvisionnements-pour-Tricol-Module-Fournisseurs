package repository;

import entity.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface IFourniseurRepository  extends JpaRepository<Fournisseur, Long> {

}
