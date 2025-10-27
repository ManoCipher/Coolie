package com.coolie.model;

import java.time.LocalDate;

public class CoolieAttendance {
    private Long coolieId;
    private LocalDate date;
    private String status; // Present, Absent, etc.

    public CoolieAttendance() {}

    public CoolieAttendance(Long coolieId, LocalDate date, String status) {
        this.coolieId = coolieId;
        this.date = date;
        this.status = status;
    }

    // Getters and setters
    public Long getCoolieId() { return coolieId; }
    public void setCoolieId(Long coolieId) { this.coolieId = coolieId; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
