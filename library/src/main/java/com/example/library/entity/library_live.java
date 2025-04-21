package com.example.library.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class library_live {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long liveId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalDateTime inTime;
}
