public class ManejoSubcadenas {
    public static void main(String[] args) {
        var cadena1 = "Bonjour pedazo de zoquetes ";
        System.out.println("cadena1 = " + cadena1);

        // subcadena
        var subcadena1 = cadena1.substring(8);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(8, 14);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
