package com.gamestriker.repository;

import com.gamestriker.entity.Tournament;
import com.gamestriker.entity.TournamentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TournamentRegistrationRepository extends JpaRepository<TournamentRegistration, Long> {
    List<TournamentRegistration> findByTournament(Tournament tournament);
}
