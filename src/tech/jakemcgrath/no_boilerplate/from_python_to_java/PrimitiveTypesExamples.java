package tech.jakemcgrath.no_boilerplate.from_python_to_java;


public class PrimitiveTypesExamples {
    public static void main(String[] args) {
        byte b;
        int i, n, start, stop;
        StringBuilder sb;
        String s;

        n = 8;
        for (i = 0; i < 300; i += 10) {
            b = (byte) i;
            System.out.printf("%-5d%-7d", i, b);

            s = Integer.toBinaryString(i);

            start = Math.max(0, s.length() - n);
            stop = Math.min(n, s.length());

            sb = new StringBuilder(s.substring(start, stop));

            while (sb.length() < n) {
                sb.insert(0, "0");
            }

            sb.insert(4, " ");
            System.out.println(sb);
        }
    }
}
