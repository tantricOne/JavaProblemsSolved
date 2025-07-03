import java.util.Arrays;

public class CodingProblemsEasyCollection4 {

    public static void main(String[] args) {

        //test uniqueCharacter
//        String s = "aabb";
//        System.out.println(uniqueCharacter(s));

        //Test isAnagram
//        System.out.println(isAnagram("madam","modam"));

        //test isPalindrome
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome(" "));

        //test cases for haystack and needle
//        System.out.println(strStr("sadbutsad","sad"));
//        System.out.println(strStr("Kamala","mal"));

        //test cases for longest common prefix
//            String[] strs = new String[]{"flower", "flow", "flight"};
//        System.out.println(longestCommonPrefix(strs));

        //test merge sorted array
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        System.out.println(Arrays.toString(mergeArray(nums1,m,nums2,n)));
    }

    //31. Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
    public static int uniqueCharacter(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            boolean flag = false;
            for(int j = 0; j < c.length; j++) {
                if( i != j && c[i] == c[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                return i;
            }
        }
        return -1;
    }

    //32. Method to check if given strings are anagram
    public static boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }

    //33. Method to check if given string is palindrome
    public static boolean isPalindrome(String s) {
        if(s.equals(" ")) {
            return true;
        }
        String s1= s.toLowerCase().replaceAll("[^A-Za-z]+","");
        System.out.println(s1);
        StringBuilder s2 = new StringBuilder();
        for(int i = s1.length() -1; i >=0; i--) {
            s2.append(s1.charAt(i));
        }
        System.out.println(s2);
        return s1.equals(String.valueOf(s2));
    }

    //34. Given two strings needle and haystack,
    // return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    public static int strStr(String haystack, String needle) {
        if(haystack.length() <= 0 || needle.length() <= 0) {
            return -1;
        }
        if(haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return  -1;
    }

    //35. Write a function to find the longest common prefix string amongst an array of strings.
    //If there is no common prefix, return an empty string "".
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length < 0) {
            return "";
        }
        String prefix = strs[0];
        for (String s : strs) {
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length() - 1);
            }
        }
        return prefix;
    }

    /*36.You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
    and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
    To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
    and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     */

    public static int[] mergeArray(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0) {
            return nums2;
        } else if(n == 0) {
            return nums1;
        }
        int x = nums1.length - n;
        int y = 0;
        for(int i = x; i < nums1.length; i++) {
            nums1[i] = nums2[y];
            y++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
