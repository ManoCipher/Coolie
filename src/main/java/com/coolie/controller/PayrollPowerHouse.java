package com.coolie.controller;

import com.coolie.model.CooliePayroll;
import com.coolie.service.PayrollSevai;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payroll")
public class PayrollPowerHouse {
    private final PayrollSevai service;

    public PayrollPowerHouse(PayrollSevai service) {
        this.service = service;
    }

    @PostMapping("/{coolieId}")
    public CooliePayroll generatePayroll(@PathVariable Long coolieId,
                                         @RequestParam double salary,
                                         @RequestParam double bonus,
                                         @RequestParam double deductions) {
        return service.generatePayroll(coolieId, salary, bonus, deductions);
    }

    @GetMapping("/{coolieId}")
    public List<CooliePayroll> getPayroll(@PathVariable Long coolieId) {
        return service.getPayrollByCoolie(coolieId);
    }

    @GetMapping
    public List<CooliePayroll> getAllPayroll() { return service.getAllPayroll(); }
}

