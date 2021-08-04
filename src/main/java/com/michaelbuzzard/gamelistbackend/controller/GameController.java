package com.michaelbuzzard.gamelistbackend.controller;


import com.michaelbuzzard.gamelistbackend.entity.Game;
import com.michaelbuzzard.gamelistbackend.repository.GameRepository;
import com.michaelbuzzard.gamelistbackend.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class GameController {

//    @Autowired
//    private GameService gameService;

    @Autowired
    private GameRepository gameRepository;

    @GetMapping(path ="Buzzywuzzy87/games")
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }



//    @GetMapping("/{username}/games/{id}")
//    public Game getGame(@PathVariable String username, @PathVariable long id) {
//        return gameService.findbyId(id);
//    }
//
//    @DeleteMapping("/{username}/games/{id}")
//    public ResponseEntity<Void> deleteGame(@PathVariable String username, @PathVariable long id) {
//        ResponseEntity response = gameService.deleteGame(id);
//
//        return response;
//    }
//
//    @PutMapping("/{username}/games/{id}")
//    public ResponseEntity<Game> updateGame(@PathVariable String username, @PathVariable long id, @RequestBody Game game) {
//        Game updateGame = gameService.updateGame(game);
//        return new ResponseEntity<>(game, HttpStatus.OK);
//    }
//
//    @PostMapping("/users/{username}/games")
//    public ResponseEntity<Void> createGame(@PathVariable String username, @RequestBody Game game) {
//        Game gameCreated = gameService.createGame(game);
//
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(gameCreated.getId()).toUri();
//
//        return ResponseEntity.created(uri).build();
//    }
}
