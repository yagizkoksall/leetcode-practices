package practices;

public class Main {

    public static void main(String[] args){

        CountingWordsWithaGivenPrefix countingWordsWithaGivenPrefix = new CountingWordsWithaGivenPrefix();

        String[] words = {"pay","attention","practice","attend"};


        countingWordsWithaGivenPrefix.prefixCount(words,"at");
    }
}
