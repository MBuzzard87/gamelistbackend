package com.michaelbuzzard.gamelistbackend.service;

import com.michaelbuzzard.gamelistbackend.entity.Game;
import com.michaelbuzzard.gamelistbackend.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<Game> findAllGames(String username) {
        return gameRepository.findAll();
    }


    public Game findbyId(Long id) {
        return gameRepository.getById(id);
    }

    public ResponseEntity<Void> deleteGame(Long id) {
        gameRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    public Game updateGame(Game game) {
        Game gameUpdated = gameRepository.save(game);
        return gameUpdated;
    }

    public Game createGame(Game game) {
        Game gameCreated = gameRepository.save(game);

        return gameCreated;
    }
}
