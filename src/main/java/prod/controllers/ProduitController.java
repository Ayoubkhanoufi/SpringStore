package prod.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prod.entities.Produit;
import prod.repositories.ProduitRepository;


@RestController

public class ProduitController {


	@Autowired
	private ProduitRepository produitRepository;
	@RequestMapping("/api/produit")
	public Principal user(Principal user)
	{
		return user;
	}
	
	
	@GetMapping("/produits")
	public List<Produit> getProduits()
	{
		return produitRepository.findAll();
	}
	
	@RequestMapping("/getproduit")
	public Produit getProduit(Long id)
	{
		return produitRepository.findById(id).get();
	}
	
	
	@RequestMapping("/deleteproduit")
	public boolean deleteProduit(Long id)
	{
		produitRepository.deleteById(id);
		return true;
	}
	@RequestMapping("/updateproduit")
	public Produit updateProduit(Produit prd)
	{
		return produitRepository.save(prd);
	}

	@RequestMapping("/saveproduit")
	public Produit createProduit(Produit prd)
	{
		return produitRepository.save(prd);
	}


 

 
	
}
