package no.hvl.dat109;

public class Dice {

    public Integer throwDice(){
        return (int) Math.floor(Math.random() * 6 + 1);
    }
}
