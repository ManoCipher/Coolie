package com.coolie.controller;

import com.coolie.model.CoolieAttendance;
import com.coolie.model.CooliePayroll;
import com.coolie.service.AttendanceSevai;
import com.coolie.service.PayrollSevai;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportPowerHouse {
    private final AttendanceSevai attendanceSevai;
    private final PayrollSevai payrollSevai;

    public ReportPowerHouse(AttendanceSevai attendanceSevai, PayrollSevai payrollSevai) {
        this.attendanceSevai = attendanceSevai;
        this.payrollSevai = payrollSevai;
    }

    @GetMapping("/attendance")
    public List<CoolieAttendance> attendanceReport() {
        return attendanceSevai.getAllAttendance();
    }

    @GetMapping("/payroll")
    public List<CooliePayroll> payrollReport() {
        return payrollSevai.getAllPayroll();
    }
}

