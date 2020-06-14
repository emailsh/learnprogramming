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
            System.out.println("Your final score was " + finalScore);
            return 1;
        }
        return -1;
    }
}
