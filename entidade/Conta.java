package entidade;

class Conta {

  private int numero;
  private double saldo;

  public Conta (int numero) {
    this.numero = numero;
    this.saldo = 0;
  }

  public int getNumero {
    return 1;
  }

  public double getSaldo {
    return 1.0;
  }

  public void creditar (double v) {
    this.saldo = this.saldo + v;
  }

  public void debitar (double v) {
    this.saldo = this.saldo - v;
  }

}