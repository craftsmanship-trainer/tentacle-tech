package capstone_project1.lkbankstatement;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class summaryBSA {
	Scanner j = new Scanner(System.in);

	void sweet() throws CsvValidationException, IOException 
	{
		System.err.println("\nChoose your SUMMARY Type :");
	    System.out.println("1.Summary of Particular Details \n2.Complete Summary of month \n3.Overall Amount Transaction \n4.AGAIN GO TO SUMMARY MENU \n5.EXIT");
        String nex = j.nextLine();
		
		switch (nex) {
		
		case "1":
			sumdetBSA yo = new sumdetBSA();
			yo.sumDet();
			break;
			
			
		case "2":
			sumMonBSA jo = new sumMonBSA();
			jo.sumMon();
			break;
			
		case "3":
			sumallTBSA bb = new sumallTBSA();
			bb.sumallt();
			break;
			
			
		case "4":
			summaryBSA ss = new summaryBSA();
			ss.sweet();
			break;
			
		case "5" :
			System.out.println("Thank you.. bye ");
			break;
			
			
			default :
				System.out.println("Thank you. you enter wrong key. Try again later.");
				break;
		
		}
	
	}
}
