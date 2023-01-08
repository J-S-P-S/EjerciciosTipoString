public class ClaseString {
    public static void main(String[] args) {

        String curso = "Programación Java"; //Instancia de forma implícita
        String curso2 = new String ("Programación Java"); //Instancia de forma explicita
        boolean igual = curso == curso2;
        String curso3 = "Programación Java";

        System.out.println("curso == curso2: " + igual);

        igual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + igual);

        igual = curso == curso3;
        System.out.println("curso == curso3: " + igual);
        System.out.println("curso es igual a curso3 porque Java instancia la clase String como un objeto" +
                " y las 2 variables String curso y curso3 \ntienen la misma instancia de forma implícita y con el" +
                " mismo valor por eso el resultado es true.");


    }
}
