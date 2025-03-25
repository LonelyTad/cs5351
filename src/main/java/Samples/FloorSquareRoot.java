package Samples;

public class FloorSquareRoot {
    public static int floorSqrt(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Intentional mistake: Changed the condition to mid * mid <= x
            // This will cause the function to return the first mid where mid * mid is less than or equal to x,
            // instead of finding the largest mid where mid * mid is less than or equal to x.
            if (mid * mid <= x) return mid; 
            // This condition will now always be true, leading to incorrect results.
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("floorSqrt(" + x + ") = " + ans);
        return ans;
    }
}