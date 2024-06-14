package kapitel11;

import java.util.*;
import java.io.*;

public class ArrayCopy {

    public static double[] arrCopyOf(double[] arr, int nr) {
        double[] arr2 = new double[nr];

        if (arr.length == nr || arr.length > nr) {
            for (int i = 0; i < nr; i++) {
                arr2[i] = arr[i];
            }
        } else {
            for (int i = 0; i < arr.length; i++)
                arr2[i] = arr[i];
            for (int j = arr.length; j < nr; j++)
                arr2[j] = 0;
        }
        return arr2;
    }

    public static void main(String[] args) throws IOException {
        double[] array1 = {1, 2, 3, 4};
        var array2 = arrCopyOf(array1, 4);

        System.out.println("och array nr 2:  " + Arrays.toString(array2));
    }
}
