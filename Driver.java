
public class Driver 
{
	/**
	 * 
	class String8086
	implemented as a char array
	constructor can take in a String, but must covert/store as $ terminated char array
	maximum String size is 64 chars, so all String8086ís should have a 64 character char[]
	implement a print method that displays the contents of your String8086 one character at a time until the end not showing the $
	You MAY NOT store the length of the String8086
	 * @param args
	 */
	public static void main(String [] args)
	{
		String8086 sample = new String8086("Siri!!! sing me a song!!!!!!!!!!!!1");
		
		sample.Print();
	}
		  
}