public class SaldoExcesivoException extends Exception{
  public SaldoExcesivoException(){
    super ("No se pueden depositar montos mayores a $20,000");
  }
}