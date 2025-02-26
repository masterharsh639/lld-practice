package com.example.designpattern.tictactoe.strategies.winning_strategy;

import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements PlayerWonStrategy {

    List<HashMap<Character, Integer>> rowMaps;
    List<HashMap<Character, Integer>> colMaps;
    HashMap<Character, Integer> diagonalMap;
    HashMap<Character, Integer> reverseDiagonalMap;
    int size;


    @Override
    public boolean checkIfWon() {
        return false;
    }
}
