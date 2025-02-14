package com.example.designpattern.tictactoe.models;

import java.util.List;

public class Game {
    private  Board board;
    private List<Player> players;
    private int currentPlayerIdx;
    private GameStatus gameStatus;
    private List<Move> moves;

    static class GameBuilder{
        private List<Player> players;
        public GameBuilder setPlayer(List<Player> players){
            this.players=players;
            return this;
        }
    }
}
