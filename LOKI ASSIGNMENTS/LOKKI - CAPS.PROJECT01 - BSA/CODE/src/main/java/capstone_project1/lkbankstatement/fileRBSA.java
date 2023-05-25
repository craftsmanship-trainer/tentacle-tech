package capstone_project1.lkbankstatement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class fileRBSA {
	
	Scanner x =  new Scanner(System.in);
	
	void fread() throws FileNotFoundException, IOException, CsvValidationException
	{
		    System.out.print("You want your Bank statement (YES/NO) : ");
	     String Choice = x.next();
			if(Choice.equals("YES") || Choice.equals("yes") )
			{
				String line;
			      try (BufferedReader br = new BufferedReader(
			          new FileReader("C:\\BSA TEST\\BSACSVFILE.csv"))) {

			      while ((line = br.readLine()) != null) {
			    	  
			          String[] split = line.split(",");
			          for(String in : split) {
			        	  System.out.printf("%-20s",in);
			          }
			         System.err.println();
//			 System.out.println("\n " + split[0] + "\t" + " " + split[1] + "\t" +" " + split[2]+  "\t"+ " " + split[3] +"\t"+ " " + split[4] +"\t"+ " " + split[5]);
			 }
			      }
			      fileEBSA myfexpo = new fileEBSA();
					 myfexpo.export();
			}
			
			
			else if(Choice.equals("NO") || Choice.equals("no"))
			{
				System.out.println("Thank you. Your decline request is accepeted");
				x.close();
			}
	}
}


