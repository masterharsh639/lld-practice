package com.example.designpattern.tictactoe.models;

import ch.qos.logback.core.joran.sanity.Pair;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(char Symbol,String name){
        super(symbol,name);
    }

    @Override
    Pair<Integer, Integer> makeMove(Board board) {
        return null;
    }

    @Override
    Pair<Integer,Integer> makeMove() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value x : ");
        int x = scan.nextInt();
        System.out.println("Enter the value y : ");
        int y = scan.nextInt();
        return new Pair<x,y>();
    }

    void undo(){

    }
}
