package Work;

public class jv6 {

	public static void main(String[] args) {

		int arr[] = new int[6];

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 45 + 1);
			arr[i] = random;

			for (int j = 0; j < arr.length; j++) {
				if (i == j)
					continue;
				if (arr[j] == random) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		for(int i : arr) {
			System.out.print(i+ " ");
		}
	}
	
}
