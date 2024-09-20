public class DetalleProducto {
    public static void main(String[] args) {
        System.out.println("Detalles del producto");
        String nombreDelProducto = "Nintendo Switch";
        System.out.println("Nombre Del Producto = " + nombreDelProducto);
        double precio = 5450.60;
        System.out.println("Precio = " + precio);
        short cantidadDisponible = 500;
        System.out.println("cantidad Disponible = " + cantidadDisponible);
        boolean disponibleParaVenta = true;
        System.out.println("Disponible Para Venta = " + disponibleParaVenta);

        System.out.println();

        nombreDelProducto = "Nintendo Switch Lite";
        System.out.println("Nombre Del Producto = " + nombreDelProducto);
        precio = 4350.20;
        System.out.println("Precio = " + precio);
        cantidadDisponible = 1;
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        disponibleParaVenta = false;
        System.out.println("disponibleParaVenta = " + disponibleParaVenta);

    }

}
