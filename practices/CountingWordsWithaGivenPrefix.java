package practices;

public class CountingWordsWithaGivenPrefix {

    public int prefixCount(String[] words, String pref) {
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
//
        int prefLength = pref.length();
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < prefLength) {
                continue;
            }
            String wordsClone = words[i].substring(0,prefLength);
            if(wordsClone.equals(pref)){
                count++;
            }
        }

        System.out.println(count);
        return count;

    }

//  Best solution    int c = 0;
//    for(String s : words) {
//        if(s.indexOf(pref)==0)
//            c++;
//    }
//    return c;

}
