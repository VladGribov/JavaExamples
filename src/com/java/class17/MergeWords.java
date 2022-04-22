package com.java.class17;

public class MergeWords {
    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceae
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        String word1 = "ice";
        String word2 = "sea";
        System.out.println("Merging words: " + word1 + ", " + word2);
        System.out.println(printMerge(word1, word2));
        System.out.println(printMerge("hi", "bye"));
        System.out.println(printMerge("abc", "z"));
    }
    static String printMerge(String word1, String word2) {
        String merged = "";
        String shortest = "";
        String longest = "";
        if(word1.length() > word2.length()){
            shortest = word2;
            longest = word1;
        } else {
            shortest = word1;
            longest = word2;
        }

        if(word1.length() <=3 && word2.length() <= 3){
            for(int i = 0; i < shortest.length(); i++){
                if(word1.equals(shortest)){
                    if(i == shortest.length() - 1){
                        merged = merged + word1.charAt(i) + word2.substring(i);
                        break;
                    }
                }
                if(word2.equals(shortest)){
                    if(i == shortest.length() -1){
                        if(word2.length() == 1){
                            merged = merged + word1.charAt(i) + word2.charAt(i) + word1.substring(i+1);
                            break;
                        }
                        merged = merged + word2.charAt(i) + word1.substring(i);
                        break;
                    }
                }

                merged = merged + word1.charAt(i) + word2.charAt(i);
            }
        }else{
            merged = "Incorrect input! Cannot merge";
        }
        return merged;
    }
}
