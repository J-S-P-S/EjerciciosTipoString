public class ClaseStringArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray()  = " + trabalenguas.toCharArray() );

        char[] arreglo = trabalenguas.toCharArray();
        int l = arreglo.length;
        for (int i = 0; i < l; i++) {

            System.out.print(arreglo[i]);
        }
        System.out.println("");
        String[] arreglo2 = trabalenguas.split("a");
        int l2 = arreglo2.length;

        for (int j = 0; j < l2; j++) {

            System.out.print(arreglo2[j]);
        }

        String archivo =  "archivo.jpeg";
        String[] archivoArr = archivo.split("\\.");
        int l3 = archivoArr.length;
        System.out.println("l = " + l3);
        for (int k = 0; k < l3; k++) {
            System.out.print(archivoArr[k] + " ");
        }
        System.out.println("extension = " + archivoArr[l3-1]);

    }
}
