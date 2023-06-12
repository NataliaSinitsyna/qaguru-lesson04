package guru.qa;
//1) поупражняться с математическими и логическими операторами,
// добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
//2) попробовать вычисления комбинаций типов данных (int и double)

public class Main {
    public static void main(String[] args) {

        byte byteNum = 127;
        short shortNum = 32767;
        int intNum = 2147483647;
        long longNum = 9_223_372_036_854_775_807L;
        float floatNum = 8.8F;
        double doubleNum = 8.8;

        System.out.println("переполнение для типа byte " + (byte) sum(byteNum, (byte) 5));
        System.out.println("переполнение для типа short " + (short) diff(shortNum, 65550));
        System.out.println("переполнение для типа int " + mult(intNum, 20));
        System.out.println("переполнение для типа long " + mult(intNum, 7));
        System.out.println("long " + div(longNum, 7));
        System.out.println("float " + res(floatNum, 5));
        System.out.println("int, double " + multDuo(120, doubleNum));
        System.out.println((byte) sum(byteNum, (byte) 5) != 132);
        System.out.println(mult(intNum, 20) > 0 || multDuo(120, doubleNum) > 0);
        System.out.println(res(floatNum, 5) > 5.0 && multDuo(5, floatNum) > 5.0);
    }

    public static int sum(byte first, byte second) {
        return first + second;
    }

    public static int diff(int first, int second) {
        return first - second;
    }

    public static int mult(int first, int second) {
        return first * second;
    }

    public static double multDuo(int first, double second) {
        return first * second;
    }
    public static long div(long first, long second) {
        return first / second;
    }

    public static float res(float first, float second) {
        return first % second;
    }
}
