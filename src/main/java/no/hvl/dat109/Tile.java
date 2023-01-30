package no.hvl.dat109;

public abstract class Tile {

    private String name;
    private int number;

    /*
    Execute when player lands on tile
     */
    public abstract void LandsOn(Player player);


}
