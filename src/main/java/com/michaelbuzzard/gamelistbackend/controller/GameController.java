package com.michaelbuzzard.gamelistbackend.controller;


import com.michaelbuzzard.gamelistbackend.entity.Game;
import com.michaelbuzzard.gamelistbackend.service.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class GameController {

    private GameService gameService;

    @GetMapping("/users/{username}/games")
    public List<Game> getAllGames(@PathVariable String username) {
        return gameService.findAllGames();
    }

    @GetMapping("/users/{username}/games/{id}")
    public Game getGame(@PathVariable String username, @PathVariable long id) {
        return gameService.findbyId(id);
    }

    @DeleteMapping("/users/{username}/games/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable String username, @PathVariable long id) {
        Game game = gameService.deleteGame(id);
        if(game != null) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
