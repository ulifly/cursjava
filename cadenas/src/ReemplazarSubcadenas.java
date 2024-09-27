public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Cadena primaria";
        System.out.println("cadena = " + cadena);
        
        //Reemplazamos primaria por secundaria
        var cadena2 = cadena.replace("primaria", "secundaria");
        System.out.println("cadena2 = " + cadena2);

        //Reemplazamos Cadena por string

        cadena2 = cadena.replace("Cadena", "String");
        System.out.println("cadena2 = " + cadena2);

    }
}
