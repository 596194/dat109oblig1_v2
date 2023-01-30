package no.hvl.dat109;

import java.util.ArrayList;
import java.util.Scanner;

public class LadderGame {

    private ArrayList<Player> players;
    private Board board = new Board();
    private boolean won=false;

    public LadderGame(){
        players=new ArrayList<>();
//        board=new Board();

    }


//    public LadderGame(ArrayList<Player> players, Board board){
//        this.players=players;
//        this.board=board;
//    }


    public void play(){
//        board=new Board();
        players = addPlayers();
//        board.toString();
//        players.toString();

//        while(won=false){
//            playRound();
//        }
        for(int i=0;i<20;i++){
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
            player.playMove(board);
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

//            Tile tile=new StartTile();
            Piece piece=new Piece(colour);
            player.setPiece(piece);

//            add player to array
            players.add(player);
        }
        System.out.println(players);
        return players;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    public boolean isWon() {
        return won;
    }
}
