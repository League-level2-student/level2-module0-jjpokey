package arrays;

import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] a = {"1", "2", "3", "4", "5"};
		//2. print the third element in the array
		System.out.println(a[2]);
		//3. set the third element to a different value
		a[2] = a[2].replace("3", "10");
		//4. print the third element again
		System.out.println(a[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		//6. make an array of 50 integers
		int fifty[] = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		
		
		for(int A = 0; A < 50; A++) {
			Random r = new Random();
			int R = r.nextInt(100);
			fifty[A] = R;
			System.out.println(fifty[A]);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int L = fifty[0];
		for(int B = 0; B < fifty.length; B++) {
			if(fifty[B] < L) {
				L = fifty[B];
				
			}
			
		}
		System.out.println(L);
		//9 print the entire array to see if step 8 was correct
		for(int C = 0; C < fifty.length; C++) {
			System.out.println(fifty[C]);
		}
		//10. print the largest number in the array.
		int L2 = fifty[0];
		for(int D = 0; D > fifty.length; D++) {
			if(fifty[D] < L2) {
				L2 = fifty[D];
				
			}
			
	}
		System.out.println(L2);
}
}
