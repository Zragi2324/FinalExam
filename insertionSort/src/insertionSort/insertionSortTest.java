package insertionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class insertionSortTest {




	@Test
	public void testPositive( ) {

		int numbers[] = new int[5];

		numbers[0] =5;
		numbers[1] =4;
		numbers[2] =3;
		numbers[3] =2;
		numbers[4] =1;
	insertionSort aot = new insertionSort( numbers, 5);


	assertEquals(1,aot.checkPositives(numbers, 5));


	}
	@Test

public void testNegatives( ) {

		int numbers[] = new int[5];

		numbers[0] =-1;
		numbers[1] =-2;
		numbers[2] =-3;
		numbers[3] =-4;
		numbers[4] =-5;
	insertionSort aot = new insertionSort( numbers, 5);


	assertEquals(1,aot.checkNegatives(numbers, 5));


	}


	@Test

	public void testMixed( ) {

			int numbers[] = new int[5];

			numbers[0] =-1;
			numbers[1] =2;
			numbers[2] =0;
			numbers[3] =-4;
			numbers[4] =5;
		insertionSort aot = new insertionSort( numbers, 5);


		assertEquals(1,aot.checkMixed(numbers, 5));


		}





}
