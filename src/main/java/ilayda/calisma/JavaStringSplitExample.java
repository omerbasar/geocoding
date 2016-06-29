package ilayda.calisma;

public class JavaStringSplitExample {

	public static void main(String[] args) {
		String str = "one-two-three";
		String[] temp;
	    String delimiter = "-";
	    temp = str.split(delimiter);
	    for(int i =0; i < temp.length ; i++)
	        System.out.println(temp[i]);
	    
	    System.out.println("");
	    str = "one.two.three";
	    delimiter = "\\.";
	    temp = str.split(delimiter);
	    for(int i =0; i < temp.length ; i++)
	      System.out.println(temp[i]);
	    
	    System.out.println("");
	    temp = str.split(delimiter,2);
	    for(int i =0; i < temp.length ; i++)
	      System.out.println(temp[i]);

	}

}
