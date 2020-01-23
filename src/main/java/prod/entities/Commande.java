package prod.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commande {
    private int id;
    private Integer dateCommande;
    private Integer etatFacture;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateCommande")
    public Integer getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Integer dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Basic
    @Column(name = "etatFacture")
    public Integer getEtatFacture() {
        return etatFacture;
    }

    public void setEtatFacture(Integer etatFacture) {
        this.etatFacture = etatFacture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Commande commande = (Commande) o;

        if (id != commande.id) return false;
        if (dateCommande != null ? !dateCommande.equals(commande.dateCommande) : commande.dateCommande != null)
            return false;
        if (etatFacture != null ? !etatFacture.equals(commande.etatFacture) : commande.etatFacture != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateCommande != null ? dateCommande.hashCode() : 0);
        result = 31 * result + (etatFacture != null ? etatFacture.hashCode() : 0);
        return result;
    }
}
