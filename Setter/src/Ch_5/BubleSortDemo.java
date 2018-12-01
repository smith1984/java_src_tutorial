package Ch_5;

import sun.misc.BASE64Encoder;

/**
 * Created by ito on 21.03.17.
 */
public class BubleSortDemo {
    public static void main(String[] args) {
        int nums[] = {99, -10, 23, 123972, 17, -654, 46, 87, -9};
        for (int i:nums)
            System.out.print(i + " ");
        System.out.println();
        BubleSort.sort(nums);
        for (int i:nums)
            System.out.print(i + " ");
    }
}

class BubleSort{
    static void sort(int nums[]){
        int t = 0;
        for (int a = 1; a < nums.length; a++)
            for (int b = nums.length - 1; b >= a; b--)
            {
                if (nums[b-1] > nums[b]){
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }

            }
    }
}
