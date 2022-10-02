public class bi {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 7, 8, 9, 15 };
		int index = binarysearch(arr, 9);
		System.out.println("INDEX is" + index);
	}

	public static int binarysearch(int[] arr, int ele) {
		int s = 0;
		int e = arr.length - 1;
		int mid = (s + e) / 2;
		while (s <= e) {
			if (arr[mid] > ele) {
				e = mid - 1;
			} else if (arr[mid] < ele) {
				s = mid + 1;
			} else {
				return mid;
			}

		}
		return -1;
	}
}
