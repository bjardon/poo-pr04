import java.util.Scanner;

public class Prueba {
  private String entero;
  private String flotante;
  private String doble;
  private char c;

  public Prueba(){
    this("","","",'\0');
  }

  public Prueba(String entero, String flotante, String doble, char c){
    this.entero = entero;
    this.flotante = flotante;
    this.doble = doble;
    this.c = c;
  }

  public void leerDatos(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese un valor entero");
    System.out.print("> ");
    this.entero = scan.nextLine();
    System.out.println("Ingrese un valor flotante");
    System.out.print("> ");
    this.flotante = scan.nextLine();
    System.out.println("Ingrese un valor doble");
    System.out.print("> ");
    this.doble = scan.nextLine();
  }

  public void imprimirDigitos(){
    for (int n = 0; n < this.entero.length(); n++) {
        c = this.entero.charAt(n);
        int i = Character.digit(c, 10);
        System.out.println("El número entero es : " + i);
    }
  }

  public void imprimirFlotante(){
    Float fobj = Float.valueOf(this.flotante);
    System.out.println("El objeto Flotante es : " + fobj);
    float f = fobj.floatValue();
    System.out.println("El número flotante es : " + f);
  }

  public void imprimirDoble(){
    Double dobj = Double.valueOf(this.doble);
    System.out.println("El objeto Double es : " + dobj);
    double d = dobj.doubleValue();
    System.out.println("El número double es : " + d);
  }














}
