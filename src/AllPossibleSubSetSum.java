import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubSetSum {

	static List<List<Integer>> allPossibleSubSet = new ArrayList<>();

	public static void main(String args[]) {

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(5);
		arr.add(3);
		arr.add(3);

		Integer sum = 3;
		List<Integer> subset = new ArrayList<>();
		allPossibleSubsets(arr, 0, subset);
		Integer count = 0;
		for (List<Integer> allSubsets : allPossibleSubSet) {
			Integer sumCount = allSubsets.stream().mapToInt(Integer::intValue).sum();
			if (sumCount == sum) {
				count++;
			}
		}

		System.out.println(count);

	}

	public static void allPossibleSubsets(List<Integer> arr, Integer index, List<Integer> subset) {

		if (arr.size() == index) {
			allPossibleSubSet.add(new ArrayList(subset));
			return;
		}

		allPossibleSubsets(arr, index + 1, subset);
		subset.add(arr.get(index));
		allPossibleSubsets(arr, index + 1, subset);
		subset.remove(subset.size() - 1);

	}

}
