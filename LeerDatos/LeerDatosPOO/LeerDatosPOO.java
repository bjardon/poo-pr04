public class LeerDatosPOO {
  public static void main(String[] args) {
    Lector lector = new Lector();
    lector.leerNumeros();
    lector.sumar();
    System.out.println("La suma de los números es: " + lector.getSuma());
  }
}
