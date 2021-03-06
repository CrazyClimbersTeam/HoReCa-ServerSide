package com.crazyclimbers.repository;

import com.crazyclimbers.model.Proposition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PropositionRepository extends JpaRepository<Proposition, Long> {
    List<Proposition> findAll();
}