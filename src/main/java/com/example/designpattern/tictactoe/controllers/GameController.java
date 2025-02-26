package com.example.designpattern.tictactoe.controllers;

import ch.qos.logback.core.joran.sanity.Pair;
import com.example.designpattern.tictactoe.Exceptions.InvalidBotCountException;
import com.example.designpattern.tictactoe.models.Game;
import com.example.designpattern.tictactoe.models.GameStatus;
import com.example.designpattern.tictactoe.models.Player;
import java.util.List;

public class GameController {
    public Game createGame(List<Player> players) throws InvalidBotCountException {
        Game game = Game.getBuilder()
                .setPlayers(playerList)
                .build();
        return game;
    }

    public GameStatus getGameStatus(Game game){
        return game.getGameStatus();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }
}
