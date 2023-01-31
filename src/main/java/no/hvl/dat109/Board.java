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
                tile = new StartTile();
                tile.setNumber(pos);
            }
            else if (pos == FINISH_TILE) {
                tile = new FinishTile();
                tile.setNumber(pos);
            }
//            else if (pos == snakes and ladders) {
//                tile = new snake or ladder tile();
//            }
//            use index 0 as prison tile? 3x6
            else {
                tile = new NormalTile();
                tile.setNumber(pos);
            }
            tiles.add(tile);
        }
        System.out.println(tiles.toString());
    }

//    takes in parameters "tile" and "sum"
//    returns the new tile the piece should be at
    public Tile move(Tile tile, Integer sum){

        System.out.println(tile.toString());



        int index=tiles.indexOf(tile);
        int newIndex=(index+sum);
        System.out.println("newindex= " + newIndex);

//        if ((t.getNumber()+sum)>100){
//
//        }
//        else if((t.getNumber()+sum)==100){
//
//        }
//        System.out.println("landing on tile: " + (tile.getNumber()+sum));
//        return tiles.get(tile.getNumber()+sum);

        if((newIndex)>98){
//            System.out.println("newindex+2=" + newIndex+2);
            System.out.println(99-(sum-99+index));

//            new tile=100-(diceResult-100+oldTile);
            System.out.println("too far! moving back to " + (99-(sum-99+index)));

            return tiles.get(99-(sum-99+index));

        }
        else if((newIndex)==98){
            System.out.println("Winner, winner, chicken dinner");
            return tiles.get(newIndex);


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


















