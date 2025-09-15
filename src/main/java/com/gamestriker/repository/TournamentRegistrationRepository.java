package com.gamestriker.repository;

import com.gamestriker.model.TournamentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRegistrationRepository extends JpaRepository<TournamentRegistration, Long> {
}
