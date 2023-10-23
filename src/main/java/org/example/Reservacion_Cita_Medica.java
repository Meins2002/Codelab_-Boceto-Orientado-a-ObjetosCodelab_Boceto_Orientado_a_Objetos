package org.example;

public class Reservacion_Cita_Medica extends Reservacion{

    //atributos
    private String Nombre_Clinica;
    private String Nombre_Doctor;
    private  int id_Doctor;

    //constructor

    public Reservacion_Cita_Medica(String Nombre_Clinica, String Nombre_Doctor, int id_Doctor, String Nombre, String Tipo_Documento, int Numero_Documento, int Numero_Contacto, String Fecha, int Hora) {
        super(Nombre, Tipo_Documento, Numero_Documento, Numero_Contacto, Fecha, Hora);
        this.Nombre_Clinica = Nombre_Clinica;
        this.Nombre_Doctor = Nombre_Doctor;
        this.id_Doctor = id_Doctor;
    }

    //get y set

    public String getNombre_Clinica() {
        return Nombre_Clinica;
    }

    public String getNombre_Doctor() {
        return Nombre_Doctor;
    }

    public int getId_Doctor() {
        return id_Doctor;
    }

    public void setNombre_Clinica(String nombre_Clinica) {
        Nombre_Clinica = nombre_Clinica;
    }

    public void setNombre_Doctor(String nombre_Doctor) {
        Nombre_Doctor = nombre_Doctor;
    }

    public void setId_Doctor(int id_Doctor) {
        this.id_Doctor = id_Doctor;
    }

    @Override
    public void Reservar() {
        super.Reservar();
        System.out.println( "En el Clinica: " + getNombre_Clinica() +" Con el Doctor: " + getNombre_Doctor() + "  Documento: " + getId_Doctor());
        System.out.println("Para el dia " + getFecha() + "hora " + getHora());
        System.out.println(" Tipo de documento: " + getTipo_Documento() + "   " + "No. " + getNumero_Documento());
    }

    @Override
    public void Cancelar() {
        super.Cancelar();
        System.out.println( "En el Clinica: " + getNombre_Clinica() +" a nombre de Doctor: " + getNombre_Doctor() + "  Documento: " + getId_Doctor());
        System.out.println("Para el dia " + getFecha() + "hora " + getHora());
        System.out.println(" Tipo de documento: " + getTipo_Documento() + "   " + "No. " + getNumero_Documento());
    }
}
