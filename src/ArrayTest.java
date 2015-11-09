import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class ArrayTest {
	
	

	@Test
	public void test() {
		
		Random rand = new Random();

		//create and run tests on 1000 arrays
		for (int i=0; i<1000; i++){
			
			//create arrays of random length. all have the same length
			//second two will get sorted. Length must be between 1 and 1000
			//so JVM doesn't run out of memory
		
			int n = rand.nextInt(1000)+1;
			
			int[] randomArray = new int[n];
			int[] sortedArray1 = new int[n];
			int[] sortedArray2 = new int[n];
			
			//fill array with random values
			for (int j=0; j<randomArray.length;j++){
				int temp = rand.nextInt();
				randomArray[j] = temp;
				sortedArray1[j] = temp;
				sortedArray2[j] = temp;
				
			}
			
			//sort array twice
			Arrays.sort(sortedArray1);
			Arrays.sort(sortedArray2);
			
			//Checks purity- running it twice on 
			//same input array should result in same output array.
			assertArrayEquals(sortedArray1, sortedArray2);
			
			//checks that output length = input length
			assertEquals(randomArray.length, sortedArray1.length);
			
			//checks that values in output array always increase
			//or stay the same
			for (int j=1; j<sortedArray1.length;j++){
				assertTrue(sortedArray1[j] >= sortedArray1[j-1]);
			}
			
			
		}
		
	
		
		
		
		
	}

}
