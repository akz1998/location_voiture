package com.example.locationvoiture.repo;

import com.example.locationvoiture.entity.User;
import com.example.locationvoiture.entity.Voiture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoitureRepo extends CrudRepository<Voiture,Long> {
}
