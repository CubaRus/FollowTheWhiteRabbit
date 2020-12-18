package com.javacourse.se.lesson6;

public class Numbers {

    // x+3=5

    static byte a = 120;                  //2^8 = 256 (от -128 до 127)
    static short b = 657;                 //2^16 = 65.538 (от -32768 до32767)
    static int c = 34_567;                //2^32 = 4.294.967.296 (от -2147483648 до 214748647)
    static long d = 33232335989394L;      //2^64 = 18.446.744.073.709.551.616 (от -922332036854775808 до 9223372036854775807)

    static char e = 'C';                  //2^16 = 65.538 (от 0 до 65537) кодировка Unicode

    static float f = 123456789101112f;    //2^32 (от ~-1,4*10^45 до ~3,4*10^38)
    static double g = 7.4;                //2^64 (от ~-4,9*10^324 до ~1,8*10^308)
    static boolean h = true;              //8 bit (в массивах) и 32 bit (не в массивах)

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
