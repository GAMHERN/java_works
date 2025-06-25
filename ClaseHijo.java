public class ClaseHijo extends ClasePadre{
  private int campo3;

  public int getCampo3(){
    return this.campo3;

  }
  public void setCampo3(int campo3){
    this.campo3 = campo3;
  }

  public void setDataPadre(){
    super.setCampo1(56);
    this.campo2 = 78;
  }

  @Override
  public String toString(){
    return "ClaseHijo = "+campo3;
  }

}
