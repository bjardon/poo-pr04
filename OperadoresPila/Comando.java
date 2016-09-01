public class Comando {
  private int id;
  private String numero;

  public Comando(){
    this(0, "");
  }

  public Comando(int id, String numero){
    this.id = id;
    this.numero = numero;
  }

  public int getId(){
    return this.id;
  }

  public String getNumero(){
    return this.numero;
  }
}
