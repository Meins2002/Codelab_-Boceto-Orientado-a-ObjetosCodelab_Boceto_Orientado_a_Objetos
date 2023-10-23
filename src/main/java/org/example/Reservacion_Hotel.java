package org.example;

class Reservacion_Hotel extends Reservacion {
    private String nombre_Hotel;
    private int Calificacion;



    //Constructor

    public Reservacion_Hotel (String nombre_Hotel, int Calificacion, String Nombre, String Tipo_Documento, int Numero_Documento, int Numero_Contacto, String Fecha, int Hora ) {

        super(Nombre, Tipo_Documento, Numero_Documento, Numero_Contacto, Fecha, Hora);
        this.nombre_Hotel = nombre_Hotel;
        this.Calificacion = Calificacion;

    }

    //get

    public String getNombre_Hotel() {
        return nombre_Hotel;
    }

    public int getCalificacion() {
        return Calificacion;
    }

    //set
    public void setCalificacion(int calificacion) {
        Calificacion = calificacion;
    }

    public void setNombre_Hotel(String nombre_Hotel) {
        this.nombre_Hotel = nombre_Hotel;
    }

    @Override
    public void Reservar () {
        super.Reservar();
        System.out.println( "En el hotel: " + nombre_Hotel +" a nombre de: " + getNombre() );
        System.out.println("Para el dia " + getFecha() + "  hora " + getHora());
        System.out.println(" Tipo de documento: " + getTipo_Documento() + "   " + "No. " + getNumero_Documento());
    }

    @Override
    public void Cancelar() {
        super.Cancelar();
        System.out.println("Reserva de hotel realizada para " + getNombre() + "en el hotel " + nombre_Hotel);
        System.out.println("Para el dia " + getFecha() + "hora " + getHora());
        System.out.println(" Tipo de documento: " + getTipo_Documento() + "   " + "No. " + getNumero_Documento());
    }
}