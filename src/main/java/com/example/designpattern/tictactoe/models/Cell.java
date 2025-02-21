package com.example.designpattern.tictactoe.models;

public class Cell {
    private int x;
    private int y;

    public Cell(int x,int y){
        this.x=x;
        this.y=y;
    }

    public void print(){
        if(player != null){
            System.out.print(" " + player.getSymbol() + " ");
        }
        else {
            System.out.print(" _ ");
        }
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private Player player;
}
