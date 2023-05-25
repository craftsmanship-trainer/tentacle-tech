package capstone_project1.lkbankstatement;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

public class fileFBSA{
	Scanner u = new Scanner(System.in);
	
	void format() throws IOException, CsvValidationException
	{
		String change = u.nextLine();
		
		switch (change) {
		
		case "1":
			FileInputStream r1 = new FileInputStream("C:\\BSA TEST\\BSACSVFILE.csv");
		    FileOutputStream w1 = new FileOutputStream("C:\\BSA TEST\\BSATEXTFILE1.txt");
		    int i1 ;
			while((i1 = r1.read())!=-1)
			{
				w1.write((char)i1);
			}
			System.out.println("Here Your TEXT FILE is Saved in your folder.");
		break;
			
		case "2":
		    FileInputStream r2 = new FileInputStream("C:\\BSA TEST\\BSACSVFILE.csv");
	        FileOutputStream w2 = new FileOutputStream("C:\\BSA TEST\\BSAHTMLFILE1.html");
		    int i2 ;
			while((i2 = r2.read())!=-1)
			{
				w2.write((char)i2);
			}
			System.out.println("Here Your HTML FILE is Saved in your folder.");
		break;
		
			   case "3":
            		FileInputStream r3 = new FileInputStream("C:\\BSA TEST\\BSACSVFILE.csv");
        		    FileOutputStream w3 = new FileOutputStream("C:\\BSA TEST\\BSAPDFFILE1.pdf");
        		    int i3 ;
        			while((i3 = r3.read())!=-1)
        			{
        				w3.write((char)i3);
        			}
        			System.out.println("Here Your PDF FILE is Saved in your folder.");
			break;
			   case "4":
				   FileInputStream r4 = new FileInputStream("C:\\BSA TEST\\BSACSVFILE.csv");
       		    FileOutputStream w4 = new FileOutputStream("C:\\BSA TEST\\NEWBSAFILE1.csv");
       		    int i4 ;
       			while((i4 = r4.read())!=-1)
       			{
       				w4.write((char)i4);
       			}
       			System.out.println("Here Your DEFAULT FILE is Saved in your folder.");
			break;
				   
			    case "5":
			    	 System.out.println("Re-Type your option here..");
	            	   fileFBSA f = new fileFBSA();
	            	   f.format();
	            	   System.out.println();
      		    break;
      		    
			    case "6":
			    	summaryBSA g = new summaryBSA();
			    	g.sweet();
			    	break;
	            	
			    case "7":
			    	System.out.println("Thanks You. Re-Try..");
            	    break;
      			 
      		default:
			     System.out.println("Sorry. You Missed Your Options. Please Try Again..");
			break;
		}
	}
 }
