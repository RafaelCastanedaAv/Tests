public class CuboRubik {

  private char[][][] cubo;

  public CuboRubik(char[][][] cubo) {
    this.cubo = cubo;
  }

  public boolean validar() {
    // Validar caras
    if (!validarLado(cubo[0], 'A') || !validarLado(cubo[1], 'V') || !validarLado(cubo[2], 'R')
        || !validarLado(cubo[3], 'N') || !validarLado(cubo[4], 'M') || !validarLado(cubo[5], 'B')) {
      return false;
    }

    return true;
  }

  private boolean validarLado(char[][] lado, char color) {
    for (int i = 0; i < lado.length; i++) {
      for (int j = 0; j < lado[i].length; j++) {
        if (lado[i][j] != color) {
          return false;
        }
      }
    }
    return true;
  }
}