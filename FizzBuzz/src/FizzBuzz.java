/**
 * FizzBuzz: Classic FizzBuzz coding challenge as described at: http://http://c2.com/cgi/wiki?FizzBuzzTest
 * <p>
 * @author Kent Crozier
 * @version 1
 * <p>
 * Assignment: Practice Code
 * Course: ADEV 1007
 * Section: 1
 * Date Created: 02-23-2016
 * Last Updated: 02-23-2016
 */
public class FizzBuzz
{
	public static void main(String[] args)
	{
		// Print the numbers from 1 to 100
		for (int x = 1; x <= 100; x++)
		{
			// Check for both multiples of three and five
			if (x % 3 == 0 && x % 5 == 0)
			{
				System.out.println("FizzBuzz");
			}
			// Check for just multiples of three
			else if (x % 3 == 0)
			{
				System.out.println("Fizz");
			}
			// Check for just multiples of five
			else if (x % 5 == 0)
			{
				System.out.println("Buzz");
			}
			// For all other multiples, print number
			else
			{
				System.out.println(x);
			}
		}
	}
}
