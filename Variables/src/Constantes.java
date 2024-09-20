public class Constantes {
    public static void main(String[] args) {
        System.out.println(" <***> Uso de constante en Java <***>");
        //para declara una constante en Java se utiliza final y el type
        //por convencion las constantes en Java se escriben en mayusculas y si llevan espacio de usa el guion bajo
        final String SALUDOS = "Bonjour pedazo de zoquetes 🩻🩻❤️❤️🐢🐢🐢";
        System.out.println(SALUDOS);
        // definir una constante sirve para no permitir modificar el valor de la variable
        final var DIAS_DE_LA_SEMANA  = 7;
        // diasDeLaSemana = 12; //esto da error java: cannot assign a value to final variable diasDeLaSemana
        System.out.println(DIAS_DE_LA_SEMANA);
        final double PI =  3.14;
        System.out.println(PI);
        System.out.println("Math.PI " + Math.PI); //la constante de PI esta integrada en el modulo Math de Java
    }
}
