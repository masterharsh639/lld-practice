package com.example.designpattern.tictactoe.models;

public abstract class Player {
    private String name;
    protected char symbol;

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
