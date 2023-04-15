package Assignment;

public class occurrencesCount {

	public static void main(String[] args) {
		 
				  System.out.println("occurrences of given string");
				  String name = "Workingmen of all countries unite";
				  for(char search = 'a'; search <= 'z'; search++) 
				  {        
					  int count=0;
					  for(int i=0; i<name.length(); i++)
					  {
						  if(name.charAt(i) == search)
							  count++;
					  }
					  if (count>0) 
					  {
						  System.out.println("The Character '"+search+"' repeate "+count+" times.");
					  }
				  }
			  }

		
	}


