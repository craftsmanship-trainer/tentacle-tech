package capstone_project1.lkbankstatement;

import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class mainBSA extends loginBSA{
	
	public static void main(String[] args) throws IOException, CsvValidationException {
		
       loginBSA mysign = new loginBSA();
		 mysign.signin();
		  
	}
 }
