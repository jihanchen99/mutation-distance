import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test(expected=IllegalArgumentException.class)
	public void testX1TooSmall() {
		Distance.distance(-100, 75.1652, 21.3069, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testX1TooLarge() {
		Distance.distance(100, 75.1652, 21.3069, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testY1TooSmall() {
		Distance.distance(-60, -200, 21.3069, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testY1TooLarge() {
		Distance.distance(-60, 200, 21.3069, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testX2TooSmall() {
		Distance.distance(21, 75.1652, -100, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testX2TooLarge() {
		Distance.distance(21, 75.1652, 100, 157.8583);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testY2TooSmall() {
		Distance.distance(-60, 157, 21.3069, -200);
	}

	@Test(expected=IllegalArgumentException.class)
	public void testY2TooLarge() {
		Distance.distance(-60, 157, 21.3069, 200);
	}

	@Test
	public void testDistanceOfRomeToParis() {
		double result = Distance.distance(41.8967, 12.4822, 48.8575, 2.3514);
		assertEquals(691.4056, result,10);
	}

	@Test
	public void testDistanceOfSydneyToWellington() {
		double result = Distance.distance(-33.8688, 151.2093, -41.2924, 174.7787);
		assertEquals(1392.7646, result,10);
	}

	@Test
	public void testX2Negative90() {
		double result = Distance.distance(-33.8688, 151.2093, -90, 174.7787);
		assertEquals(3904.9815, result,10);
	}

	@Test
	public void testX1Negative90() {
		double result = Distance.distance(-90, 151.2093, -41.2924, 174.7787);
		assertEquals(3388.5304, result,10);
	}

	@Test
	public void testY1Negative180() {
		double result = Distance.distance(90, -180, -41.2924, 174.7787);
		assertEquals(9133.8578, result,10);
	}

	@Test
	public void testX2Is90() {
		double result = Distance.distance(41.8967, 12.4822,90, 174.7787);
		assertEquals(3346.49, result,10);
	}

	@Test
	public void testY2Is180() {
		double result = Distance.distance(41.8967, 12.4822, -41.2924, 180);
		assertEquals(11872.1835, result,10);
	}

	@Test
	public void testY1Is180() {
		double result = Distance.distance(-33.8688, 180, -41.2924, 174.7787);
		assertEquals(590.9696, result,10);
	}

	@Test
	public void testY2Negative180() {
		double result = Distance.distance(50, -50, 88, -180);
		assertEquals(2873.8323, result,10);
	}

	@Test
	public void testX1Is45() {
		double result = Distance.distance(45, -50, 88, -180);
		assertEquals(3221.4163, result,10);
	}

}
