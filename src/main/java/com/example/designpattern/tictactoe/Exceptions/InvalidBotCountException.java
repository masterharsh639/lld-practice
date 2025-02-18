package com.example.designpattern.tictactoe.Exceptions;

public class InvalidBotCountException extends Exception{

    public InvalidBotCountException(String message){
        super(message);
    }
}