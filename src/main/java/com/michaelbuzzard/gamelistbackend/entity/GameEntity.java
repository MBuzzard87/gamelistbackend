package com.michaelbuzzard.gamelistbackend.entity;

public class GameEntity {

    private long id;
    private String username;
    private String description;
    private boolean isComplete;


    public GameEntity(long id, String username, String description, boolean isComplete) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.isComplete = isComplete;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
