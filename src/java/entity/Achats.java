package entity;
// Generated 19 mai 2017 15:58:01 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Achats generated by hbm2java
 */
public class Achats  implements java.io.Serializable {


     private Integer id;
     private Fournisseurs fournisseurs;
     private Produits produits;
     private Date dateAchat;
     private String qteAchete;
     private BigDecimal prixAchat;
     private Date createdAt;
     private Date updatedAt;

    public Achats() {
    }

	
    public Achats(Fournisseurs fournisseurs, Produits produits, Date dateAchat, String qteAchete, BigDecimal prixAchat) {
        this.fournisseurs = fournisseurs;
        this.produits = produits;
        this.dateAchat = dateAchat;
        this.qteAchete = qteAchete;
        this.prixAchat = prixAchat;
    }
    public Achats(Fournisseurs fournisseurs, Produits produits, Date dateAchat, String qteAchete, BigDecimal prixAchat, Date createdAt, Date updatedAt) {
       this.fournisseurs = fournisseurs;
       this.produits = produits;
       this.dateAchat = dateAchat;
       this.qteAchete = qteAchete;
       this.prixAchat = prixAchat;
       this.createdAt = createdAt;
       this.updatedAt = updatedAt;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Fournisseurs getFournisseurs() {
        return this.fournisseurs;
    }
    
    public void setFournisseurs(Fournisseurs fournisseurs) {
        this.fournisseurs = fournisseurs;
    }
    public Produits getProduits() {
        return this.produits;
    }
    
    public void setProduits(Produits produits) {
        this.produits = produits;
    }
    public Date getDateAchat() {
        return this.dateAchat;
    }
    
    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }
    public String getQteAchete() {
        return this.qteAchete;
    }
    
    public void setQteAchete(String qteAchete) {
        this.qteAchete = qteAchete;
    }
    public BigDecimal getPrixAchat() {
        return this.prixAchat;
    }
    
    public void setPrixAchat(BigDecimal prixAchat) {
        this.prixAchat = prixAchat;
    }
    public Date getCreatedAt() {
        return this.createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return this.updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }




}


