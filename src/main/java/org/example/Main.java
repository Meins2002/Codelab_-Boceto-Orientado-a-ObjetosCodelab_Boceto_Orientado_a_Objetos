package org.example;

public class Main {
    public static void main(String[] args) {

        Reservacion_Hotel reservacionHotel = new Reservacion_Hotel("Colonial", 4,"Natalia",
                "cc",1225034,42335, "julio 21" , 7 );
        reservacionHotel.Reservar();
        System.out.println(reservacionHotel);

        System.out.println("  ");
        System.out.println("**************************************************************************************");
        System.out.println("  ");

        Reservacion_Cita_Medica citaMedica = new Reservacion_Cita_Medica( "Saludtotal","Pepito Perez",
                123456789, "Marcela", "CC",123432543,
                312231231, "Diciembre 20 de 2023", 7);
        citaMedica.Reservar();
        System.out.println(citaMedica);

        System.out.println("  ");
        System.out.println("**************************************************************************************");
        System.out.println("  ");

        Reservacion_Restaurante reservacionRestaurante = new Reservacion_Restaurante("La Pelanga",
                4,"Michael Jackson", "CE",1245,234855493,
                "Marzo 8 de 2023", 4 );
        reservacionRestaurante.Reservar();
        System.out.println(reservacionRestaurante);

    }
}