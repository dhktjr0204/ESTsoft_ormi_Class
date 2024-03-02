package MiddleTest.test4;

import java.util.*;

public class WordInfo {
    private String longestWord="";
    private Map<String, Integer> wordCount;

    public void addWord(String word){
        wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        if(word.length()>longestWord.length()){
            longestWord=word;
        }
    }

    public String getLongestWord() {
        return longestWord;
    }

    public List<Map.Entry<String, Integer>> getMostFrequentWords(int topN){
        ArrayList<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCount.entrySet());
        sortedEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        return sortedEntries.subList(0, Math.min(topN, sortedEntries.size()));
    }
}
