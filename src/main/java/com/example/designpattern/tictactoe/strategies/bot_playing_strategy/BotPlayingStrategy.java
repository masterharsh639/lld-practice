package com.example.designpattern.tictactoe.strategies.bot_playing_strategy;

import ch.qos.logback.core.joran.sanity.Pair;
import com.example.designpattern.tictactoe.models.Board;

public interface BotPlayingStrategy {
    public Pair<Integer, Integer> makeMove(Board board);
}
