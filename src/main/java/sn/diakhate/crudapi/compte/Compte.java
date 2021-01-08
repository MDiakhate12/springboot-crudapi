package sn.diakhate.crudapi.compte;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import sn.diakhate.crudapi.agence.Agence;
import sn.diakhate.crudapi.client.Client;

@Entity
public class Compte {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "solde")
    private Double solde;
    
    @Column(name = "decouvert")
    private Double decouvert;

    @ManyToOne(targetEntity = Agence.class)
    private Agence agence;

    @ManyToOne(targetEntity = Client.class)
    private Client client;

    public Compte() {}

    public Compte(int id, Double solde, Double decouvert) {
        this.id = id;
        this.solde = solde;
        this.decouvert = decouvert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public Double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(Double decouvert) {
        this.decouvert = decouvert;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
