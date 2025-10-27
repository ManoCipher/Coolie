package com.coolie.service;

import com.coolie.model.Coolie;
import com.coolie.repository.CoolieGoodDown;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CoolieSevai {
    private final CoolieGoodDown repository;

    public CoolieSevai(CoolieGoodDown repository) {
        this.repository = repository;
    }

    public List<Coolie> getAllCoolies() {
        return repository.findAll();
    }

    public Coolie saveCoolie(Coolie coolie) {
        return repository.save(coolie);
    }
}
