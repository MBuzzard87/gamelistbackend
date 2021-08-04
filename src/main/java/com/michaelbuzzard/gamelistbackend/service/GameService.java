package com.michaelbuzzard.gamelistbackend.service;

import com.michaelbuzzard.gamelistbackend.entity.Game;
import com.michaelbuzzard.gamelistbackend.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }


//    public Game findbyId(Long id) {
//        return null;
//    }
//
//    public Game deleteGame(Long id) {
//        return null;
//    }
}
