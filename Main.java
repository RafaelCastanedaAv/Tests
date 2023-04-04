import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("\n\n");

        System.out.println("Menu:");
        System.out.println("1. :: 8 Reinas      ::");
        System.out.println("2. :: Cubo de Rubik ::");
        System.out.println("3. :: Sudoku        ::");
        System.out.println("4. :: Salir         ::");

        int opcion = scanner.nextInt();

        switch (opcion) {
          case 1:
            ejecutaEjercicioReinas();
            break;
          case 2:
            ejecutaEjercicioRubik();
            break;
          case 3:
            ejecutaEjercicioSudoku();
            break;
          case 4:
            System.exit(0);
          default:
            System.out.println("Opción inválida");
            break;
        }
      }
    }

  }

  public static void ejecutaEjercicioReinas() {
    // Coordenadas kas reinas
    Reina[] reinas = new Reina[] {
        new Reina(0, 0),
        new Reina(1, 4),
        new Reina(2, 7),
        new Reina(3, 5),
        new Reina(4, 2),
        new Reina(5, 6),
        new Reina(6, 1),
        new Reina(7, 3)
    };

    Tablero tablero = new Tablero(reinas);

    System.out.println("\n :::::::::::: Resultado ::::::::::::::");
    if (tablero.validar()) {
      System.out.println("Las reinas están en una posición válida.");
    } else {
      System.out.println("Las reinas están atacándose.");
    }
  }

  public static void ejecutaEjercicioRubik() {
    // Este cubo tiene los colores bien
    char[][][] cubo = { {
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' },
        { 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A' }
    }, {
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' },
        { 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V', 'V' }
    }, {
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' },
        { 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R', 'R' }
    }, {
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' },
        { 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N', 'N' }
    }, {
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' },
        { 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M' }
    }, {
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
        { 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B' }
    } };

    CuboRubik rubik = new CuboRubik(cubo);
    System.out.println("\n :::::::::::: Resultado ::::::::::::::");
    if (rubik.validar()) {
      System.out.println("El cubo está armado correctamente.");
    } else {
      System.out.println("El cubo está armado incorrectamente.");
    }
  }

  public static void ejecutaEjercicioSudoku() {
    int[][] tablero = {
        { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
        { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
        { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
        { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
        { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
        { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
        { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
        { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
        { 3, 4, 5, 2, 8, 6, 1, 7, 9 }
    };
    Sudoku sudoku = new Sudoku(tablero);
    boolean esSolucionValida = sudoku.esSolucionValida();
    System.out.println("\n :::::::::::: Resultado ::::::::::::::");
    System.out.println(esSolucionValida ? "Es una solución valida" : "No es una solución valida");
  }
}
