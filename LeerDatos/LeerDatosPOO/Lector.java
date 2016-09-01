import java.util.ArrayList;
import java.util.Scanner;

public class Lector {
  ArrayList<Float> numeros;
  float suma;

  public Lector(){
    this(new ArrayList<Float>(), 0f);
  }

  public Lector(ArrayList<Float> numeros, float suma){
    this.numeros = numeros;
    this.suma = suma;
  }

  public void leerNumeros(){
    boolean seguir = true;
    String entrada;
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese n números. Cuando termine, escriba x para detener la lectura");
    do {
      System.out.print(">");
      entrada = scan.nextLine();
      if(entrada.toUpperCase().charAt(0) == 'X'){
        System.out.println("Se detuvo la lectura de números.");
        seguir = false;
      } else {
        this.numeros.add(new Float(Float.parseFloat(entrada)));
      }
    } while(seguir);
  }

  public void sumar(){
    this.suma = 0f;
    System.out.println("Realizando suma de números...");
    for(int i = 0; i < this.numeros.size(); i++){
      this.suma += this.numeros.get(i);
    }
    System.out.println("Suma terminada. Se sumaron " + numeros.size() + " números");
  }

  public float getSuma(){
    return this.suma;
  }
}
