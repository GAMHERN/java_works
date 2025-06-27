public class ClasePadre {
  private int campo1;
  public int campo2;
  private double x;
  private double y;

  public void setDatos(int campo1){
    this.campo1 = 12;
    this.campo2 = this.campo1+1;

  }

  public int getCampo1(){
    return campo1;
  }

  public void setCampo1(int campo1){
    if (campo1 < 0){
      this.campo1 = campo1;
    }
    else{
      this.campo1 = 0;
    }

  }

  public String toString(){
    return "ClasePadre = "+campo1+" ,Campo2= "+campo2;
  }
}
