package practices;

public class Main {

    public static void main(String[] args){

        CountingWordsWithaGivenPrefix countingWordsWithaGivenPrefix = new CountingWordsWithaGivenPrefix();

        String[] words = {"pay","attention","practice","attend"};


        countingWordsWithaGivenPrefix.prefixCount(words,"at");


        MinimumCostOfBuyingCandiesWithDiscount test = new MinimumCostOfBuyingCandiesWithDiscount();
        int [] diziTest = {3,3,3,1};
        test.minimumCost(diziTest);

        OneBitAndTwoBitCharacters test1 = new OneBitAndTwoBitCharacters();
        int[] diziTest1 = {1,0,0};
        test1.isOneBitCharacter(diziTest1);

        CountEqualAndDivisiblePairsInAnArray test2 = new CountEqualAndDivisiblePairsInAnArray();
        int[] diziTest2 = {1,2,3,4};
        test2.countPairs(diziTest2,2);

    }
}
