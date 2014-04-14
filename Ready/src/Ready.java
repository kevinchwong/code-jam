import java.util.*;
import java.io.*;
import java.math.*;
import java.awt.geom.*;

import static java.lang.Math.*;

public class Ready {

	/**
	 * @author: securuskeeper Kevin Wong
	 * @since: 11/04/2014
	 */

	public static BufferedReader in;
	public static Scanner sc;
	public static PrintWriter out;
    
	public static void main(String[] args) {
    	
        String inputFileName = "./sample.in";
        String outputFileName = "./sample.out";
		try {
	        in= new BufferedReader(new FileReader(inputFileName));
	        out= new PrintWriter(new FileWriter(outputFileName));
	        sc= new Scanner(in);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Start");
    	
    	int T=0;
// Input    	
		T = sc.nextInt();
    	
		BigInteger bi=new BigInteger("123456789123456789123456789");
		System.out.println(bi.bitCount());
    	
// Output		
		for (int Case = 1; Case <= T; Case++) {
			out.print("Case #" + Case + ": ");
			
			out.println();
		}
		out.close();

    }
}


