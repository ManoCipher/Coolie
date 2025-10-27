package com.coolie.service;

import com.coolie.model.CoolieAttendance;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttendanceSevai {
    private final List<CoolieAttendance> attendanceList = new ArrayList<>();

    public CoolieAttendance markAttendance(Long coolieId, String status) {
        CoolieAttendance record = new CoolieAttendance(coolieId, LocalDate.now(), status);
        attendanceList.add(record);
        return record;
    }

    public List<CoolieAttendance> getAttendanceByCoolie(Long coolieId) {
        return attendanceList.stream()
                .filter(a -> a.getCoolieId().equals(coolieId))
                .collect(Collectors.toList());
    }

    public List<CoolieAttendance> getAllAttendance() { return attendanceList; }
}
