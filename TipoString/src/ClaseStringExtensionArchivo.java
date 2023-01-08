public class ClaseStringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "i.m.a.g.e.n.jpeg";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));
    }
}