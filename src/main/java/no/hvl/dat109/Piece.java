package no.hvl.dat109;

public class Piece {
    private String colour;
    private Tile tile;

//    public Piece(){}

    public Piece(String colour) {
        this.colour = colour;
        this.tile = new StartTile();
    }



    public String getColour() {
        return colour;
    }
//
//    public void setColour(String colour) {
//        this.colour = colour;
//    }

    public Tile getTile() {
        return tile;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    @Override
    public String toString() {
        return "Piece{" + colour;
    }
}
