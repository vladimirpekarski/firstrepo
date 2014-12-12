package permutation;

import java.math.BigInteger;

public class Permutation {
    public static void main(String[] args) {
        StringBuffer value = new StringBuffer(10);

        long before = System.nanoTime();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    for (int l = 0; l <= 9; l++) {
                        for (int m = 0; m <= 9; m++) {
                            for (int z = 0; z <= 9; z++) {
                                for (int x = 0; x <= 9; x++) {
                                    for (int y = 0; y <= 9; y++) {
                                        for (int o = 0; o <= 9; o++) {
                                            for (int b = 0; b <= 9; b++) {
                                                value.append(i);
                                                value.append(j);
                                                value.append(k);
                                                value.append(l);
                                                value.append(m);
                                                value.append(z);
                                                value.append(x);
                                                value.append(y);
                                                value.append(o);
                                                value.append(b);
                                                checkValue(Long.valueOf(value.toString()));
                                                value.delete(0, value.length());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        long after = System.nanoTime();
        System.out.println(after - before);
    }

    public static void checkValue(long value) {
        if ((value % 1 == 0) && (value % 2 == 0) && (value % 3 == 0) && (value % 4 == 0) && (value % 5 == 0) && (value % 6 == 0) && (value % 7 == 0) &&
                (value % 8 == 0) && (value % 9 == 0) && (value % 10 == 0) && (value % 11 == 0) && (value % 13 == 0) && (value % 14 == 0) && (value % 15 == 0)
                && (value % 16 == 0) && (value % 17 == 0) && (value % 18 == 0)) {
            System.out.println(value);
        }
    }
}
