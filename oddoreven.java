package Assignment;


public class oddoreven {

			boolean isEven(int n){
					if(n%2 ==0) 
						System.out.println(n +" Is even number");
					else 
						System.out.println(n + " Is Not even number");
						
					return false;
			}
			boolean isOdd(int n) {
				if(n%2 != 0) 
					System.out.println(n +" Is  ODD number");
				else 
					System.out.println(n+" Is Not  ODD number");
					
					return false;
			}
			public static void main(String[] args) {
				
				int n=100;
				oddoreven even_odd = new oddoreven();
				even_odd.isEven(110);
				even_odd.isOdd(88);
			}

		}


