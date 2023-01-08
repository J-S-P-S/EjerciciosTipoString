public class ClaseStringInmutabilidad {
    public static void main(String[] args) {

        String curso = "Programación Java";
        String profesor = " Andrés Guzmán";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c ->{
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

        System.out.println();
        System.out.println("Como se puede evidenciar las variables tipo String son inmutables \nporque al utilizar" +
                " los métodos que tiene, no modifica el valor inicial asignado a la variable.");
        System.out.println();
        System.out.println("Porque se crea un nuevo objeto a una nueva instancia y este se debe almacenar en otra variable" +
                "de tipo String \npara poder imprimir y ver el resultado de esa nueva instancia creada.");


    }
}