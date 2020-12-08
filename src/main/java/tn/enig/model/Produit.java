package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Produit {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private float prix;
	private int quantité;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(Integer id, String description, float prix, int quantité) {
		super();
		this.id = id;
		this.description = description;
		this.prix = prix;
		this.quantité = quantité;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	} 
	
	
	

	

}
