package workWithCounts;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayList<Integer> isPositiv = new ArrayList<>();
        for (Integer b : integerList
        ) {
            if (b > 0 && b % 2 == 0) {
                isPositiv.add(b);
            }
        }
        int[] minMax = new int[isPositiv.size()];
        for (int i = 0; i < isPositiv.size(); i++) {
            minMax[i] = isPositiv.get(i);
        }
        for (int i = 0; i < minMax.length - 1; i++) {
            for (int j = 0; j < minMax.length - i - 1; j++) {
                if (minMax[j] > minMax[j + 1]) {
                    int u = minMax[j];
                    minMax[j] = minMax[j + 1];
                    minMax[j + 1] = u;
                }
            }
        }
        for (int r : minMax
        ) {
            System.out.println(r);
        }
    }
}
