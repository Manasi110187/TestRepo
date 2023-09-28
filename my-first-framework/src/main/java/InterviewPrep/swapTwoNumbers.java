package InterviewPrep;


import java.util.Stack;

public class swapTwoNumbers {
	
	public void swapNumbers(int a, int b)
	{
		Stack <Integer> swappedNumbers= new Stack<Integer>();
		swappedNumbers.push(a);
		swappedNumbers.push(b);
		System.out.print("Swapped numbers without using the third variable are ::");
		while(!swappedNumbers.isEmpty())
		{
			System.out.print(swappedNumbers.pop()+"  ");
		}
	
	}

}
