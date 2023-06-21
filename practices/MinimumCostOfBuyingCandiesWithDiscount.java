package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }

        Arrays.sort(cost);
        int output = 0;
        for (int i = cost.length - 1; i >= 0; i-=3) {
            if(i == 0){
                output += cost[i];
                continue;
            }

            output += cost[i] + cost[i - 1];
        }


        return output;

    }

}
