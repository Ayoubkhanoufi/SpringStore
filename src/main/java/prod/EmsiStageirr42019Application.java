package prod;


import java.time.LocalDate; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import prod.entities.*;
import prod.repositories.AdminRepository;
import prod.repositories.CategorieRepository;
import prod.repositories.FournisseurRepository;
import prod.repositories.ProduitRepository;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class EmsiStageirr42019Application implements CommandLineRunner {

	@Autowired
	public ProduitRepository produitRepository ;

	@Autowired
	public CategorieRepository categorieRepository ;

	@Autowired
	public FournisseurRepository fournisseurRepository ;

	@Autowired
	public AdminRepository adminRepository ;


	public static void main(String[] args) {
		SpringApplication.run(EmsiStageirr42019Application.class, args);
	}
	
	public void run(String... arg0) throws Exception {	
		System.out.println("############## Projet ################");
		System.out.println("############## Admin Compte ################");
		
		
		adminRepository.save(new Admin("n410299","Mohamed","Bentebbaa","Marrakech","0553177942","M.bentebba45@gmail.com","images/icon/avatar-7.jpg","Admin","123"));
		adminRepository.save(new Admin("n20192","Khanoufi","Ayoub","ESSAOUIRA","0604020505","khanoufiAyoub@gmail.com","images/icon/avatar-06.jpg","HAMZA","123"));
		
		adminRepository.save(new Admin("n20192","Khalki","Mehdi","ESSAOUIRA","0604020505","personne1@gmail.com","images/icon/avatar-06.jpg","HAMZA","123"));
		adminRepository.save(new Admin("n20192","Nouhaila","A","Casa","0604020505","personne2@gmail.com","images/icon/avatar-06.jpg","HAMZA","123"));
		adminRepository.save(new Admin("n20192","Imane","J","Beni Mellal","0604020505","personne4@gmail.com","images/icon/avatar-06.jpg","HAMZA","123"));


		System.out.println("############## Categories ################");

		categorieRepository.save(new Categorie("cat1"));
		categorieRepository.save(new Categorie("cat2"));
		categorieRepository.save(new Categorie("cat3"));


		System.out.println("############## Fournisseurs ################");

		fournisseurRepository.save(new Fournisseur("mohamed","ben tebbaa","0601020304","email@gmail.com"));
		fournisseurRepository.save(new Fournisseur("ayoub","khanoufi","0600000304","email@gmail.com"));

		
		System.out.println("############## Produits ################");


		produitRepository.save(new Produit("Hp",3,5000.0,1,1));
		produitRepository.save(new Produit("Sony",56,5600.20,2,2));
		produitRepository.save(new Produit("Asus",60,60000.5,3,3));

		



		
		
		System.out.println("############## The END ################");
		
		
	
		
	}

}
