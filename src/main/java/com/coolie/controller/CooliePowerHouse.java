package com.coolie.controller;

import com.coolie.model.Coolie;
import com.coolie.service.CoolieSevai;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coolie")
@CrossOrigin(origins = "*") // allow React team to connect later
public class CooliePowerHouse {

    private final CoolieSevai service;

    public CooliePowerHouse(CoolieSevai service) {
        this.service = service;
    }

    @GetMapping
    public List<Coolie> getAllCoolies() {
        return service.getAllCoolies();
    }

    @GetMapping("/{id}")
    public Coolie getCoolie(@PathVariable Long id) {
        return service.getCoolieById(id);
    }

    @PostMapping
    public Coolie addCoolie(@RequestBody Coolie e) {
        return service.addCoolie(e);
    }

    @PutMapping("/{id}")
    public Coolie updateCoolie(@PathVariable Long id, @RequestBody Coolie e) {
        return service.updateCoolie(id, e);
    }

    @DeleteMapping("/{id}")
    public void deleteCoolie(@PathVariable Long id) {
        service.deleteCoolie(id);
    }
}
