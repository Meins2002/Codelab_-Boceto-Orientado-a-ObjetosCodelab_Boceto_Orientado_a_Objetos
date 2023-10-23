package org.example;

public class Reservacion_Restaurante extends Reservacion{

    //Atributos
    private String Nombre_Restaurante;
    private int Numero_Mesa;

    //constructor
    public Reservacion_Restaurante(String Nombre_Restaurante, int Numero_Mesa, String Nombre, String Tipo_Documento, int Numero_Documento, int Numero_Contacto, String Fecha, int Hora) {
        super(Nombre, Tipo_Documento, Numero_Documento, Numero_Contacto, Fecha, Hora);
        this.Nombre_Restaurante = Nombre_Restaurante;
        this.Numero_Mesa = Numero_Mesa;
    }
      // get y set
    public String getNombre_Restaurante() {
        return Nombre_Restaurante;
    }

    public int getNumero_Mesa() {
        return Numero_Mesa;
    }

    public void setNumero_Mesa(int numero_Mesa) {
        Numero_Mesa = numero_Mesa;
    }

    public void setNombre_Restaurante(String nombre_Restaurante) {
        Nombre_Restaurante = Nombre_Restaurante;
    }

    @Override
    public void Reservar() {
        super.Reservar();
        System.out.println( "Nombre de restaurante : " + getNombre_Restaurante() +" Numero de mesa: " + getNumero_Mesa());
        System.out.println("Para el dia " + getFecha() + "hora " + getHora());
        System.out.println(" Tipo de documento: " + getTipo_Documento() + "   " + "No. " + getNumero_Documento());
    }

    @Override
    public void Cancelar() {
        super.Cancelar();
        System.out.println( "Nombre de restaurante : " + getNombre_Restaurante() +" Numero de mesa: " + getNumero_Mesa());
        System.out.println("Para el dia " + getFecha() + "hora " + getHora());
        System.out.println(" Tipo de documento: " + getTipo_Documento() + "   " + "No. " + getNumero_Documento());
    }

}
