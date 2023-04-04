public class Tablero {
  private Reina[] reinas;

  public Tablero(Reina[] reinas) {
    this.reinas = reinas;
  }

  public boolean validar() {
    for (int i = 0; i < reinas.length; i++) {
      for (int j = i + 1; j < reinas.length; j++) {
        if (reinas[i].atacaA(reinas[j])) {
          return false;
        }
      }
    }
    return true;
  }
}
