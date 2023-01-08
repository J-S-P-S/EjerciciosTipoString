public class ClaseStringMetodos {

    public static void main(String[] args) {

        String nombre = "Sebastian";
        String trabalenguas = "trabalenguas";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Sebastian\") = " + nombre.equals("Sebastian"));
        System.out.println("nombre.equals(\"sebastian\") = " + nombre.equals("sebastian"));
        System.out.println("nombre.equalsIgnoreCase(\"sebastian\") = " + nombre.equalsIgnoreCase("sebastian"));
        System.out.println("nombre.compareTo(\"sebastian\") = " + nombre.compareTo("Sebastian")); //Se realiza una comparación a nivel lexico/gráfico es decir basado en la tabla unicode compara el orden numérico de las 2 cadenas de caracteres, el resultado es verdadero cuando retorna 0.
        System.out.println("nombre.charAt(8) = " + nombre.charAt(8));
        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4)); // Inicio se incluye, el final no se incluye

        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"lengua\") = " + trabalenguas.contains("lengua"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println("  trabalenguas ".trim());


    }
}