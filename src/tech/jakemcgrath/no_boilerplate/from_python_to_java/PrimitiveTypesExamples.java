package tech.jakemcgrath.no_boilerplate.from_python_to_java;


public class PrimitiveTypesExamples {
    public static void main(String[] args) {
        byte b;
        int i, numBits;
        StringBuilder sb;
        String s;

        numBits = 8;
        for (i = 0; i < 300; i += 10) {
            b = (byte) i;
            System.out.printf("%-5d%-7d", i, b);

            s = Integer.toBinaryString(Byte.toUnsignedInt(b));
            sb = new StringBuilder(s);

            while (sb.length() < numBits) {
                sb.insert(0, "0");
            }

            sb.insert(4, " ");
            System.out.println(sb);
        }
    }
}
