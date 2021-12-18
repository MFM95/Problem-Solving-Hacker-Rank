import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static int maximumToys(List<Integer> prices, int k) {
        Long sum = 0L;
        int count = 0;
        Collections.sort(prices);
        for (int i = 0; i<prices.size(); i++) {
            sum+= prices.get(i);
            if (sum <= k) {
                count ++;
            } else {
                break;
            }
        }
        return count;
    }
}
