package com.RashidGafurov_INC_LOL;

import javafx.scene.effect.InnerShadow;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Exercise 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsToSet = new HashSet<>();
        for (Integer num : nums) {
            numsToSet.add(num);
        }
        System.out.println(numsToSet);

        //Exercise 2
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsToSet2 = new HashSet<>();
        for (Integer num : nums2) {
            if (num % 2 == 0) {
                numsToSet2.add(num);
            }
        }
        System.out.println(numsToSet2);

        //Exercise 3
        List<String> words = new ArrayList<>(List.of("one","one","two","three","four","five","one","two","three","four","five"));
        Set<String> wordsToSet =  new HashSet<>();
        for (String word : words) {
            wordsToSet.add(word);
        }
        System.out.println(wordsToSet);

        //Exercise 4
        HashMap<String, Integer> wordsMap= new  HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            if (wordsMap.containsKey(words.get(i))){
                int count = wordsMap.get(words.get(i)).intValue();
                wordsMap.put(words.get(i),++count);
            } else {
                wordsMap.put(words.get(i),1);
            }
        }
        System.out.println(wordsMap);
    }
}
