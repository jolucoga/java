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

  }
}