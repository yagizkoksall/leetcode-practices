package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingWordsWithaGivenPrefix {

    public List<String> prefixCount(String[] words, String pref) {
//        int prefLength = pref.length();
//        int count = 0;
//        for (int i = 0; i < words.length; i++){
//            if(words[i].length() < prefLength){
//                continue;
//            }
//            String wordsClone = "";
//            for(int j = 0 ; j < prefLength ; j++){
//                wordsClone += words[i].charAt(j);
//                if(pref.equals(wordsClone)){
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);
//        return count;

        int prefLength = pref.length();
//         count = 0;
//
//        for (int i = 0; i < words.length; i++) {
//            if (words[i].length() < prefLength) {
//                continue;
//            }
//            String wordsClone = words[i].substring(0, prefLength);
//            if (wordsClone.equals(pref)) {
//                count++;
//            }
//        }
        List<String> result = new ArrayList<>();
     Arrays.stream(words).filter(item -> isInterested(pref, prefLength, item)).forEach(result::add);

        return result;

//        System.out.println(count);
//        return count;

        

//        int c = 0;
//        for (String s : words) {
//            if (s.startsWith(pref))
//                c++;
//        }
//        return c;




    }

    private static boolean isInterested(String pref, int prefLength, String item) {
        return item.length() >= prefLength && item.substring(0, prefLength).equals(pref);
    }
}
