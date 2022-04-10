import java.util.Scanner;

public class Makereceipt {

	public static void main(String[] args) {
		
		Scanner receipt = new Scanner(System.in);
		
		System.out.println("Quantity of Milk");
		int qMilk = receipt.nextInt();
		
		System.out.println("Price of Milk");
		float pMilk = receipt.nextFloat();
		
		float totalMilk = qMilk*pMilk;
		
		System.out.println("Quantity of Egg");
		int qEgg = receipt.nextInt();
		
		System.out.println("Price of Egg");
		float pEgg = receipt.nextFloat();
	
		float totalEgg = qEgg*pEgg;
		
		System.out.println("Quantity of Butter");
		int qButter = receipt.nextInt();
		
		System.out.println("Price of Butter");
		float pButter = receipt.nextFloat();
	
		float totalButter = qButter*pButter;
		
		float tax = .07f;
		
		float subTotal = totalMilk+totalEgg+totalButter;
		
		float netCost = subTotal*tax;
		
		float priceafterTax = subTotal+netCost;
		
		System.out.println(subTotal);
		System.out.println(netCost);
		System.out.println(priceafterTax);
		
	}
	
	
}
