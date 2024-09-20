public class TipoVar {


    public static void main(String[] args) {

        // se puede utilizar var para inicializar variables, y el tipo se infiere segun los datoss,
        // sin embargo existen ciertas reglas,
        // al inicializar una variable con var se le tiene que asignar un valor o dara error si no
        // una vez inferido el tipo mo se puede cambiar a otro

        System.out.println("*** Uso de Var en Java ***");
        String nombre1 = "Tony";
        System.out.println("nombre1 = " + nombre1);
        //vamos a inferir el tipo de dato con var
        var nombre2 = "Stark";
        System.out.println("nombre2 = " + nombre2); //se infiere tipo string
        System.out.println(nombre1 + " " + nombre2);

        var edad = 38; //se infiere de tipo int
        System.out.println(edad);
        var estaVivo = false; //se infiuere de tipo boolean
        System.out.println("Esta Vivo? = " + estaVivo);
    }
}

