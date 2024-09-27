public class CaracteresEspeciales {
    public static void main(String[] args) {
       // salto de linea \n
        var cadena1 = "Bonjour \n pedazo de zoquetes";
        System.out.println("salto de linea = " + cadena1);

        //  tabulador \t
        var cadena2 = "Bonjour\tpedazo de\tzoquetes";
        System.out.println("tabulador = " + cadena2);

        // caracter de escape \
        var cadena3 = "\"Bonjour pedazo de zoquetes\"";
        System.out.println("con escape de caracteres = " + cadena3);
    }
}
