public class Dog{
  //propiedades o atributos
  public String color;
  public String eyeColor;
  public Double height;
  public Double length;
  public Double weight;


  //metodos o comportamientos
  public String sit(){
    return "estoy sentado";
  //  System.out.println("estoy sentado");
  }
  public void bark(){
    System.out.println("wauff wauff wauff");
  }
  public void layDown(String datos){
    System.out.println(datos + "estoy recostado");
  }
  public void eat(){
    System.out.println("I am eating");
  }
  public void sleep(){
    System.out.println("ZZZzzz");
  }
}
