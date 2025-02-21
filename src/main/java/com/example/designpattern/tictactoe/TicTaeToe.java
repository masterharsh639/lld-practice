package com.example.designpattern.tictactoe;

import com.example.designpattern.tictactoe.controllers.GameController;
import com.example.designpattern.tictactoe.models.Bot;
import com.example.designpattern.tictactoe.models.BotLevel;
import com.example.designpattern.tictactoe.models.HumanPlayer;
import com.example.designpattern.tictactoe.models.Player;

import java.util.Scanner;

public class TicTaeToe {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number of Player:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Player name");
            String name = scanner.next();
            System.out.println("Enter Symbol");
            char symbol = scanner.next().charAt(0);
            Player humanPlayer = new HumanPlayer(symbol,name);
            playerList.add(humanPlayer);
        }
        System.out.println("Are bots going to play? (Y/N)");
        char level = scanner.next().charAt(0);
        BotLevel botLevel = BotLevel.EASY;
        if(level == 'E'){
            botLevel = BotLevel.EASY;
        }
        if(level == 'M'){
            botLevel = BotLevel.MEDIUM;
        }
        if(level == 'H'){
            botLevel = BotLevel.HARD;
        }
        playerList.add(new Bot('B', "Bot - 1", botLevel));
    }
    gameController.createGame(playerList);
}
