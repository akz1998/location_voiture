package com.example.locationvoiture.service;
import com.example.locationvoiture.entity.Role;
import com.example.locationvoiture.entity.User;
import com.example.locationvoiture.entity.Voiture;
import com.example.locationvoiture.repo.UserRepo;
import com.example.locationvoiture.repo.VoitureRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class VoitureServiceIMPL  implements  VoitureService{
    @Autowired
    VoitureRepo vr ;
    @Override
    public Voiture ajouterVoiture(Voiture voiture) {
        return vr.save(voiture);
    }

    @Override
    public Voiture updateVoiture(Voiture voiture) {
        Long id = voiture.getIdVoiture();
        if (vr.existsById(id)) {
            return vr.save(voiture);
        } else {

            return null;
        }    }

    @Override
    public Voiture getVoitureById(long IdVoiture) {
        return vr.findById(IdVoiture).orElse(null);
    }

    @Override
    public List<Voiture> getAllVoitures() {
        return (List<Voiture>) vr.findAll();
    }

    @Override
    public void deleteVoiture(long IdVoiture) {
        vr.deleteById(IdVoiture);
    }
}
