public class IndiceSubcadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOff - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Bonjour pedazo de zoquetes, pedazo de bolonia";
        // subcadena a buscar "pedazo"
        var indice1 = cadena1.indexOf("pedazo");
        System.out.println("indice 1 = " + indice1);
        // lastIndexOff -devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("pedazo");
        System.out.println("indice 2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("gastropodo");
        System.out.println("indice 3 = " + indice3);
    }
}
