package no.hvl.dat109;

import java.util.Scanner;

public class Player {

    private String name;
    private Piece piece;

    Dice dice=new Dice();

    public Player(){}

//    public Player(String name, Piece piece) {
//        this.name = name;
//        this.piece = piece;
//    }


    public void playMove(Board board){
        Scanner roll = new Scanner(System.in);
        System.out.println("Active player is " + name +
                            ", press enter to roll dice.");
        roll.nextLine();


        piece.setTile(board.move(piece.getTile(), dice.throwDice()));

//        Tile newTile = piece.getTile();
//        newTile=board.move(newTile,dice.throwDice());
//
//        piece.setTile(newTile);
//
//        System.out.println("New placement is tile #" + newTile);

    }

//    public String getName() {
//        return name;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public Piece getPiece() {
//        return piece;
//    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", piece=" + piece.toString() +
                '}';
    }
}
