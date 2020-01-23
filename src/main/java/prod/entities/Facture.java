package prod.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Facture {
    private int id;
    private Double montantFacture;
    private Date dateFacture;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "montantFacture")
    public Double getMontantFacture() {
        return montantFacture;
    }

    public void setMontantFacture(Double montantFacture) {
        this.montantFacture = montantFacture;
    }

    @Basic
    @Column(name = "dateFacture")
    public Date getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(Date dateFacture) {
        this.dateFacture = dateFacture;
    }


}
