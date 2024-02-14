package com.example.locationvoiture.service;

import com.example.locationvoiture.entity.Voiture;
import com.example.locationvoiture.repo.VoitureRepo;

import java.util.List;

public interface VoitureService {
    public Voiture ajouterVoiture (Voiture voiture);
    public Voiture updateVoiture(Voiture voiture);
    public Voiture getVoitureById(long IdVoiture);
    public List<Voiture> getAllVoitures();
    public void deleteVoiture(long IdVoiture);
}
