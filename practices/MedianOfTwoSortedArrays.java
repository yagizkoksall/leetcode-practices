package practices;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        double result = 0;

        for (int i = 0; i < mergedArray.length; i++) {

            if (i < nums1.length) {
                mergedArray[i] = nums1[i];
            } else {
                mergedArray[i] = nums2[i - nums1.length];
            }
        }

        Arrays.sort(mergedArray);

        if (mergedArray.length % 2 == 0) {
            result = mergedArray[mergedArray.length / 2] + mergedArray[(mergedArray.length / 2) - 1];
            result /= 2;
        } else {
            result = mergedArray[mergedArray.length / 2];
        }


        return result;
    }
}
