package com.example.library.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
@Data
public class library_log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long logId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private users user;

    private LocalDateTime inTime;
    private LocalDateTime outTime;q

    public Duration getDuration() {
        if (inTime != null && outTime != null) {
            return Duration.between(inTime, outTime);
        }
        return null;
    }
}
