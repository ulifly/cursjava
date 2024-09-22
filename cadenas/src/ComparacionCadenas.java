public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a caena2: ");
        System.out.println(cadena1 == cadena2);

        // Comparacion de cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es iguan en referencia con cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparacion de contenido con el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
