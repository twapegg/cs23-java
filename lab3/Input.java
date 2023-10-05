
// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    static String s = null;
    static InputStreamReader ir;
    static BufferedReader in;

    public Input() {
    }

    public static String readString() {
        try {
            return in.readLine();
        } catch (Exception var1) {
            return null;
        }
    }

    public static int readInt() {
        try {
            s = readString();
            int var0 = Integer.parseInt(s);
            return var0;
        } catch (Exception var1) {
            System.out.println("Invalid numeric format");
            return 0;
        }
    }

    public static long readLong() {
        try {
            s = readString();
            long var0 = Long.parseLong(s);
            return var0;
        } catch (Exception var2) {
            System.out.println("Invalid numeric format");
            return 0L;
        }
    }

    public static float readFloat() {
        try {
            s = readString();
            float var0 = Float.valueOf(s);
            return var0;
        } catch (Exception var1) {
            System.out.println("Invalid numeric format");
            return 0.0F;
        }
    }

    public static double readDouble() {
        try {
            s = readString();
            double var0 = Double.parseDouble(s);
            return var0;
        } catch (Exception var2) {
            System.out.println("Invalid numeric format");
            return 0.0;
        }
    }

    public static char readChar() {
        try {
            s = readString();
            return s.charAt(0);
        } catch (Exception var1) {
            return '\u0000';
        }
    }

    static {
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
    }
}
