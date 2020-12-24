package sn.diakhate.crudapi.compte;

public class Compte {
    
    private int id;
    private Double solde;
    private Double decouvert;
    private String agentCode;
    private int clientId;

    public Compte() {}

    public Compte(int id, Double solde, Double decouvert, String agentCode, int clientId) {
        this.id = id;
        this.solde = solde;
        this.decouvert = decouvert;
        this.agentCode = agentCode;
        this.clientId = clientId;
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

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgenceCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "Compte [agentCode=" + agentCode + ", clientId=" + clientId + ", decouvert=" + decouvert + ", id="
                + id + ", solde=" + solde + "]";
    }

    

}
