package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here'
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true,800,5,100);
        System.out.println(cal(false,800,5,100));

        displayHighScorePosition("James",5);
        System.out.println(calculateHighScorePosition(1500));
        System.out.println(calculateHighScorePosition(900));
        System.out.println(calculateHighScorePosition(400));
        System.out.println(calculateHighScorePosition(50));
    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
    //Methods!!!void if you dont want to return anything
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int cal(boolean gameOver,int score,int levelCompleted,int bonus){
        if(!gameOver){
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playername, int position){
        System.out.println(playername + "managed to get into position " + position + "on the high score table");

    }
    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }
        else if (score >=500){
            return 2;
        }
        else if(score >100){
            return 3;
        }
        else{
            return 4;
        }
    }
}


