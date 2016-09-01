import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

public class TerminalP {
  private final String []comandosAceptados = {"+", "*", ">>"};
  private final String []descripcionComandos = {"+[num] Suma el numero indicado", "*[num] Multiplica el número", ">>[num] Recorre el número a nivel de bits"};
  private final String comandoEjecutar = "x";
  private Stack<Comando> pila = new Stack<>();
  private String entrada;
  private CalculadoraP calc;
  private Scanner scan = new Scanner(System.in);

  public TerminalP() {
    this(new CalculadoraP());
  }

  public TerminalP(CalculadoraP calc){
    this.calc = calc;
  }

  public void bienvenida(){
    System.out.println("Línea de comandos de operaciones de Java");
    System.out.println("\tSi necesita ayuda, escriba \"help\"\n");
  }

  public void imprimirComandos(){
    System.out.println("Comandos aceptados:");
    for (int i = 0; i < this.comandosAceptados.length; i++) {
      System.out.println("\t$> " + comandosAceptados[i] + ": " + this.descripcionComandos[i]);
    }
    System.out.println("\t$> help: Muestra esta ayuda");
    System.out.println("\t$> x: Ejecuta todas las operaciones indicadas y devuelve el valor");
  }

  public void recibirComando(){
    System.out.print("$ >  ");
    this.entrada = scan.nextLine();
  }

  public void validarComando(){
    String comando = "";
    String numero = "";
    boolean valido = false;
    if(this.entrada.equals("help")){
      this.imprimirComandos();
    } else if(this.entrada.equals(this.comandoEjecutar)) {
      this.ejecutarComando(new Comando(this.comandosAceptados.length, "0"));
    } else {
      for (int i = 0; i < this.entrada.length(); i++) {
        if(Character.isDigit(this.entrada.charAt(i))){
          comando = this.entrada.substring(0, i);
          numero = this.entrada.substring(i);
          break;
        } else if(this.entrada.charAt(i) == '-' && Character.isDigit(this.entrada.charAt(i+1))){
          comando = this.entrada.substring(0, i);
          numero = this.entrada.substring(i);
          break;
        }
      }
      if(comando.length() > 0){
        for(int i = 0; i < this.comandosAceptados.length; i++){
          if(this.comandosAceptados[i].equals(comando)){
            this.pila.push(new Comando(i, numero));
            valido = true;
          }
        }
      } else {
        System.out.println("No se reconoce el comando " + this.entrada + "!");
        this.imprimirComandos();
      }
      if(!valido) {
       System.out.println("No se reconoce el comando " + this.entrada + "!");
       this.imprimirComandos();
      }
    }
  }

  public void procesarComandos(){
    while (!this.pila.empty()) {
      this.ejecutarComando(this.pila.pop());
    }
  }

  public void ejecutarComando(Comando cmd){
    int comando = cmd.getId();
    String numero = cmd.getNumero();
    try {
      float num = Float.parseFloat(numero);
      switch(comando){
        case 0:
          System.out.println("Suma: " + this.calc.getValor() + " + " + numero + " = "  + this.calc.sumar(num));
          break;
        case 1:
          System.out.println("Multiplicacion: " + this.calc.getValor() + " * " + numero + " = "  + this.calc.multiplicar(num));
          break;
        case 2:
          System.out.println("Corrimiento: " + this.calc.getValor() + " >> " + numero + " = "  + this.calc.correr(num));
          break;
        case 3:
          this.procesarComandos();
          System.out.println("El resultado de todas sus operaciones fue: " + this.calc.getValor());
      }
    }
    catch (Exception e) {
      System.out.println("\"" + numero + "\" no es un número válido!");
      this.imprimirComandos();
    }
  }

  public void ejecutar(){
    this.bienvenida();
    do {
      this.recibirComando();
      this.validarComando();
    } while(!this.entrada.equals(this.comandoEjecutar));
  }

}
