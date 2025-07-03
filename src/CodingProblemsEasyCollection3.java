import java.util.ArrayList;
import java.util.Arrays;

public class CodingProblemsEasyCollection3 {

    public static void main(String[] args) {
        //Test case for reverseArray string and compare
//        reverseString("madam");
//        reverseString("java");
//        reverseString("abba");

        //Test case for removing duplicates from sorted array
//        int[] array = {0,0,1,1,1,2,2,3,3,4};
//        System.out.println(removeDuplicates(array));

        //Test cases for rotate array
        //int[] array = {1,2,3,4,5,6,7}; int k = 3;
//        int[] array = {1,2,3,4,5,6,7}; int k = 3;
//        rotate(array,k);

        //Test cases for contains duplicate
//        int[] array = {1,2,3,1};
//        System.out.println(containsDuplicate(array));

        //Test cases for single number
//        int[] array = {2,2,1};
//        System.out.println(singleNumber(array));

        //Test cases for intersection
//        int[] array1 = {4,9,5};
//        int[] array2 = {9,4,9,8,4};
//        System.out.println(Arrays.toString(intersection(array1, array2)));

        //test cases for plus one
//        int[] array = {9};
//        System.out.println(Arrays.toString(plusOne(array)));

        //Test cases for move zero
//        int[] array = {0,1,0,3,12};
//        int[] array = {0};
//        moveZeros(array);

        //Test case for two sum
        //int[] array = {2,7,11,15};
//        int[] array = {3,3};
//        int target = 6;
//        System.out.println(Arrays.toString(twoSums(array,target)));

        //Test reverse integer
        System.out.println(reverseInt(120));
    }
    //21. method to reverseArray a string and compare
    private static void reverseString(String A) {
        {
            StringBuilder s = new StringBuilder();
            for(int i = A.length() -1; i >= 0; i--) {
                s.append(A.charAt(i));
            }
            if(s.toString().equals(A)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

   //22. Method to Remove Duplicates from Sorted Array
   public static  int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
                if(nums[j] != nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
        }
        return i + 1;
   }

   //23. Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
   public static void rotate(int[] nums, int k) {
//       ArrayList<Integer> list = new ArrayList<>();
//       int diff = nums.length - k;
//       for(int i = diff; i < nums.length; i++) {
//           list.add(nums[i]);
//       }
//       for(int i = 0; i <= k; i++) {
//           list.add(nums[i]);
//       }
//       for(int i = 0; i < nums.length; i++) {
//           nums[i] = list.get(i);
//       }
       k %= nums.length;
       reverseArray(nums, 0, nums.length -1);
       reverseArray(nums, 0 ,k -1);
       reverseArray(nums, k, nums.length -1);
       System.out.println(Arrays.toString(nums));
   }

   private static void reverseArray(int[] array, int start, int end) {
        while(start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
   }

   //24. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //25. Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        for(int i = 0; i < nums.length; i++) {
            boolean flag = false;
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j] ) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                return nums[i];
            }
        }
        return -1;
    }

    //26. Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
    // appear as many times as it shows in both arrays and you may return the result in any order.

    public static int[] intersection(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while ( i < a1.length && j < a2.length) {
            if(a1[i] < a2[j]) {
                i++;
            } else if (a1[i] > a2[j]) {
                j++;
            } else {
                list.add(a1[i]);
                i++;
                j++;
            }
        }
        int[] newArray = new int[list.size()];
        for(int k = 0; k < newArray.length; k++) {
            newArray[k] = list.get(k);
        }
        return newArray;
    }

    //27. Increment the large integer by one and return the resulting array of digits.
    public static int[] plusOne(int[] nums) {
        for(int i = nums.length - 1; i>=0; i--) {
            if(nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }
        int[] newArray = new int[nums.length + 1];
        newArray[0] = 1;
        return  newArray;
    }

    //28. Method to move zeros to end of array
    public static void moveZeros(int[] nums) {
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                list.add(nums[i]);
            } else {
                counter++;
            }
        }
        for(int j = 0; j < counter; j++) {
            list.add(0);
        }
        for(int k = 0; k < list.size(); k++) {
            nums[k] = list.get(k);
        }
        System.out.println(Arrays.toString(nums));
    }

    //29. Method to return the index of two numbers whose sum equals given target
    public static int[] twoSums(int[] nums, int target) {
        int[] array = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return nums;
    }

    //30. Given a signed 32-bit integer x, return x with its digits reversed.
    // If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

    public static int reverseInt(int x) {
        long temp = 0;
        while (x != 0) {
            temp = (temp * 10) + (x % 10);
            x /= 10;
        }
        return (temp < Integer.MIN_VALUE || temp > Integer.MAX_VALUE) ? 0 : (int) temp;
    }
}
