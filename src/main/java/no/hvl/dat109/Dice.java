package no.hvl.dat109;

public class Dice {

    public Dice() {}

    public Integer throwDice(){
        int sum=(int) Math.floor(Math.random() * 6 + 1);
        System.out.println("Dice roll = " + sum);
        return sum;

    }
}
