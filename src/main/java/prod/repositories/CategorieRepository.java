package prod.repositories;

import prod.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//@Transactional
public interface CategorieRepository extends JpaRepository<Categorie,Long> {

    //public <S extends Produit> S save(S s);
}
