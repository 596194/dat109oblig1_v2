package no.hvl.dat109;

import java.util.ArrayList;

public class Board {

    private final static Integer NUMBER_OF_TILES=100;
    private ArrayList<Tile> tiles = new ArrayList<>(NUMBER_OF_TILES);
    private final static Integer START_TILE = 1;
    private final static Integer FINISH_TILE = 100;

//    private final static Integer "snakes and ladders" = 29;

    public Board() {
        Tile tile = null;
        for (Integer pos = 0; pos < NUMBER_OF_TILES; pos++) {
            if (pos == START_TILE) {
                tile = new StartTile();
            }
            else if (pos == FINISH_TILE) {
                tile = new FinishTile();
            }
//            else if (pos == snakes and ladders) {
//                tile = new snake or ladder tile();
//            }
            else {
                tile = new NormalTile();
            }
            tiles.add(tile);
        }
        System.out.println(tiles.toString());
    }


    public Tile move(Tile tile, Integer sum){

        int index=tiles.indexOf(tile);
        int newIndex=(index+sum);
        System.out.println("newindex: " + newIndex);
//        new index .set

        if((newIndex+2)>100){
//            System.out.println("newindex+2=" + newIndex+2);
            System.out.println(99-(sum-99+index));
            return tiles.get(99-(sum-99+index));
//            new tile=100-(diceResult-100+oldTile);

        }
        else if((newIndex+2)==100){
            return tiles.get(newIndex);
//            win

        }
            System.out.println("landing on tile: " + (newIndex+2));

            return tiles.get(newIndex);



    }
//
//
//            if 100-oldTile=diceResult
//              win
//
//            else
//              new tile=100-(diceResult-100+oldTile);

}


















