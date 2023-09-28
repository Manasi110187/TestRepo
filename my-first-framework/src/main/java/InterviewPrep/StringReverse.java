package InterviewPrep;

public class StringReverse {

	public String stringReverse (String input)
	{
		String reversedString= "";
		char[]inputChar= input.toCharArray();
		
		for(int i=input.length()-1; i>=0; i-- )
		{
			reversedString +=inputChar[i];
		}
		
		
		return reversedString;
		
	}
	
}
