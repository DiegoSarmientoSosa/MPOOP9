class Main {
  public static void main(String[] args) {
  /*try {
    String mensajes[] ={"uno","dos","tres"};
    for(int i=0;i<=3;i++)
      System.out.println(mensajes[i]);
  }catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Error"+ e);
    System.out.println("Error"+ e.getMessage());
  }
  
  System.out.println("***********************");
  System.out.println("***********Exepcion anidada************");
  try{
  Integer denominador=0;
  float equis=5/denominador;
  System.out.println(equis);
  }/*catch(ArithmeticException e){
    System.out.println("Error: "+ e.getMessage());
  }catch(Exception e){
    System.out.println("Error: "+ e.getMessage());
  }
System.out.println("***********Propagacion de Exepciones************");
try{
  float div= division(5,0);
  System.out.println(div);
}catch(ArithmeticException e){
System.out.println("Error: "+ e.getMessage());
}*/
System.out.println("*********************");
try{
  Cuenta cuenta =new Cuenta();
  cuenta.Depositar(30000);
  cuenta.ConsultaSaldo();
  cuenta.Retirar(100);
  cuenta.ConsultaSaldo();
  cuenta.Retirar(100);
  cuenta.Retirar(100);
  cuenta.ConsultaSaldo();
  cuenta.Retirar(100);
}catch(SaldoInsuficienteException e){
    System.out.println("Error: " + e.getMessage());
    OfrecerTarjetaCredito();
}catch(SaldoExcesivoException e){
  System.out.println("Error: " + e.getMessage());
}catch(RetirosExcedidosException e){
  System.out.println("Error: " + e.getMessage());
}
}//main

public static void OfrecerTarjetaCredito(){
  System.out.println("Le interesa una Tarjeta de Credito?");
}
/*
  public static float division(float a, float b){
    float c;
    c=a/b;
    return c;
  }*/
}