package com.example.designpattern.tictactoe.models;

import ch.qos.logback.core.joran.sanity.Pair;

public abstract class Player {
    private String name;
    protected char symbol;

    public Player(char symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }

    abstract Pair<Integer, Integer> makeMove(Board board);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    abstract void makeMove();
}
