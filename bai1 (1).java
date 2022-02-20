import java.util.Scanner;
public class bai1{
	public static void main(String[] args){
		int n, s;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("So phan tu cua day so: ");
			n = scanner.nextInt();
		} while (n < 0);
		int array[] = new int[n];

		System.out.println("\nNhap vao cac phan tu cua day: ");
    	for (int i = 0; i < n; i++) {
        	System.out.print("Nhap phan tu thu " + i + ": ");
        	array[i] = scanner.nextInt();
    	}

		System.out.println("\nDay so ban dau: ");
    	for (int i = 0; i < n; i++) {
        	System.out.print(array[i] + "\t");
    	}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				if (array[i] > array[j]) {
					s = array[i];
					array[i] = array[j];
					array[j] = s;
				}
			}
		}

		System.out.println("\nDay so sau khi sap xep la: ");
    	for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
    	}
 	}
}