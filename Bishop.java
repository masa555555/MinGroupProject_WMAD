package GroupMiniProject;

public class Bishop extends Piece {

  public Bishop(String symbol, int value, boolean isWhite, Position position) {
    super(symbol, value, isWhite, position);
  }

  @Override
  public boolean isValidMove(Position newPosition) {
    return super.isValidMove(newPosition);
        // TODO
  }

  @Override
  public String toString() {
    return "Bishop{value= " + value  + "} @[" + getPosition().toString() + "]";
  }

  @Override
  public boolean equals(Object piece) {
    if (!(piece instanceof Bishop)) {
      return false;
    }
    if (this.value == ((Bishop) piece).getValue()) {
      return false;
    }
    if (this.isWhite == ((Bishop) piece).isWhite()) {
      return false;
    }
    return true;
  }

}
