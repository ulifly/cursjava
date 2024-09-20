public class SistemaDeReservacion {
    public static void main(String[] args) {
        String NombreCliente = "Peter Parker";
        short diasEstancia = 7;
        final double TARIFA_DIARIA = 650.42;
        boolean vistaAlMar = false;
        double precio = TARIFA_DIARIA * diasEstancia;


        System.out.println("Nombre del cliente = " + NombreCliente);
        System.out.println("Dias de estancia = " + diasEstancia);
        System.out.println("Tarifa por dia = " + TARIFA_DIARIA);
        System.out.println("Habitacion con vista al mar? = " + vistaAlMar);
        System.out.println("Precio total = " + precio);

        System.out.println();

        NombreCliente = "Bruce Wayne";
        diasEstancia = 14;
        vistaAlMar = true;
        precio = TARIFA_DIARIA * diasEstancia;
        System.out.println("Nombre del cliente = " + NombreCliente);
        System.out.println("Dias de estancia = " + diasEstancia);
        System.out.println("Tarifa por dia = " + TARIFA_DIARIA);
        System.out.println("Habitacion con vista al mar? = " + vistaAlMar);
        System.out.println("Precio total = " + precio);


    }
}
