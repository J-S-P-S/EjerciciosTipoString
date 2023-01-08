public class ClaseStringConcatenar {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor =   "Andrés Guzman";

        String detalle = curso  + " con el instructor " + profesor;
        System.out.println(detalle);

        int nA =   10;
        int nB =   5;

        System.out.println(detalle + nA + nB);      //Las expresiones se evalúan de izquierda a derecha
        System.out.println(detalle + (nA + nB));    //Precedencia de los operadores
        System.out.println(nA + nB + detalle);      //Las expresiones se evalúan de izquierda a derecha


        String detalle2 = curso.concat(" con ").concat(profesor); //Es más eficiente usar el método concat que usar el + para concatenar cadenas de texto
        System.out.println("detalle = " + detalle2);



    }
}