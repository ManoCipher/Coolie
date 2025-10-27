package com.coolie.service;

import com.coolie.model.CooliePayroll;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PayrollSevai {
    private final List<CooliePayroll> payrollList = new ArrayList<>();

    public CooliePayroll generatePayroll(Long coolieId, double salary, double bonus, double deductions) {
        CooliePayroll payroll = new CooliePayroll(coolieId, salary, bonus, deductions);
        payrollList.add(payroll);
        return payroll;
    }

    public List<CooliePayroll> getPayrollByCoolie(Long coolieId) {
        return payrollList.stream()
                .filter(p -> p.getCoolieId().equals(coolieId))
                .collect(Collectors.toList());
    }

    public List<CooliePayroll> getAllPayroll() { return payrollList; }
}
