package com.example.designpattern.tictactoe.models;

import ch.qos.logback.core.joran.sanity.Pair;

public class Bot extends Player {

    private BotPlayingStrategy botPlayingStrategy;

    public Bot(char symbol,String name,BotLevel botLevel){
        super(symbol,name);
        this.botLevel=botLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(botLevel);
    }

    private BotLevel botLevel;
    @Override
    Pair<Integer, Integer> makeMove(Board board) {
        System.out.println("Bot is making it's move, beware!");
        return botPlayingStrategy.makeMove(board);
    }
}
