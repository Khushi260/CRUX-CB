import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		for (int i = 0; i < T; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			int target = scn.nextInt();
			int ans = 0;
			int diff = Integer.MAX_VALUE;
			for (int k = 0; k < n; k++) {
				for (int l = k + 1; l < n; l++) {
					if (arr[k] + arr[l] == target) {
						if (diff > Math.abs(arr[l] - arr[k])) {
							diff = Math.abs(arr[l] - arr[k]);
							if (arr[k] <= arr[l]) {
								ans = arr[k];
							} else {
								ans = arr[l];
							}
						}
					}
				}
			}
			System.out.println("Deepak should buy roses whose prices are " + ans + " and " + (target - ans) + ".");
			System.out.println();
		}
	}
}
