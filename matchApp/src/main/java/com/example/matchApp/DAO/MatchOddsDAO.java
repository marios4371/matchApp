package com.example.matchApp.DAO;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.matchApp.model.MatchOdd;

@Repository
public interface MatchOddsDAO extends JpaRepository<MatchOdd, Integer> {
	
}
