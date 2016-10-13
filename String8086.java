public class String8086 {
	/**
	 * 
	+class String8086
	+implemented as a char array
	+constructor can take in a String, but must covert/store as $ terminated char array
	+maximum String size is 64 chars, so all String8086ís should have a 64 character char[]
	implement a print method that displays the contents of your String8086 one character at a time until the end not showing the $
	You MAY NOT store the length of the String8086
	 * @param args
	 */
	private int maxSize = 64;
	private char[] buffer = new char[maxSize];
	
	public String8086(String str) {
		  
		  if(str!=null && !str.equals("")){//check validity of parameter
			int max = Math.min(maxSize, str.length());//take smaller number between length and 64
			for(int i=0;i<max;i++){
	    		buffer[i] = str.charAt(i);//copy over 1 character at a time from str into character array
	    		if(i==max-1){//check to see if we're at the end of the str
	    			buffer[max-1]='$';
	    		}
	    	}
		  }
  	}
	
	public void Print(){
		int currentIndex = 0;
		while(buffer[currentIndex]!='$'){
			System.out.print(buffer[currentIndex]);
			currentIndex++;
		}
	}
  }