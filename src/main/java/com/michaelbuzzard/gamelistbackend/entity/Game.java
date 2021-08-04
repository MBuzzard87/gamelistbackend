package com.michaelbuzzard.gamelistbackend.entity;

import javax.persistence.*;



@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String name;
    private String console;
    private boolean isComplete;


    public Game() {
    }

    public Game(long id, String username, String name, String console, boolean isComplete) {
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

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean complete) {
        isComplete = complete;
    }


    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", console='" + console + '\'' +
                ", isComplete=" + isComplete +
                '}';
    }
}
