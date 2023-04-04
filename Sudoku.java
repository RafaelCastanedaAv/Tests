import java.util.HashSet;
import java.util.Set;

public class Sudoku {

  private int[][] tablero;

  public Sudoku(int[][] tablero) {
    this.tablero = tablero;
  }

  public boolean esSolucionValida() {
    for (int fila = 0; fila < 9; fila++) {
      if (!esFilaValida(fila)) {
        return false;
      }
    }

    for (int col = 0; col < 9; col++) {
      if (!esColumnaValida(col)) {
        return false;
      }
    }

    for (int fila = 0; fila < 9; fila += 3) {
      for (int col = 0; col < 9; col += 3) {
        if (!esCuadranteValido(fila, col)) {
          return false;
        }
      }
    }

    return true;
  }

  private boolean esFilaValida(int fila) {
    Set<Integer> set = new HashSet<>();
    for (int col = 0; col < 9; col++) {
      int value = tablero[fila][col];
      if (value == 0) {
        continue;
      }
      if (set.contains(value)) {
        return false;
      }
      set.add(value);
    }
    return true;
  }

  private boolean esColumnaValida(int col) {
    Set<Integer> set = new HashSet<>();
    for (int fila = 0; fila < 9; fila++) {
      int value = tablero[fila][col];
      if (value == 0) {
        continue;
      }
      if (set.contains(value)) {
        return false;
      }
      set.add(value);
    }
    return true;
  }

  private boolean esCuadranteValido(int fila, int col) {
    Set<Integer> set = new HashSet<>();
    for (int r = fila; r < fila + 3; r++) {
      for (int c = col; c < col + 3; c++) {
        int value = tablero[r][c];
        if (value == 0) {
          continue;
        }
        if (set.contains(value)) {
          return false;
        }
        set.add(value);
      }
    }
    return true;
  }
}