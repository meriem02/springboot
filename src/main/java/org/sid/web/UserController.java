package org.sid.web;

import lombok.Data;
import net.bytebuddy.asm.Advice;
import org.sid.dao.*;
import org.sid.entities.*;
import org.sid.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
@RestController
public class UserController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private DemandeRepository demandeRepository;
    @Autowired
    private HistoriqueRepository historiqueRepository;
    @Autowired
    private DemandeAdminRepository demandeAdminRepository;
    @Autowired
    private DemandeStockRepository demandeStockRepository;

    @Autowired
    private EquipementRepository equipementRepository;
    @Autowired
    @GetMapping("/Users")
    public List<AppUser> getAllUsers (){
        return appUserRepository.findAll();
    }
    @GetMapping("/demanded")
    public  List<DemandeRep> getAllDemandes (){
        return demandeRepository.findAll();
   }
    @GetMapping("/equipe")
    public  List<Equipement> getAllEquipements (){return equipementRepository.findAll();
    }
    @GetMapping("/stock")
    public  List<DzmandeStock> getAllStocks (){return demandeStockRepository.findAll();
    }

    @GetMapping("/demandead")
    public  List<DemandeAdmin> getAllDemandead (){
        return demandeAdminRepository.findAll();
    }

    @GetMapping("/historique")
    public  List<Historique> getAllHistoriques (){return historiqueRepository.findAll();
    }
    @GetMapping("/demande/{id}")
    public ResponseEntity<DemandeRep> getDemandeRepById(@PathVariable Long id) {
        DemandeRep demandeRep = demandeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Demandes not exist with id :" + id));
        return ResponseEntity.ok(demandeRep);
    }
    @PostMapping("/a")
    public DemandeAdmin a(@RequestBody DemandeAdmin demandeAdmin) {return  demandeAdminRepository.save(demandeAdmin);
    }
    @PostMapping("/d")
    public DzmandeStock d(@RequestBody DzmandeStock dzmandeStock) {return  demandeStockRepository.save(dzmandeStock);
    }
    @PostMapping("/equipement")
    public Equipement equipement(@RequestBody Equipement equipement) {return  equipementRepository.save(equipement);
    }
    @PostMapping("/add")
    public DemandeRep add(@RequestBody DemandeRep demandeRep)
    {
        return  demandeRepository.save(demandeRep);
    }

    @PostMapping("/ajouter")
    public Historique ajouter(@RequestBody Historique historique){return  historiqueRepository.save(historique);
    }
    @PostMapping("/register")
    public AppUser register(@RequestBody  UserForm userForm){
        return  accountService.saveUser(
                userForm.getUsername(),userForm.getPassword(),userForm.getConfirmedPassword(),userForm.getEmail(), userForm.getNom(), userForm.getPrenom(), userForm.getTel());
    }
    @GetMapping("/User/{username}")
    public ResponseEntity<AppUser> getUserByUsername(@PathVariable String username) {
        AppUser appUser = appUserRepository.findByUsername(username);
        if(appUser==null) throw new UsernameNotFoundException("User doesn't exist with username "+ username);
        return ResponseEntity.ok(appUser);
    }

    @PutMapping("/update/{username}")
    public ResponseEntity<AppUser> updateServor(@PathVariable String username, @RequestBody AppUser userDetails ){
        AppUser appUser = appUserRepository.findByUsername(username);


        appUser.setUsername(userDetails.getUsername());
        appUser.setEmail(userDetails.getEmail());

      AppUser updatedServor = appUserRepository.save(appUser);
        return ResponseEntity.ok(updatedServor);
    }
    @DeleteMapping ("/delete/{username}")
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable String username){
        AppUser appUser = appUserRepository.findByUsername(username);


       appUserRepository.delete(appUser);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping ("/deleted/{id}")
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable long id){
        DemandeRep demandeRep = demandeRepository.findById(id);


        demandeRepository.delete(demandeRep);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}

@Data
class UserForm{
    private String username;
    private String password;
    private String confirmedPassword;
    private String email;
    private  String nom;
    private  String prenom;
    private  String tel;
}
