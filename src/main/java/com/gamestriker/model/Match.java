package com.gamestriker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "matches")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Tournament tournament;

    private Integer roundNumber;

    private Long player1Id;
    private Long player2Id;

    private Integer score1;
    private Integer score2;

    private Long winnerId;

    @Enumerated(EnumType.STRING)
    private MatchStatus status = MatchStatus.PENDING;

    private LocalDateTime createdAt = LocalDateTime.now();

    enum MatchStatus { PENDING, FINISHED }

}
