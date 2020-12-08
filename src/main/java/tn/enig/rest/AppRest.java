package tn.enig.rest;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IProduitDao;
import tn.enig.model.Produit;

@CrossOrigin("*")
@RestController
public class AppRest {

	@Autowired
	IProduitDao dao;

	public void setDao(IProduitDao daop) {
	this.dao = dao;
	
	}

	@GetMapping("/produit")
	public List<Produit> fnct1() {
	return (List<Produit>) dao.findAll();
	}

	@PostMapping("/addproduit")
	public Produit fnct2(@RequestBody Produit e1) {
	return dao.save(e1);
	}

	@DeleteMapping("/deletd/{id}")
	public void fnct3(@PathVariable("id") int id) {
	dao.deleteById(id);
	}

	}
