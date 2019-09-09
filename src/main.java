public class main {
    public static void main(String[] args) {
        //Variabler med tal
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 9223372036854775807l;
        float e = 265.032657f;
        double f = 3.141592653589793;
        //Variabler med sandt eller falskt
        boolean g = true;
        boolean h = false;
        //variabler med tekst
        String i = "hej med dig mit navn er kaj jeg er";
        String j = "år gammel";
        char k = 'f';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        c = c-b-a;
        System.out.println(c);
        String result = i+""+a+""+j;
        System.out.println(result);
    }

}
