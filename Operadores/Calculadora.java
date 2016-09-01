public class Calculadora {
  private float valor;
  private float aux;

  public Calculadora(){
    this(0f);
  }

  public Calculadora(float valor){
    this.valor = valor;
    this.aux = 0;
  }

  public float sumar(float aux){
    this.aux = aux;
    return this.sumar();
  }

  public float sumar(){
    this.valor += this.aux;
    return this.valor;
  }

  public float multiplicar(float aux){
    this.aux = aux;
    return this.multiplicar();
  }

  public float multiplicar(){
    this.valor *= this.aux;
    return this.valor;
  }

  public float correr(float aux){
    this.aux = aux;
    return this.correr();
  }

  public float correr(){
    this.valor = (int)this.valor >> (int)this.aux;
    return this.valor;
  }

  public float getValor(){
    return this.valor;
  }

}
