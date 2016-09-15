import static org.hamcrest.CoreMatchers.*;
import java.util.HashMap;
import java.util.Map;

public class SudokuVerifier {

	String goodstring ="417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String badstring ="123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	int something = 0;
	String workingstring;
	int index;
	char c;
	Map<Character,Integer> map = new HashMap<Character,Integer>();
	
	int one;
	int two;
	int three;
	int four;
	int five;
	int six;
	int seven;
	int eight;
	int nine;
	
	public int verify(String candidateSolution) {
		
		//check rowaaaa
		//workingstring = goodstring.substring (0,9);
		workingstring = "123156781";
		
	    for(int i=0; i<8; i++){
	    	char c = goodstring.charAt(i);
	    	if (map.containsKey(c)) {
		
	    }
		
		//System.out.print(workingstring);
		
		
		
		
		//check column
		
		
		//check grids
		

		// returns 0 if the candidate solution is correct
		return 0;
		
		//check
	}
	}
