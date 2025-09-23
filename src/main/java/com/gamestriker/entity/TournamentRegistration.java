package com.gamestriker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "tournament_registrations", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"tournament_id", "player_id"})})
public class TournamentRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime registeredAt;
    @ManyToOne(optional = false)
    private Tournament tournament;
    @ManyToOne(optional = false)
    private Players players;

    public Players getPlayer() {
        return players;
    }
}
