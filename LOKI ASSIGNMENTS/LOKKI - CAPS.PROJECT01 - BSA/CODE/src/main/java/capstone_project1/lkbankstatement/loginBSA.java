package capstone_project1.lkbankstatement;

import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class loginBSA extends checkBSA {
	
	 void signin() throws CsvValidationException, IOException
    {
		System.out.println("Welcome To LOKKI BANK");
        String uname, pword;
        Scanner s = new Scanner(System.in);
           System.out.print("Enter username : ");
           uname = s.nextLine();
           System.out.print("Enter password : ");
           pword = s.nextLine();
        if(uname.equals("Boss") && pword.equals("B@123"))
        {
            System.out.println("Mr.BOSS your login Successful");
            System.out.println(".............PRESS ENTER KEY TO CONTINUE...........");
          s.nextLine();
      	     checkBSA mylogin = new checkBSA();
      	     mylogin.check();
	           s.nextLine();
	         mylogin.con();
        }
        else
        {
            System.out.println("Sorry incorrect details.. TRY AGAIN");
            s.nextLine();
        }
  }
}
