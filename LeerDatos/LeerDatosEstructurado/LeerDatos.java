import java.util.Scanner;

class leerdatos {

    public static String leer() {
        String s = "";
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();
        return s;
    }

    public static void main(String args[]) {
        char ca;
        String cadena;
        int ban = 0;
        float a = (float) 0.0;//, b;
        Float af;//, bf;
        while (ban != 1) {
            System.out.print("Introduzca un flotante :: ");
            cadena = leer();
            ca = cadena.charAt(0);
            if (ca != 'x') {
                af = Float.valueOf(cadena);
                a += af.floatValue();
            } else {
              ban = 1;
            }
        }
        System.out.print("La suma de sus n£meros es :: " + a);
    }

}
