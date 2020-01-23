package prod.entities;


import javax.persistence.*;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String ref;
    private int quantite;


    private Double prixUnitaire;

    //@ManyToOne(fetch=FetchType.LAZY)
    //@JoinTable(name = "categorie")
    //@JoinColumn(name="idCategorie", referencedColumnName="id")
    private int categorie;
    //@ManyToOne(fetch=FetchType.LAZY)
    //@JoinTable(name = "fournisseur")
    //@JoinColumn(name="idFournisseur", referencedColumnName="id")
    private int fournisseur;
    public void setFournisseur(int idFournisseur) {
        this.fournisseur = idFournisseur;
    }

    public void setCategorie(int idCategorie) {
        this.categorie = idCategorie;
    }



    public int getFournisseur() {
        return fournisseur;
    }

    public int getCategorie() {
        return categorie;
    }

    public Produit(String ref, int quantite, Double prixUnitaire,int categorie,int fournisseur) {
        this.ref = ref;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.categorie=categorie;
        this.fournisseur=fournisseur;
    }

    public Produit() {
    }

    //private String libelle;
    //private String nom;
/*
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    private String prenom;
    //private int idFournisseur;
    //private int idCategorie;


 */




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(Double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }


    /*public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }
    */

/*
    public Produit(){
        super();
    }

    public Produit(String ref, int quantite, float prixUnitaire) {
        this.ref = ref;
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return Objects.equals(id, produit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
*/

}
