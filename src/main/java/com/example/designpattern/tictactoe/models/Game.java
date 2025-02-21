package com.example.designpattern.tictactoe.models;

import com.example.designpattern.tictactoe.Exceptions.InvalidBotCountException;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private  Board board;
    private List<Player> players;
    private int currentPlayerIdx;
    private GameStatus gameStatus;
    private List<Move> moves;

    static class GameBuilder{
        private List<Player> players;

        private Game(GameBuilder gameBuilder){
            this.players=gameBuilder.players;
            int n =players.size();
            int currentPlayerIndx=0;
            this.moves = new ArrayList<>();
            this.gameStatus=GameStatus.IN_PROGRESS;
        }
        public GameBuilder setPlayer(List<Player> players) {
            this.players = players;
            return this;
        }

        public Game build() throws InvalidBotCountException{
            int botCount=0;
            for(Player player:players) {
                if(player instanceof Bot){
                    botCount++;
                }
                if(botCount>1){
                    throw new InvalidBotCountException("Al max only 1 player is allowed");
                }
            }
            return new Game();
        }
    }
}
