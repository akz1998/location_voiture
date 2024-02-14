package com.example.locationvoiture.controller;

import com.example.locationvoiture.entity.Voiture;
import com.example.locationvoiture.service.VoitureService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
@AllArgsConstructor
@RestController
@RequestMapping("/Voiture")
public class VoitureController {
     private VoitureService vs;

    @PostMapping("/addVoiture")
    public Voiture addVoiture (@RequestBody Voiture v){
        return vs.ajouterVoiture(v);
    }
    @GetMapping("/getVoitures")
    public Iterable<Voiture> getAllChambres(){
        return vs.getAllVoitures();
    }
    @GetMapping("/getVoitureById/{id}")
    public Voiture getAllVoitureByID(@PathVariable int id){
        return vs.getVoitureById(id);
    }
    @DeleteMapping("/deleteVoiture/{id}")
    public void deleteVoiture(@PathVariable int id){
        vs.deleteVoiture(id);
    }
    @PatchMapping("/updateVoiture")
    public Voiture updateVoiture(@RequestBody Voiture v){
        return vs.updateVoiture(v);
    }
}
