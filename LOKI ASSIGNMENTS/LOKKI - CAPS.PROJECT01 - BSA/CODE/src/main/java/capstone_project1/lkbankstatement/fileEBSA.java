package capstone_project1.lkbankstatement;

import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class fileEBSA extends fileFBSA{
	Scanner v = new Scanner(System.in);
	
	   void export() throws IOException, CsvValidationException
	   {
		  System.out.print("you want to download your Bank Statement (YES/NO) : \n");
          String Choice = v.next();
		  if(Choice.equals("YES") || Choice.equals("yes") )
		   {
		    System.out.println("Choose your format :");
		    System.out.println("1.Statement in TEXT FILE \n2.Statement in HTML FILE \n3.Statement in PDF FILE \n4.Statement in DEFAULT FILE \n5.GO BACK \n6.GO TO SUMMARY \n7. EXIT");
	        fileFBSA j = new fileFBSA();
	         j.format();
 	       }
		  else if(Choice.equals("NO") || Choice.equals("no"))
		   {
			System.out.println("Thank you. Your Decline Request is Accepeted.");
			v.close();
		  }
	}
}
