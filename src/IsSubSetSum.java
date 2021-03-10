import java.util.ArrayList;
import java.util.List;

public class IsSubSetSum {

	static List<List<Integer>> subSetList = new ArrayList();

	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(7);
		Boolean isSubSetSum = value(arr, 7);
		System.out.println(isSubSetSum);
	}

	public static Boolean value(List<Integer> arr, Integer sum) {

		List<Integer> subset = new ArrayList<>();
		subSetValue(arr, 0, subset);
		for (List<Integer> subSetsValue : subSetList) {

			int sumOfOneList = subSetsValue.stream().mapToInt(Integer::intValue).sum();

			if (sumOfOneList == sum) {
				return true;
			}

		}
		return false;
	}

	public static void subSetValue(List<Integer> arr, int index, List<Integer> subset) {
		if (arr.size() == index) {
			subSetList.add(new ArrayList(subset));

			return;
		}

		subSetValue(arr, index + 1, subset);
		subset.add(arr.get(index));
		subSetValue(arr, index + 1, subset);
		subset.remove(subset.size() - 1);

	}

}
