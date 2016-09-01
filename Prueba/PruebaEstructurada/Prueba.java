class PruebaE {

    public static void main(String args[]) {

        String cadena = "1234";
        String cadenaf = "1.358";
        String cadenad = "102.3654";
        char c;

        for (int n = 0; n < cadena.length(); n++) {
            c = cadena.charAt(n);
            int i = Character.digit(c, 10);
            System.out.println("El número entero es : " + i);
        }

        Float fo = Float.valueOf(cadenaf);
        System.out.println("El objeto Flotante es : " + fo);
        float f = fo.floatValue();
        System.out.println("El número flotante es : " + f);
        Double D = Double.valueOf(cadenad);
        System.out.println("El objeto Double es : " + D);
        double d = D.doubleValue();
        System.out.println("El número double es : " + d);

    }

}
