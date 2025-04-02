package Autodidacta.Youtube.Ejercicio2;

public class Ordenador {

    String marca,modelo;
    int ram,disco_duro,espacio;
    boolean encendido=false;

    public void setDisco_duro(int disco_duro) {
        this.disco_duro = disco_duro;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getDisco_duro() {
        return disco_duro;
    }
    public int getEspacio() {
        return espacio;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getRam() {
        return ram;
    }

    public Ordenador(){
        ram=4;
        disco_duro=50;
    }
    public Ordenador(int ram){
        this.ram=ram;
    }
    public Ordenador(int ram,int disco_duro){
        this.ram=ram;
        this.disco_duro=disco_duro;
    }
    public Ordenador(String marca,String modelo,int ram,int disco_duro){

    }

    public void encender(){
        if (encendido){
            System.out.println("El ordenador ya estaba encendido");

        }else {
            encendido=true;
            System.out.println("el ordenador se ha encendido correctamente");
        }

    }


  public void apagar(){
    if (encendido){
        System.out.println("Apagado correctamente");
        encendido=false;
    }else{
        System.out.println("El ordenador ya estaba apagado");
    }
  }

  public void transferir(int gigas){
    if (encendido){
        if((espacio+gigas)<=disco_duro){
            espacio=espacio+gigas;
            System.out.println("Se ha transferido correctamente el espacio utiliado es "+espacio+"GB de "+disco_duro+"GB");
        }else{
            System.out.println("no hay suficiente espacio en el disco");
        }
        
    }else{
        System.out.println("el ordenador esta apagado no puedes transferir archivos");
    }
  }

  public void eliminar(int gigas){
    if (encendido){
        if((espacio-gigas)>=0){
            espacio=espacio-gigas;
            System.out.println("Se ha eliminado correctamente, el espacio utilizado es: "+espacio+"GB de "+disco_duro+"GB");
        }else{
            System.out.println("esta borrando mas memoria de la que tiene el disco");
        }
        
    }else{
        System.out.println("el ordenador esta apagado no puedes eliminar archivos");
    }
  }


    
}
