package prod.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Lignecommande {
    private int id;
    private Date dateLigneCmd;
    private Integer quantite;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dateLigneCmd")
    public Date getDateLigneCmd() {
        return dateLigneCmd;
    }

    public void setDateLigneCmd(Timestamp dateLigneCmd) {
        this.dateLigneCmd = dateLigneCmd;
    }

    @Basic
    @Column(name = "quantite")
    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lignecommande that = (Lignecommande) o;

        if (id != that.id) return false;
        if (dateLigneCmd != null ? !dateLigneCmd.equals(that.dateLigneCmd) : that.dateLigneCmd != null) return false;
        if (quantite != null ? !quantite.equals(that.quantite) : that.quantite != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateLigneCmd != null ? dateLigneCmd.hashCode() : 0);
        result = 31 * result + (quantite != null ? quantite.hashCode() : 0);
        return result;
    }
}
