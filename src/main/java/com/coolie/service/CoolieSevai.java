package com.coolie.service;

import com.coolie.model.Coolie;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CoolieSevai {
    private final Map<Long, Coolie> coolieMap = new HashMap<>();

    public List<Coolie> getAllCoolies() {
        return new ArrayList<>(coolieMap.values());
    }

    public Coolie getCoolieById(Long id) {
        return coolieMap.get(id);
    }

    public Coolie addCoolie(Coolie e) {
        coolieMap.put(e.getId(), e);
        return e;
    }

    public Coolie updateCoolie(Long id, Coolie e) {
        coolieMap.put(id, e);
        return e;
    }

    public void deleteCoolie(Long id) {
        coolieMap.remove(id);
    }
}
