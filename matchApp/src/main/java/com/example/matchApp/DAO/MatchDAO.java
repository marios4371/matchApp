package com.example.matchApp.DAO;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.matchApp.model.Match;


@Repository
public interface MatchDAO extends JpaRepository<Match, Integer> {
	List<Match> findByDescription(String description);
}
