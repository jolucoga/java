import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    byte edad = 18;
    int numeroGrande=1000;
    float edad2 = 15.5f;
    boolean isActive = true;
    char curso = 'A';
    String text = "Hola Mundo!";
    System.out.println(edad);
    System.out.println(numeroGrande);
    System.out.println(edad2);
    System.out.println(isActive);
    System.out.println(curso);
    System.out.println(text);

    int largo = text.length();
    System.out.println(largo);

    String texto = text.replace("Hola", "Adios");
    System.out.println(texto);

    System.out.println(texto.endsWith("undo!"));

    String malo = "   este String tiene espacios adicionales al inicio y fin      ";
    System.out.println(malo.trim());
    System.out.println(malo);

    String texto2 = "C:\\Hola \"Mundo\"";
    System.out.println(texto2);


    //Arrays
    /**
     * Comentario de varias lineas
     */
    int[] numeros = new int[5];
    numeros[0] = 5;
    numeros[4] = 7;
    int[] numeros2 = {4,3,2,1,0};
    int[][] numeros3 = {{0,1},{2,3}};
    int[][] numeros4 = new int[3][2];
    numeros4[0][0] = 5;
    numeros4[1][1] = 10;
    System.out.println(Arrays.toString(numeros));
    System.out.println(numeros.length);
    Arrays.sort(numeros);
    System.out.println(Arrays.toString(numeros));
    System.out.println(Arrays.toString(numeros2));
    System.out.println(Arrays.deepToString(numeros3));
    System.out.println(Arrays.deepToString(numeros4));
  }
}