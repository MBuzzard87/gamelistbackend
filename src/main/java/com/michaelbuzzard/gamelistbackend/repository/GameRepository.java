package com.michaelbuzzard.gamelistbackend.repository;


import com.michaelbuzzard.gamelistbackend.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

    List<Game> findByUsername(String username);


}
