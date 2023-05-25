package capstone_project1.lkbankstatement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sumallTBSA {
	
	Scanner kk = new Scanner(System.in);
	
	void sumallt() throws FileNotFoundException, IOException
	{
		try (FileReader fileReader = new FileReader("C:\\BSA TEST\\BSACSVFILE.csv");
	        	BufferedReader reader = new BufferedReader(fileReader))
	     {
                String line;
                float totalDebited = 0.0f;
                float totalCredited = 0.0f;

                while ((line = reader.readLine()) != null) {
                   if (!line.contains("TRANSACTION DETAILS")) {
                    	String[] split = line.split(",");
                        if (split.length == 6) {
                            float debited = Float.parseFloat(split[3].trim());
                            float credited = Float.parseFloat(split[4].trim());

                            totalDebited += debited;
                            totalCredited += credited;
                        }
                    }
                }
//                System.out.println("your overall amount transaction till to date :");
//                System.out.println("Overall debited amount : " + totalDebited);
//                System.out.println("Overall Credited amount : " + totalCredited);
                System.out.println();
                System.out.println("Choose your format to download file");
                 System.out.println("1. Download in TEXT file");
                System.out.println("2. download in HTML file");
                System.out.println("3.EXIT");
                String Choice3 = kk.nextLine();
                if(Choice3.equals("1"))
                {
                	System.out.println("your TEXT file download in your folder.");
                	try(FileWriter sum3 = new FileWriter("C:\\BSA TEST\\Overallamount.txt"))
                	{
                		sum3.write(" YOUR OVERALL TRANSACTION IN YOUR ACCOUNT : ");
                		sum3.write(System.lineSeparator());
     				   sum3.write("Credited Amout :"+" "+totalDebited);
     				  sum3.write(System.lineSeparator());
     				   sum3.write("Debited Amount :"+" "+totalCredited);
     		
                	}
                }
                else if(Choice3.equals("2"))
                {
                	System.out.println("your HTML file download in your folder.");
                	try(FileWriter sum3 = new FileWriter("C:\\BSA TEST\\Overallamount.html"))
                	{
                		sum3.write(" YOUR OVERALL TRANSACTION IN YOUR ACCOUNT : "+"<br>");
     				   sum3.write("Credited Amout :"+" "+totalDebited+"<br>");
     				   sum3.write("Debited Amount :"+" "+totalCredited+"<br>");
     		
                	}
                }
                else if(Choice3.equals("3"))
                {
                	System.out.println("Thank you. Bye");
                	kk.close();
                }
           }
	}
}
