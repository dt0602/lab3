import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testPlace1() {
    int[] i1 = {4, 5, 6, 7 , 8, 9};
    ArrayExamples.reverseInPlace(i1);
    assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4}, i1);
  }

  @Test
  public void testReversed1() {
    int[] input1 = {4, 5, 6, 7 , 8, 9};
    assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4}, ArrayExamples.reversed(input1));
  }

}
