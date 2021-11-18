public class RetirosExcedidosException extends Exception{
  public RetirosExcedidosException(){
    super ("Se a alcanzado el maximo de retiros diarios");
  }
}