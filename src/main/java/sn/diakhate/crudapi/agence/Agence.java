package sn.diakhate.crudapi.agence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "agence")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "addresse")
    private String addresse;

    @Column(name = "telephone")
    private String telephone;

    public int getId() {
        return id;
    }

    public Agence() {
    }
    
	public Agence(int id, String nom, String addresse, String telephone) {
		this.id = id;
		this.nom = nom;
		this.addresse = addresse;
		this.telephone = telephone;
	}

    

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
}
