public class Reina {
  private int x;
  private int y;

  public Reina(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean atacaA(Reina reinaEnemiga) {
    return this.x == reinaEnemiga.x || this.y == reinaEnemiga.y || Math.abs(this.x - reinaEnemiga.x) == Math.abs(this.y - reinaEnemiga.y);
  }
}