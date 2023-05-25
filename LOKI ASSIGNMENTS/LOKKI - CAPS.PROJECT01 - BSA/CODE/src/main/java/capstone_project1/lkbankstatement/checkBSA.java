package capstone_project1.lkbankstatement;

import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class checkBSA {
	
	Scanner z = new Scanner(System.in);
	String n = "L.K.BOSS";
	String id = "00708821";
	String m = "9792872888";
	String add = "No.18, Sholinganallur Main Road, Chennai-600099.";
	String e = "ray@gamil.com";
	String bn = "ICICI BANK PVT LTD";
	String l = "111, ICICI bank, Karapakkam, chennai-600097.";
	String acc = "0067-7686-9888-8877";
	String ifcc = "ICICI0070";
	String t ="Savings Account";
	
	void check()
	{
	System.out.println("Hi Mr.BOSS.! This is Your bank Account Details");
	System.out.println("\nAccount Number : "+acc);
	System.out.println("Account Holder's Name : "+n);	
	 System.out.println("Customer ID : "+id);
	 System.out.println("Customer Address : "+add);
	 System.out.println("Mobile Number : "
	 +m);
	 System.out.println("E-mail : "+e);
	 System.out.println("Bank Name : "+bn);
	 System.out.println("Bank location : "+l);
	 System.out.println("IFC Code : "+ifcc);
	 System.out.println("Account Type : "+t);
	 System.out.println(".............PRESS ENTER KEY TO CONTINUE.............");
	 }
	
    void con() throws IOException, CsvValidationException
    {
	    System.out.print("If This is Your Bank Account, You want to Continue (YES/NO) : \n");
        String Choice = z.next();
		if(Choice.equals("YES") || Choice.equals("yes") )
		{
			z.nextLine();
			 fileRBSA myfread = new fileRBSA();
			   myfread.fread();
				
		}
		else if(Choice.equals("NO") || Choice.equals("no"))
		{
			System.out.println("Thank you.. Restart Your Login..");
			z.close();
		}
     }

}
