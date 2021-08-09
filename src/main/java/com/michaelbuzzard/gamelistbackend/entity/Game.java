package com.michaelbuzzard.gamelistbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String name;
    private String console;
    private String status;


    public Game(){
    }

    public Game(long id,String username,String name,String console,String status){
        this.id=id;
        this.username=username;
        this.name=name;
        this.console=console;
        this.status=status;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getUsername(){return username;}

    public void setUsername(String username){this.username=username;}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getConsole(){
        return console;
    }

    public void setConsole(String console){
        this.console=console;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String complete){
        this.status=complete;
    }

    @Override
    public String toString(){
        return"Game{"+
                "id="+id+
                ",username='"+username+'\''+
                ",name='"+name+'\''+
                ",console='"+console+'\''+
                ",status="+status+
                '}';
    }


}
