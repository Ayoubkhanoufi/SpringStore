package prod.repositories;

import prod.entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//@Transactional
public interface FournisseurRepository extends JpaRepository<Fournisseur,Long> {

    //public <S extends Produit> S save(S s);
}
