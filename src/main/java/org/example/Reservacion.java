package org.example;
//Clase padre "Reservaacion" implementando la interfaz "Reserva"
abstract public class Reservacion implements Reserva {

    //Atributos
    private String Nombre;
    private String Tipo_Documento;
    private int Numero_Documento;
    private int Numero_Contacto;
    private String Fecha;
    private int Hora;


    //Constructor
    public Reservacion (String Nombre, String Tipo_Documento, int Numero_Documento, int Numero_Contacto, String Fecha, int Hora ) {
        this.Nombre = Nombre;
        this.Tipo_Documento = Tipo_Documento;
        this.Numero_Documento = Numero_Documento;
        this.Numero_Contacto = Numero_Contacto;
        this.Fecha = Fecha;
        this.Hora = Hora;

    }



    // Metodos
    //Get
    public String getNombre() {
        return Nombre;
    }
    public String getTipo_Documento() {
        return Tipo_Documento;
    }
    public int getNumero_Documento() {
        return Numero_Documento;
    }
    public int getNumero_Contacto() {
        return Numero_Contacto;
    }
    public String getFecha() {
        return Fecha;
    }

    public int getHora() {
        return Hora;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTipo_Documento(String tipo_Documento) {
        Tipo_Documento = tipo_Documento;
    }
    public void setNumero_Documento(int numero_Documento) {
        Numero_Documento = numero_Documento;
    }
    public void setNumero_Contacto(int numero_Contacto) {
        Numero_Contacto = numero_Contacto;
    }
    public void setFecha(String fecha) {
        Fecha = fecha;
    }
    public void setHora(int hora) {
        Hora = hora;
    }



    //Implementacion de la interfaz
    @Override
    public void Reservar() {
        System.out.println("Esta reservada");
    }

    public void Cancelar () {
        System.out.println("Esta Cancelada ");
    }
}