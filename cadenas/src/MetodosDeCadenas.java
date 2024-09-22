public class MetodosDeCadenas {
    public static void main(String[] args) {
        //metodos de cadenas
        var cadena1 = "Bonjour pedazo de Zoquetes";

        //obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud es: " + longitud);

        // reemplazar caracteres
        var nuevaCadena = cadena1.replace('e', 'a');
        System.out.println("reemplazo de letaras = " + cadena1);

        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("Mayusculas + " + mayusculas);
        
        // Convertir a minusculas
        var minisculas = cadena1.toLowerCase();
        System.out.println("minisculas = " + minisculas);

        //Eliminar espacios al inicio y la final de una cadena
        var cadena2 = " Peter Parker ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());

    }
}
