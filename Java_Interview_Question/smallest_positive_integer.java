
/**
 * Write a function that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A. <br/>
 * For example, given <code>A = [1, 3, 6, 4, 1, 2]</code>, the function should return 5. <br/>
 * Given <code>A = [1, 2, 3]</code>, the function should return 4. <br/>
 * Given <code>A = [-1, -3]</code>, the function should return 1. <br/>
 * <br/>
 * Write an efficient algorithm for the following assumptions: <br/>
 * N is an integer within the range <code>[1..100,000]</code>. <br/>
 * Each element of array A is an integer within the range <code>[-1,000,000..1,000,000]</code>. <br/>
 * <br/>
 * Max time for resolution: 30 minutes.
 */

public class smallest_positive_integer {

    public static int solution(int[] A) {
        if (A == null || A.length == 0) {
    		return 1;
    	}
        
        boolean[] visitedPositives = new boolean[1000000 + 1];
        for (int i=0; i < A.length; ++i) {
    		
    		// get current number
    		int current = A[i];
    		
    		// keep track of visited positive numbers
    		if (current > 0) {
    			visitedPositives[current] = true;
    		}
    	}

        for (int i = 1; i < visitedPositives.length; i++) {
    		if (!visitedPositives[i]) {
    			return i;
    		}
    	}
        return 10000001;
    }

    public static void main(String[] args) {
		
		int arr1[] = {1, 3, 6, 4, 1, 2}; // 5
        int arr2[] = {1, 2, 3}; // 4
        int arr3[] = {-1, -3}; // 1

		System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
	}
    
}
