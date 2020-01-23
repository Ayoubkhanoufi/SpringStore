package prod.repositories;

import prod.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
//@Transactional
public interface ProduitRepository extends JpaRepository<Produit,Long> {

    //Page<Produit> findByCategorieId(Long categorieId,Pageable pageable);
    //Optional<Produit> findByIdAndCategorieId(Long Id,Long CategorieId);

    //afficher produit avec lbelle, nom et prenom
    /*
    @Query(value = "SELECT p.id,p.prix_unitaire,p.quantite,p.ref,c.libelle,f.nom,f.prenom FROM `produit` p inner join categorie c on p.id_Categorie=c.id inner join fournisseur f on p.id_Fournisseur=f.id ",
            nativeQuery = true)
    List<Produit1> findAll1();
*/
/*
    @Query(value = "SELECT id,prix_unitaire,quantite,ref,categorie,fournisseur FROM `produit` ",
            nativeQuery = true)
    List<Produit> findAll();
*/

}
