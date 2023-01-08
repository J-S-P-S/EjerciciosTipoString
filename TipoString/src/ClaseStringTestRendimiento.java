public class ClaseStringTestRendimiento {
    public static void main(String[] args) {

        String a = "a";
        String b = "c";
        String c = a;
        StringBuilder sb = new StringBuilder(a);
        StringBuffer sf = new StringBuffer(b);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            //      c = c.concat(a).concat(b).concat("\n");     //500,1000,10000,100000 procesos ->     1ms,3ms,84ms,4139ms
            //      c+= a + b + "\n";                           //500,1000,10000,100000 procesos ->     10ms,11ms,48ms,1523
            //      sb.append(a).append(b).append("\n");        //500,1000,10000,100000 procesos ->     0ms,1ms,1ms,7ms
            //      sf.append(a).append(b).append(c);           //500,1000,10000,100000 procesos ->     0ms,1ms,1ms,7ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);

        /*int s = (1 > 2) || (2 > 1) & (3 > 1) ? 50 : 0; CÓDIGO PRUEBAS, BORRAR
        System.out.println(s);*/

    }
}