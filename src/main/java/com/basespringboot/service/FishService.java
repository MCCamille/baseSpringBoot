package com.basespringboot.service;

import com.basespringboot.dto.FishDTO;
import com.basespringboot.entity.Fish;
import com.basespringboot.repository.FishRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("unused")
@Service
public class FishService {

    private final FishRepository fishRepository;

    public FishService(FishRepository fishRepository) {
        this.fishRepository = fishRepository;
    }

    // Créer un poisson
    public FishDTO createFish(FishDTO fishDTO) {

        Fish fish = new Fish();

        fish.setName(fishDTO.getName());

        Fish savedFish = fishRepository.save(fish);

        return convertToDTO(savedFish);
    }

    // Récupérer un poisson par son ID
    public FishDTO getFish(Long id) {

        Fish fish = fishRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fish not found"));

        return convertToDTO(fish);
    }

    // Récupérer tous les poissons
    public List<FishDTO> getAllFish() {

        return fishRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .toList();
    }

    // Convertir une entité Fish en FishDTO
    private FishDTO convertToDTO(Fish fish) {

        FishDTO dto = new FishDTO();

        dto.setId(fish.getId());
        dto.setName(fish.getName());
        dto.setHunger(fish.getHunger());
        dto.setThirst(fish.getThirst());
        dto.setSleep(fish.getSleep());
        dto.setMentalHealth(fish.getMentalHealth());
        dto.setMoney(fish.getMoney());
        dto.setCurrentDay(fish.getCurrentDay());
        dto.setAlive(fish.isAlive());
        dto.setDied(fish.isDied());

        return dto;
    }
}
