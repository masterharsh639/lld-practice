package com.example.designpattern.tictactoe.models;

import java.util.List;

public class Game {
    private  Board board;
    private List<Player> players;
    private int currentPlayerIdx;
    private GameStatus gameStatus;
    private List<Move> moves;

    static class GameBuilder{
        private  Board board;
        private List<Player> players;
        private int currentPlayerIdx;
        private GameStatus gameStatus;
        private List<Move> moves;
    }
}
