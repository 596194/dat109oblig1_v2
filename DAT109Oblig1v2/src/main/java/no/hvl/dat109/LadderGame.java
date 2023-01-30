package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

public class LadderGame {

    private ArrayList<Player> players = new ArrayList<>();
    private Dice dice = new Dice();
    private Board board = new Board();

    public void play(){
        Board board=new Board();
        addPlayers();


        for (int i=0;i<20;i++){
            playRound();
        }
        /*
        while(!winner){
            playRound();
        }

        */
    }

    public void playRound(){
        for(Player player : players){
            player.playMove(dice);
        }

    }
    //list of players, not string
    //set number of players & add players to a ArrayList
    public ArrayList<Player> addPlayers(){


        //set number of players
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("number of players?");
        int numberOfPlayers=scanNumber.nextInt();

        while(players.size()<numberOfPlayers){

//            register player name
            Player player = new Player();
            Scanner scanName = new Scanner(System.in);
            System.out.println("Player name");

            player.setName(scanName.nextLine());
//            players.add(name);

//            register player piece
            Scanner scanPiece=new Scanner(System.in);
            System.out.println("Choose piece");
            String colour=scanPiece.nextLine();

            Tile tile=new StartTile();
            Piece piece=new Piece(colour, tile);
            player.setPiece(piece);

//            add player to array
            players.add(player);
        }
        System.out.println(players.toString());
        return players;
    }




}
