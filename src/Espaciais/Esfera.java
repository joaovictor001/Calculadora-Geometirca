package Espaciais;

public class Esfera {
  public double raio;

  public final double PI= Math.PI;

  public  Esfera (double raio){
      this.raio = raio;
  }


  public double calArea(){
      return PI * Math.pow(this.raio,2);
  }
  public double calVolume(){
      return (1.33 * PI) * Math.pow(this.raio, 3);
  }


}
