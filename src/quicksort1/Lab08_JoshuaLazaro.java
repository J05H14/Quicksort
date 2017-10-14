package quicksort1;

public class Lab08_JoshuaLazaro {
	public static void main(String[] args){
		int[] list = {10, 5, 3, 4, 7, 1, 2, 9, 8, 6};
		
		System.out.println("Starting List");
		for(int num : list){
			System.out.print(num + " ");
		}
		System.out.println();
		
		
		quickSort(list, 0, list.length - 1);
		System.out.println("Quicksort");
		for(int num : list){
			System.out.print(num + " ");
		}
		System.out.println();
		
		int[] list2 = {10, 5, 3, 4, 7, 1, 2, 9, 8, 6};
		
		System.out.println("Starting List");
		for(int num : list2){
			System.out.print(num + " ");
		}
		System.out.println();
		
		randomQuicksort(list2, 0, list2.length - 1);
		System.out.println("Randomized Quicksort");
		for(int num : list2){
			System.out.print(num + " ");
		}
	}
	
	public static int partition(int[] list, int p, int r){
		int partition = list[r];
		int i = p - 1;
		
		
		for(int j = p; j < r; j++){
			if(list[j] <= partition){
				i++;
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
		}
		
		int temp = list[i + 1];
		list[i + 1] = list[r];
		list[r] = temp;
		
		return i + 1;
	}
	
	public static void quickSort(int[] list, int p, int r){
		if(p < r){
			int q = partition(list, p, r);
			quickSort(list, p, q - 1);
			quickSort(list, q + 1, r);
		}
	}
	
	public static int randomPartition(int[] list, int p, int r){
		int i = (int) (Math.random() * (list[r] - list[p]) + list[p]);
		
		int temp = list[r];
		list[r] = list[i];
		list[i] = temp;
		
		return partition(list, p, r);
	}
	
	public static void randomQuicksort(int[] list, int p, int r){
		if(p < r){
			int q = randomPartition(list, p, r);
			randomQuicksort(list, p, q - 1);
			randomQuicksort(list, q + 1, r);
		}
	}
}
