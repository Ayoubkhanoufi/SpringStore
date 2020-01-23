package prod.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prod.entities.Categorie;
import prod.repositories.CategorieRepository;

import java.util.List;


@RestController
@RequestMapping("")
public class CategorieController {


	@Autowired
	private CategorieRepository categorieRepository;
	
	@GetMapping("/categories")
	public List<Categorie> getCategories()
	{
		return categorieRepository.findAll();
	}
	
	@RequestMapping("/getcategorie")
	public Categorie getCategorie(Long id)
	{
		return categorieRepository.findById(id).get();
	}
	
	
	@RequestMapping("/deletecategorie")
	public boolean deleteCategorie(Long id)
	{
		categorieRepository.deleteById(id);
		return true;
	}
	@RequestMapping("/updatecategorie")
	public Categorie updateCategorie(Categorie categorie)
	{
		return categorieRepository.save(categorie);
	}

	@RequestMapping("/savecategorie")
	public Categorie createCategorie(Categorie categorie)
	{
		return categorieRepository.save(categorie);
	}


	
}
