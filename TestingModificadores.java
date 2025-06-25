import paquete.Clase1;


public class TestingModificadores {
  public static void main(String[] args) {
    ClasePadre unPapa = new ClasePadre();
    ClaseHijo unHijo = new ClaseHijo();
    Clase1 objeto1 = new Clase1();


    unPapa.setDatos(12);
    System.out.println(unPapa.toString());

    //unPapa.campo1 = 28;
    unPapa.setCampo1(-12);
    System.out.println(unPapa.toString());

    unHijo.setCampo1(-32);
    System.out.println("\nClase Hijo: "+unHijo.toString());



    objeto1.x = 12;
    objeto1.setY(78);
    //objeto1.z = 100;

  }
}
