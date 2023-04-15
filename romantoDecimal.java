package Assignment;

public class romantoDecimal {
			
			int value(char r) {
			
				    if (r == 'I')
			            return 1;
			        if (r == 'V')
			            return 5;
			        if (r == 'X')
			            return 10;
			        if (r == 'L')
			            return 50;
			        if (r == 'C')
			            return 100;
			        if (r == 'D')
			            return 500;
			        if (r == 'M')
			            return 1000;
			        return -1;
			}
			
			int fromRomanNumber(String roman) {
				
				int result = 0;
				
				for(int i=0;i<roman.length();i++) 
				{
					
					int rom1 = value(roman.charAt(i));
					
					 	if (i+1<roman.length())
					 	{
					 		int rom2 = value(roman.charAt(i + 1));
					 		
					 			if(rom1>=rom2)
					 			{
					 			result = result+rom1;
					 			}
								else
								{
								  result = result + rom2 - rom1;
								  i++;
								}
					 	}
					 		else
					 		{
			                result = result + rom1;
					 		}
					 
			    }
				   return result;
			}
			public static void main(String[] args) {
				romantoDecimal value= new romantoDecimal();
				String roman = "XL";
				System.out.println("RomanToDecimal Value is "+ value.fromRomanNumber(roman));
			}


	}
