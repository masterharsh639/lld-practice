package com.example.designpattern.tictactoe.controllers;

import com.example.designpattern.tictactoe.Exceptions.InvalidBotCountException;
import com.example.designpattern.tictactoe.models.Game;
import com.example.designpattern.tictactoe.models.Player;

import java.util.List;

public class GameController {
    public Game createGame(List<Player> players) throws InvalidBotCountException {
        Game game = Game.getBuilder()
                .setPlayers(playerList)
                .build();
        return game;
    }

    public void getGameStatus(Game game){

    }
}
