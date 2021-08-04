package com.michaelbuzzard.gamelistbackend.entity;

import javax.persistence.*;
import java.util.Objects;


@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String name;
    private String console;
    private String isComplete;


    public Game() {
    }

    public Game(long id, String username, String name, String console, String isComplete) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.console = console;
        this.isComplete = isComplete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() { return username;}

    public void setUsername(String username) { this.username = username;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public String getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(String complete) {
        isComplete = complete;
    }


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", console='" + console + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return id.equals(game.id) && username.equals(game.username) && name.equals(game.name) && console.equals(game.console) && isComplete.equals(game.isComplete);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, name, console, isComplete);
    }
}
