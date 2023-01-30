package no.hvl.dat109;

public class Player {

    private String name;
    private Piece piece;
    private Board board;

    public Player(){}

    public Player(String name, Piece piece) {
        this.name = name;
        this.piece = piece;
        board = new Board();
    }


    public void playMove(Dice dice){
        int sum = dice.throwDice();
        Tile tile = piece.getTile();
        tile=board.move(tile,sum);
        piece.setTile(tile);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Piece getPiece() {
        return piece;
    }

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
