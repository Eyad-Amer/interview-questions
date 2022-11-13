import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class plqnSeat {
    public static int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        // Just code for rules, no need to merge intervals
		// Make sure you seat 2 families for rows with no reservations
        // Greedy approach
        // First possibility: Split seating at  [2, 3     4, 5]
        // Second possibility: Split seating at [6, 7     8, 9]
        // Only possibility:  Center four seats [  4, 5, 6, 7 ]
        
        int result = 0;
        Map<Integer, List<Integer>> rowToSeatRes = new HashMap<>();
        
        for(int i = 0; i < reservedSeats.length; i++) {
            if(rowToSeatRes.containsKey(reservedSeats[i][0])) {
                rowToSeatRes.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
            } else {
                rowToSeatRes.put(reservedSeats[i][0], new ArrayList<Integer>(Arrays.asList(reservedSeats[i][1])));
            }
        }
		
        // System.out.println(rowToSeatRes);
        result = (n - rowToSeatRes.size()) * 2;         // These rows do not contain any reservations
        
       for(List<Integer> res : rowToSeatRes.values()) { // Check possible family seating in each row 
            boolean flag = false;
            
			// Check first possibility
            if(!res.contains(2) &&
              !res.contains(3) &&
              !res.contains(4) &&
              !res.contains(5)) {
                result++;
                flag = true;
            }
            
            // Check second possibility
            if(!res.contains(6) &&
              !res.contains(7) &&
              !res.contains(8) &&
              !res.contains(9)) {
                result++;
                flag = true;
            }
            
            // Check middle seats only if first two are not used
            if(!flag) {
                if(!res.contains(4) &&
                   !res.contains(5) &&
                   !res.contains(6) &&
                   !res.contains(7))
                result++;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {

        int n = 2;
        int[][] reservedSeats = {{2,1},{1,8},{2,6}};

        System.out.println(maxNumberOfFamilies(n, reservedSeats));
        
    }
}