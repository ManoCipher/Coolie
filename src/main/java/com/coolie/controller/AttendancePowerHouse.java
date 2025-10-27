package com.coolie.controller;

import com.coolie.model.CoolieAttendance;
import com.coolie.service.AttendanceSevai;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attendance")
public class AttendancePowerHouse {
    private final AttendanceSevai service;

    public AttendancePowerHouse(AttendanceSevai service) {
        this.service = service;
    }

    @PostMapping("/{coolieId}")
    public CoolieAttendance markAttendance(@PathVariable Long coolieId, @RequestParam String status) {
        return service.markAttendance(coolieId, status);
    }

    @GetMapping("/{coolieId}")
    public List<CoolieAttendance> getAttendance(@PathVariable Long coolieId) {
        return service.getAttendanceByCoolie(coolieId);
    }

    @GetMapping
    public List<CoolieAttendance> getAllAttendance() { return service.getAllAttendance(); }
}
