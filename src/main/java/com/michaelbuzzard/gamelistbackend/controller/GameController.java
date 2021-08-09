package com.michaelbuzzard.gamelistbackend.controller;


import com.michaelbuzzard.gamelistbackend.entity.Game;
import com.michaelbuzzard.gamelistbackend.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/{username}/games")
    public List<Game> getAllGames(@PathVariable String username) {
        return gameRepository.findByUsername(username);
    }

    @GetMapping("{username}/games/{id}")
    public Game getGame(@PathVariable long id) {
        return gameRepository.findById(id).get();
    }

    @DeleteMapping("/{username}/games/{id}")
    public ResponseEntity<Void> deleteGame(@PathVariable String username, @PathVariable long id) {
        gameRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }

    @PutMapping("{username}/games/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable String username, @PathVariable long id, @RequestBody Game game) {
        gameRepository.save(game);

        return new ResponseEntity<>(game, HttpStatus.OK);
    }

    @PostMapping("{username}/createGame")
    public ResponseEntity<Void> createGame(@PathVariable String username,@RequestBody Game game) {
        game.setUsername(username);
        Game createdGame = gameRepository.save(game);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdGame.getId()).toUri();

        return ResponseEntity.created(uri).build();

    }
}
