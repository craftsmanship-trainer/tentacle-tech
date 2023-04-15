package mathProb;

public class Number_as_Text {

	String numberAsText(int n) {
		String ones[] = {"","One","Two","Three","Four","Five","Six","seven","eight","nine"};

	if(n<10)
	{
		System.out.println(ones[n]);
	}
		return null;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Number_as_Text nat = new Number_as_Text();
		 nat.numberAsText(9);
	
	}

}
