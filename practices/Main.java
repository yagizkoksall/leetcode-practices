package practices;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        CountingWordsWithaGivenPrefix countingWordsWithaGivenPrefix = new CountingWordsWithaGivenPrefix();

        String[] words = {"pay","attention","practice","attend"};


        countingWordsWithaGivenPrefix.prefixCount(words,"at");


        MinimumCostOfBuyingCandiesWithDiscount test = new MinimumCostOfBuyingCandiesWithDiscount();
        int [] diziTest = {3,3,3,1};
        test.minimumCost(diziTest);

        OneBitAndTwoBitCharacters test1 = new OneBitAndTwoBitCharacters();
        int[] diziTest1 = {1,4,2,3};
        test1.isOneBitCharacter(diziTest1);

        CountEqualAndDivisiblePairsInAnArray test2 = new CountEqualAndDivisiblePairsInAnArray();
        int[] diziTest2 = {-4,-3,6,10,20,30};
        test2.countPairs(diziTest2,2);

      List<Integer> ints = new ArrayList<>();

      ContainsDuplicate duplicate = new ContainsDuplicate();
      duplicate.containsDuplicate(diziTest2);

        FindTheDistanceValueBetweenTwoArrays classTest = new FindTheDistanceValueBetweenTwoArrays();
        classTest.findTheDistanceValue(diziTest1,diziTest2,3);

    }
}
