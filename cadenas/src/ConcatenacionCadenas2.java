public class ConcatenacionCadenas2 {
    public static void main(String[] args) {
        var cadena1 = "Bonjour";
        var cadena2 = "zoquete";
        var cadena3 = cadena1 + " " + cadena2;

        System.out.println("salida = " + cadena3);

        // metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("salida con metodo concat = " + cadena3);

        // metodo StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        System.out.println("salida con StingBuilder = " + constructorCadenas);

        // metodo StringBuffer es similar a StringBuilder, pero su ventaja es que es multi hilo

        var claseStringBuffer = new StringBuffer();
        claseStringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("claseStringBuffer = " + claseStringBuffer);

        // metodo join une cadenas se le pasa primero el string de conjuncion
        var resultado = String.join("-", cadena1, cadena2);
        System.out.println("metodo join =  " + resultado );


    }
}
