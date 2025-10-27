package com.coolie.controller;

import com.coolie.model.Coolie;
import com.coolie.service.CoolieSevai;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/coolies")
@CrossOrigin(origins = "*")
public class CooliePowerHouse {
    private final CoolieSevai sevai;

    public CooliePowerHouse(CoolieSevai sevai) {
        this.sevai = sevai;
    }

    @GetMapping
    public List<Coolie> getAllCoolies() {
        return sevai.getAllCoolies();
    }

    @PostMapping
    public Coolie addCoolie(@RequestBody Coolie coolie) {
        return sevai.saveCoolie(coolie);
    }
}
