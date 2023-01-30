package no.hvl.dat109;

import java.util.ArrayList;

public class Board {

    private final static Integer NUMBER_OF_TILES=100;
    private ArrayList<Tile> tiles = new ArrayList<>(NUMBER_OF_TILES);
    private final static Integer START_TILE = 0;
    private final static Integer FINISH_TILE = 99;

//    private final static Integer "snakes and ladders" = 29;

    public Board() {
        Tile tile = null;
        for (Integer pos = 0; pos < NUMBER_OF_TILES; pos++) {
            if (pos == START_TILE) {
                tile = new StartTile(pos);
            }
            else if (pos == FINISH_TILE) {
                tile = new FinishTile(pos);
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
//        new index .set

        System.out.println("landing on tile: " + (newIndex+1));
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


















