package com.java.practice;


import java.util.*;

public class PracticeMethods {
    //Take a string and remove a char at the n'th place
    public String missingChar(String str, int n) {
        String newStr = str.substring(0, n) + str.substring((n + 1));
        return newStr;
    }

    //Take a string and switch the place of the 1st and last character
    public String frontBack(String str) {
        if (str.length() > 1) {
            String front = str.substring(0, 1);
            String back = str.substring(str.length() - 1);
            String mid = str.substring(1, str.length() - 1);
            String newString = back + mid + front;
            return newString;
        } else {
            return str;
        }
    }

    //Take 1st 3 char's and repeat 3 times
    public String front3(String str) {
        if (str.length() >= 3) {
            String snip = str.substring(0, 3);
            String newStr = snip + snip + snip;
            return newStr;
        } else {
            return str + str + str;
        }
    }

    //check if string starts with "hi" return true otherwise return false
    public boolean startHi(String str) {
        //if string is 2 or more characters continue
        if (str.length() >= 2) {
            //you need to use .equals can't use ==
            if (str.substring(0, 2).equals("hi")) {
                return true;
            } else {
                return false;
            }
        } else //if sting is less than 2 char's then it's not "hi"
        {
            return false;
        }
    }

    //Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
    public String delDel(String str) {
        if (str.indexOf("del") == 1) {
            String newStr = str.replace("del", "");
            return newStr;
        } else {
            return str;
        }
    }

    //Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z'
    // remember char takes '' while strings take ""
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    //output's the amount of char's in string
    public int countChar(String str, char chr) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chr) {
                count++;
            }
        }
        return count;
    }

    //Check if last number is the same
    public boolean checkLast(int a, int b) {
        int a2 = a % 10;
        int b2 = b % 10;
        if (a2 == b2) {
            return true;
        } else {
            return false;
        }
    }

    //count amount of occurrences of last 2 of the string
    public int last2(String str) {
        if (str.length() <= 2) {
            return 0;
        } else {
            String newStr = str.substring(str.length() - 2);
            int count = 0;
            //str.length() - 2 so that it stops at the occurrence of the last 1
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(newStr)) {
                    count++;
                }
            }
            return count;
        }
    }

    //count # of 9's in an array
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    //counts the amount of times a 2 long sequence appears in a string at the same index
    public int stringMatch(String a, String b) {
        String shortest = "";
        if (a.length() < b.length()) {
            shortest = a;
        } else {
            shortest = b;
        }
        int count = 0;
        for (int i = 0; i < shortest.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    //remove 'x' from everywhere in given string other than the very front and end
    public String stringX(String str) {
        String newStr = "";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                newStr += str.charAt(i);
            }
        }
        String finStr = "";
        if (str.length() > 2) {
            return str.substring(0, 1) + newStr + str.substring(str.length() - 1);
        } else {
            return str;
        }
    }

    //Check for any occurrence of string "yak" where the 'a' can be any character and removes it
    public String stringYak(String str) {
        String newStr = "";
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                newStr += str.charAt(i);
            }
            if (i == str.length() - 3) {
                newStr += str.substring(i + 1);
            }
        }
        return newStr;
    }

    //return true if array has 3 numbers of the same kind next to each other
    public boolean noTriples(int[] nums) {
        for (int i = 0; i <= nums.length - 3; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    /*Given an array of ints, return true if it contains a 2, 7, 1 pattern:
     a value, followed by the value plus 5, followed by the value minus 1.
     Additionally, the 271 counts even if the "1" differs by 2 or less from the correct value.
     */
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == nums[i] + 5 && Math.abs(nums[i] - 1 - nums[i + 2]) <= 2) {
                return true;
            }
        }
        return false;
    }

    //Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
    //Map<String, String> if it says <Int, String> the map will take an int and string value instead
    //Map<String, String> map --> This argument is a map that takes 2 strings named "map"
    //Example of creating a map:
    /*
    Map<String, String> hoy = new HashMap<String, String>();
        hoy.put("a", "big");
        hoy.put("b", "boof");
        hoy.put("c", "apple");
     */
    //or:
    /*
        private static final Map<String, String> m = new HashMap<String, String>() {{
            put("RC", "T1");
            put("AC", "T1");
        }};
     */
    //static void mapBully(Map<String, String> map){}
    //^this would not have to return anything because void
    //static Map<String, String> will return a Map<String, String>
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    //loop's through an array of ints and returns and array of 2 numbers that add up to the target value

    //int[] ho = {3,4,5,6,2,5,6};
    //System.out.println(Arrays.toString(twoSum(ho,5)));
    //^Use this as an example to pass
    public int[] twoSum(int[] nums, int target) {
        int[] arr = {0, 0};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int x = i + 1; x < nums.length; x++) {
                if (nums[i] + nums[x] == target) {
                    arr[0] = i;
                    arr[1] = x;
                }
            }
        }
        return arr;
    }

    //public = any class can access
    //This method returns Map<String, Integer>
    //The method takes an array of strings as an argument
    //It returns a Map<String, Integer>

    //String[] boof = {"a","b","c","d","e"};
    //System.out.println(word0(boof));
    //^example of calling it in main
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> newMap = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            newMap.put(strings[i], 0);
        }
        return newMap;
    }

    /*
    The classic word-count algorithm:
    given an array of strings, return a Map<String, Integer> with a key for each different string,
    with the value the number of times that string appears in the array.
     */
//make a new map with the letters and values being 0
//and then count newMap for numbers and add into the new map
//populate newMap with (num, 0)
//add one every time you see the letter
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> newMap = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            newMap.put(strings[i], 0);
        }
        for (int x = 0; x < strings.length; x++) {
            newMap.put(strings[x], newMap.get(strings[x]) + 1);
        }
        return newMap;
    }

    //looping through an array
    //int[] ho = {3,4,5};
    //System.out.println(Arrays.toString(loopThrough(ho)));
    public int[] loopThrough(int[] nums) {
        int count = 1;
        for (int i : nums) {
            System.out.println(nums[nums.length - count]);
            count++;
        }
        return nums;
    }

    /*
    Given an array of non-empty strings,
    return a Map<String, String> with a key for every different first character seen,
    with the value of all the strings starting with that character
    appended together in the order they appear in the array.
     */
    /*
    String[] str = {"a", "b", "aAA", "bBB","monkeys", "are", "fucking", "majestic", "fly", "you", "fools"};
    System.out.println(firstChar(str));
    */
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> newMap = new HashMap<String, String>();
        for (String s : strings) {
            if (!newMap.containsKey(s.substring(0, 1))) {
                String newString = "";
                for (String x : strings) {
                    if (x.substring(0, 1).equals(s.substring(0, 1))) {
                        newString += x;
                    }
                }
                newMap.put(s.substring(0, 1), newString);
            }
        }
        return newMap;
    }

    //check if int is a palindrome
    boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x;
        if (x >= 0) {
            while (x != 0) {
                int lastPlace = x % 10;
                x /= 10;
                reversed = reversed * 10 + lastPlace;
            }
            if (original == reversed) {
                return true;
            }
        }
        return false;
    }

    //reverse an int and check for overflow
    //if overflow return 0
    //System.out.println(reverse(-1299999999));
    int reverse(int x) {
        int reversed = 0;
        while (Math.abs(x) > 0) {
            int digit = x % 10;

            if (reversed > Integer.MAX_VALUE / 10) {
                return 0;
            } else if (reversed < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int mult = reversed * 10;
            if (Integer.MAX_VALUE - mult > digit || Integer.MIN_VALUE - mult < digit) {
                reversed = mult + digit;
            }
            x /= 10;
        }
        return reversed;
    }

    //square root
    int mySqrt(int x) {
        for (int i = 0; i < 46341; i++) {
            if (i * i > x) {
                return i - 1;
            } else if (i * i == x) {
                return i;
            }
        }
        return 46340;
    }

    //return a string adding on every 2nd 4th 6th occurrence of the same string
    /*
    String[] str = {"a", "b", "b", "horse", "b", "horse", "a", "b", "horse", "a", "b", "b", "horse"};
    System.out.println(wordAppend(str));
     */
    String wordAppend(String[] strings) {
        Map<String, Integer> count = new HashMap<String, Integer>();
        String newStr = "";
        for (String s : strings) {
            if (!count.containsKey(s)) {
                count.put(s, 0);
            }
            if (count.containsKey(s)) {
                count.put(s, count.get(s) + 1);
                if (count.get(s) % 2 == 0) {
                    newStr += s;
                }
            }
        }
        return newStr;
    }

    /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    Return true if it is possible to make the goal by choosing from the given bricks.
     */
    boolean makeBricks(int small, int big, int goal) {
        int numBig = goal / 5; //amount of big bricks that fit into goal
        int leftOver = 0;
        //if amount of big bricks fitting into goal is less than or = to big bricks on hand
        if (numBig <= big) {
            //leftover is goal minus amount of big bricks that fit in without overflowing
            leftOver = goal - (numBig * 5);
        }
        //if there are less big bricks on hand than the amount og big bricks that can fit into goal
        if (numBig > big) {
            //leftover is goal - amount of big bricks on hand
            leftOver = goal - big * 5;
        }
        //if leftoves is less than or = to amount of small bricks return true otherwise return false
        if (leftOver <= small) {
            return true;
        }
        return false;
    }

    /*
    Given 3 int values, a b c, return their sum.
    However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
    Write a separate helper "public static int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
    In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
    Define the helper below and at the same indent level as the main noTeenSum().
     */
//-------------------------------------------------------------------------------------------------------------
    public int noTeenSum(int a, int b, int c) {
        int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
        return sum;
    }

    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19) {
            if (n == 15) {
                return 15;
            } else if (n == 16) {
                return 16;
            } else {
                return 0;
            }
        }
        return n;
    }

    //-------------------------------------------------------------------------------------------------------------
/*
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10.
Given 3 ints, a b c, return the sum of their rounded values.
To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
Write the helper entirely below and at the same indent level as roundSum().
 */
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public static int round10(int num) {
        if (num % 10 >= 5) {
            num = (num / 10) * 10 + 10;
        } else {
            num = (num / 10) * 10;
        }
        return num;
    }

    //-------------------------------------------------------------------------------------------------------------
/*
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.
 */
    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1) {
            if (Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) {
                return true;
            }
        } else if (Math.abs(a - c) <= 1) {
            if (Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2) {
                return true;
            }
        }
        return false;
    }

    //check if ints are spaced evenly
    public boolean evenlySpaced(int a, int b, int c) {
        int max = 0;
        int mid = 0;
        int min = 0;
        if (a == b && a == c && c == b) {
            return true;
        }
        if (a > b && a > c) {
            max = a;
            if (b > c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b > a && b > c) {
            max = b;
            if (a > c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else if (c > a && c > b) {
            max = c;
            if (a > b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        } else {
            return false;
        }
        if (max - mid == mid - min) {
            return true;
        } else {
            return false;
        }
    }

    /*
    We want make a package of goal kilos of chocolate.
    We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars.
    Return -1 if it can't be done.
     */
    public int makeChocolate(int small, int big, int goal) {
        int bigB = (goal / 5) * 5;
        int leftover = bigB - big * 5;
        int amtB = 0;
        if (leftover <= 0) {
            amtB = bigB;
        } else if (leftover > 0) {
            amtB = big * 5;
        }
        int smallS = goal - amtB;
        if (small >= smallS) {
            return smallS;
        }
        return -1;
    }

    //recursion factorial
    int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);

    }

    //make double chars in a string
    public String doubleChar(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr = newStr + str.charAt(i) + str.charAt(i);
        }
        return newStr;
    }

    //counts amount og "hi" in string
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    //---------------------------------------------------------------------------
    //check whether or not a string appears the same amount of times as the other string inside  a string
    public boolean strCheck(String str, String str1, String str2) {
        if (count(str, str1) == count(str, str2)) {
            return true;
        } else {
            return false;
        }
    }

    public int count(String str, String strSearch) {
        int count = 0;
        int length = strSearch.length() - 1;
        for (int i = 0; i < str.length() - length; i++) {
            if (str.substring(i, i + length + 1).equals(strSearch)) {
                count++;
            }
        }
        return count;
    }

    //-------------------------------------------------------------------------
    //counts the amount of times string "code" ap[ears where the "d" can be any character
    public int countCode(String str) {
        //code
        int count = 0;
        if (str.length() >= 4) {
            for (int i = 0; i < str.length() - 3; i++) {
                if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }

    public boolean endOther(String a, String b) {
        String short1 = "";
        String long1 = "";
        //find the shortest and longest string
        if (a.length() >= b.length()) {
            short1 = b.toLowerCase();
            long1 = a.toLowerCase();
        } else {
            short1 = a.toLowerCase();
            long1 = b.toLowerCase();
        }
        //check if short is at the end of long
        //check length of short
        //ex: abc length 3
        //ex: abcd
        int length = short1.length();
        if (long1.substring(long1.length() - length).equals(short1)) {
            return true;
        } else {
            return false;
        }
    }

    //returns the longest common prefix of a string
    public String longestCommonPrefix(String[] strs) {
        //find the shortest string
        String newStr = "";
        int length = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < length) {
                newStr = s;
                length = newStr.length();
            }
        }
        for (String s : strs) {
            while (length >= 0) {
                if (length == 0) {
                    newStr = "";
                    break;
                }
                if (!s.substring(0, length).equals(newStr.substring(0, length))) {
                    length--;
                    newStr = newStr.substring(0, length);
                } else {
                    break;
                }
            }
        }
        return newStr;
    }

    //lambada to double values in a list
    /*
    List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(doubling(list));
     */
    public List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    //return true if array has 2 or more of the same value
    //I used 2 maps in here can use 1
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<String, Integer>();
        Map<String, Boolean> bool = new HashMap<String, Boolean>();
        //if string appears 2 or more times add strung true
        //count the strings and amount of keys
        //if we haven't seen the sting before add it with value 1
        //if we have add 1 to it
        //this makes a map that returns amount of times you see a key
        for (String s : strings) {
            if (!count.containsKey(s)) {
                count.put(s, 1);
            } else {
                count.put(s, count.get(s) + 1);
            }
        }
        //this loops through the previous map and adds values to the other map with true if value is seen morethan twice
        for (String s : count.keySet()) {
            if (count.get(s) >= 2) {
                bool.put(s, true);
            } else {
                bool.put(s, false);
            }
        }
        return bool;
    }

    /*
    Consider the leftmost and rightmost appearances of some value in an array.
    We'll say that the "span" is the number of elements between the two inclusive.
    A single value has a span of 1.
    Returns the largest span found in the given array. (Efficiency is not a priority.)
     */
    public int maxSpan(int[] nums) {
        //check greatest length between 1st value and last occurence
        //check greatest length between last value and first occurence
        //go backwards
        int length1 = 0, length2 = 0;
        //find length of leftmost
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == nums[0]) {
                int count = 0;
                for (int x = 0; x <= i; x++) {
                    count++;
                }
                length1 = count;
                break;
            }
        }
        //find length of rightmost
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == nums[nums.length - 1]) {
                int count = 0;
                for (int x = nums.length - 1; x >= i; x--) {
                    count++;
                }
                length2 = count;
                break;
            }
        }
        if (length1 >= length2) {
            return length1;
        } else {
            return length2;
        }
    }

    /*
    Return an array that contains exactly the same numbers as the given array,
    but rearranged so that every 3 is immediately followed by a 4.
    Do not move the 3's, but every other number may move.
    The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
    and a 3 appears in the array before any 4.
     */
    public int[] fix34(int[] nums) {
        //figure out where the 3's are and what the numbers after them are
        //find next 4 and replace it with what comes after 1st 3
        //if 4 doesn't follow 3 check find the number after 3 switch 4 with it and i = 0
        //2, 3, 2, 3, 2, 4, 4    //2,3,4,3,2,2,4  //2,3,4,3,4,2,2
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                //search for position of next 4 (without a 3 behind it)and switch it with nums[i+1]
                for (int x = 0; x < nums.length; x++) {
                    if (nums[x] == 4 && nums[x - 1] != 3) {
                        nums[x] = nums[i + 1];
                        nums[i + 1] = 4;
                        i = 0;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    /*
    Return an array that contains exactly the same numbers as the given array,
    but rearranged so that every 4 is immediately followed by a 5.
    Do not move the 4's, but every other number may move.
    The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
    In this version, 5's may appear anywhere in the original array.
     */

    public int[] fix45(int[] nums) {
        //if 4 isn't followed by a 5
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int x = 0; x < nums.length; x++) {
                    //if 5 is at position 0 you will get an error if you do x-1
                    if (x == 0 && nums[x] == 5) {
                        nums[x] = nums[i + 1];
                        nums[i + 1] = 5;
                        i = 0;
                        break;
                    } else if (nums[x] == 5 && nums[x - 1] != 4) {
                        nums[x] = nums[i + 1];
                        nums[i + 1] = 5;
                        i = 0;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    //reverse an array of strings without changing the array storage
    public char[] reverseString(char[] s) {
        //if array.length is odd then go back and forth until you get to the middle
        //don't change middle number
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
        return s;
    }

    /*
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order.
    The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
     */
    public int[] plusOne(int[] digits) {
        //add 1 to last place if 9 last place is 0 2nd 2 last is add one so on
        //if index 0 is 9 make new array with 1 in index 0 and add the array with everything already added up
        int n = digits.length;
        int[] newArr = new int[n + 1];
        //add 1 to last place
        digits[digits.length - 1] += 1;
        //while array contains 10 change 10 to 0 and change digits[i-1] to digits[i-1] += 1;
        //while array contains 10 and 10 isn't in digits[0]
        while (Arrays.stream(digits).anyMatch(x -> x == 10)) {
            if (digits[0] != 10) {
                for (int i = 1; i <= digits.length - 1; i++) {
                    if (digits[i] == 10) {
                        digits[i] = 0;
                        digits[i - 1] += 1;
                    }
                }
            } else {
                digits[0] = 0;
                newArr[0] = 1;
                for (int i = 1; i <= newArr.length - 1; i++) {
                    newArr[i] = digits[i - 1];
                }
                return newArr;
            }
        }
        return digits;
    }

    /*
    Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.
     */
    public boolean isHappy(int n) {
        List<Integer> newList = new ArrayList<>();
        int sum = 0;
        while(sum != 1){
            sum = 0;
            while(n > 0){
                //23
                int last = n%10;
                sum = sum + (last)*(last);
                n = n/10;
            }
            n = sum;
            if(newList.contains(n)){
                return false;
            } else {
                newList.add(n);
            }
        }
        return true;
    }

    //main
    public static void main(String[] args) {
        PracticeMethods practice = new PracticeMethods();
        int[] arr = new int[]{9, 8, 5, 3, 4, 5, 6, 7, 9};

        System.out.println(Arrays.toString(practice.plusOne(arr)));

        System.out.println(practice.isHappy(19));


    }
}