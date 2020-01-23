package prod.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import prod.entities.Fournisseur;
import prod.repositories.FournisseurRepository;

import java.util.List;

@RestController
@RequestMapping("/api/fournisseur")
@CrossOrigin
public class FournisseurController {


    @Autowired
    private FournisseurRepository fournisseurRepository;

//("/categories")
    @GetMapping
    public List<Fournisseur> getFournisseurs() {
        return  fournisseurRepository.findAll();
    }


//("/add")
    @PostMapping("/savefournisseur")
    public void createFournisseur(Fournisseur fournisseur){
        fournisseurRepository.save(fournisseur);
    }
//("/edit")
    @PutMapping("/updatefournisseur")
    public void updateFournisseur( Fournisseur fournisseur){
        fournisseurRepository.save(fournisseur);
    }

    @DeleteMapping("/{id}")
    public boolean deleteFournisseur(@PathVariable Long id){
        fournisseurRepository.deleteById(id);
        return true;
    }

}
