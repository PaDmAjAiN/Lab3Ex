import java.util.Scanner;

public class LightBill {
	int Consumer_id,Unit_cost,Number_of_units;
	LightBill(int  Consumer_id, int Unit_cost, int Number_of_units)
	{
		this.Consumer_id=Consumer_id;
		this.Unit_cost=Unit_cost;
		this.Number_of_units=Number_of_units;
	}
	void Compute()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("consumer_id");
		int Consumer_id=in.nextInt();
		System.out.println("enter unit cost:-");
		int Unit_cost =in.nextInt();
		System.out.println("enter no. of units:-");
		int Number_of_units =in.nextInt();
		
	}

}
