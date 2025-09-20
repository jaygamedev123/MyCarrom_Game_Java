package com.gamestriker.repository;

import com.gamestriker.model.Tournament;
import com.gamestriker.model.TournamentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TournamentRegistrationRepository extends JpaRepository<TournamentRegistration, Long> {
    List<TournamentRegistration> findByTournament(Tournament tournament);
}
