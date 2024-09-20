public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de datos en Java
        
        //Enteros
        
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 1234567811;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 1234567891234567891L;
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante

        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.14162575214523641253315452455124521545454545454545454511515151515D;
        System.out.println("tipoDouble = " + tipoDouble);

        //caracter

        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '$';
        System.out.println("tipoChar = " + tipoChar);
        
        //booleano
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
    }
}
