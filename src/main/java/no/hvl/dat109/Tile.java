package no.hvl.dat109;

public abstract class Tile {

//    private String name;
    private int number;

    public Tile() {
//        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "number=" + number +
                '}';
    }

    /*
                Execute when player lands on tile
                 */
    public abstract void LandsOn(Player player);


}
