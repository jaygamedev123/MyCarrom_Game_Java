package com.gamestriker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="tournaments")
public class Tournament {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID tournamentId;
    @Column(nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private TournamentStatus status = TournamentStatus.DRAFT;
    private String TournamentType;
    private LocalDateTime startAt;
    private LocalDateTime createAt;
    private boolean started = false;

    @OneToMany(mappedBy = "tournament", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TournamentRegistration> registration = new ArrayList<>();
    public enum TournamentStatus {DRAFT, REGISTRATION_OPEN, ONGOING, CANCELED}

}
