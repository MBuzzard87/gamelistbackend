package com.michaelbuzzard.gamelistbackend.controller;


import com.michaelbuzzard.gamelistbackend.entity.Game;
import com.michaelbuzzard.gamelistbackend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/users/games")
    public List<Game> getAllGames() {
        return gameService.findAllGames();
    }

//    @GetMapping("/users/{username}/games/{id}")
//    public Game getGame(@PathVariable String username, @PathVariable long id) {
//        return gameService.findbyId(id);
//    }
//
//    @DeleteMapping("/users/{username}/games/{id}")
//    public ResponseEntity<Void> deleteGame(@PathVariable String username, @PathVariable long id) {
//        Game game = gameService.deleteGame(id);
//        if(game != null) {
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }


}
