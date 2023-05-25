package capstone_project1.lkbankstatement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class sumdetBSA {

ArrayList<getsetBSA> l = new ArrayList<getsetBSA>();
	
	public void sumDet() throws IOException, CsvValidationException
	{
		CSVReader read = new CSVReader(new FileReader("C:\\BSA TEST\\BSACSVFILE.csv"));
		{
		String[] split = null;
		
		while ((split = read.readNext())!= null)
		{
			  getsetBSA so = new getsetBSA();
			 so.setMonth(split[0]);
			 so.setDate(split[1]);
			// so.setTime(split[2]);
			 so.settransactiondetails(split[2]);
			 so.setCredit(split[3]);
			 so.setDebit(split[4]);
			 so.setBalanceamount(split[5]);
			 l.add(so);
		}
	}
		Scanner w = new Scanner(System.in);
		System.out.println("Enter Details Name in [CAPS.] :");
		String str = w.next();
		System.out.println("Choose your format to download file");
        System.out.println("1. Download in TEXT file");
        System.out.println("2. download in HTML file");
        System.out.println("3.EXIT");
        String Choice = w.next();
		
		switch (Choice)
		{
		
		case "1":
			System.out.println("Your TEXT file downloaded in your folder.");
			for(getsetBSA so : l)
			{
				if (so.gettransactiondetails().contains(str))
				{
					try(FileWriter sum = new FileWriter("C:\\BSA TEST\\ProductSummary.txt"))
					{
//						System.out.println("Month:"+" "+so.getMonth());
//					   System.out.println("Date:"+" "+so.getDate());
//				//	   System.out.println("Time:"+" "+so.getTime());
//					   System.out.println("Details:"+" "+so.gettransactiondetails());
//	                   System.out.println("Credit:"+" "+so.getCredit());
//					   System.out.println("Debit:"+" "+so.getDebit());
					 
					   
					   
					   sum.write("SUMMARY OF " + str + " DETAILS");sum.write(System.lineSeparator());
					   sum.write("Month:"+" "+so.getMonth());sum.write(System.lineSeparator());
					   sum.write("Date:"+" "+so.getDate());sum.write(System.lineSeparator());
					//   sum.write("Time:"+" "+so.getTime()+"<br>");
					   sum.write("Transaction details:"+" "+so.gettransactiondetails());sum.write(System.lineSeparator());
					   sum.write("Credit:"+" "+so.getCredit());sum.write(System.lineSeparator());
					   sum.write("Debit:"+" "+so.getDebit());
					 //  sum.write("Balance Amount:"+" "+so.getBalancesmount());
					}
				}
			}
			break;
			
		case "2":
			System.out.println("Your HTML file downloaded in your folder.");
			for(getsetBSA so : l)
			{
				if (so.gettransactiondetails().contains(str))
				{
					try(FileWriter sum = new FileWriter("C:\\BSA TEST\\ProductSummary.html"))
					{
					   sum.write("SUMMARY OF " + str + " DETAILS"+"<br>");
					   sum.write("Month:"+" "+so.getMonth()+"<br>");
					   sum.write("Date:"+" "+so.getDate()+"<br>");
					//   sum.write("Time:"+" "+so.getTime()+"<br>");
					   sum.write("Transaction details:"+" "+so.gettransactiondetails()+"<br>");
					   sum.write("Credit:"+" "+so.getCredit()+"<br>");
					   sum.write("Debit:"+" "+so.getDebit());
					 //  sum.write("Balance Amount:"+" "+so.getBalancesmount());
					}
				}
			}
			break;
			
		case "3":
			System.out.println("Thank you. Bye");
	      	w.close();
		break;
		}
   }	
}
