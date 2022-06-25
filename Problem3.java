import java.util.Random;
import java.util.Scanner;

public class Problem3 {
	public static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
	public static  boolean isRound(int num)
    {
       return num == Math.round(num);
    }
	public static int generateRandom() {
		Random rand = new Random();
	    return rand.nextInt(1000);
	}
	public static void main(String[]args) {
		String[] names = {"Batman", "A Beautiful Mind", "Titanic"};
		boolean[] is3D = {true, false, false};
		String[] times = {"20:15", "19:30", "22:30"};
		int[] rooms = {3,2,1};
		boolean[] available = {true, false, true};
		String name, time;
		boolean _3D, avail = false;
		int room;
		Scanner sc = new Scanner(System.in);
		while(!avail) {
			for(int i = 0; i<names.length;i++) {
				System.out.println(names[i]+" | "+(is3D[i]?"3D":"2D")+" | "+times[i]+" | Room "+rooms[i]+" | "+(available[i]?"Available":"Fully Booked"));
			}
			System.out.print("\nWhich movie do you want to see?");
			int m = sc.nextInt();
			name = names[m-1];
			_3D = is3D[m-1];
			time = times[m-1];
			room = rooms[m-1];
			avail = available[m-1];
		}
		int timeLeft = 12;
		if(timeLeft>10) {
			double amount = 4;
			System.out.println("You can go to toilet or purchase anything");
			String[] items = {"M&Ms", "Popcorn", "Chips"};
			double[] prices = {2.40, 2.00, 1.50};
			String item;
			double price = 0;
			while(amount>0) {
				for(int i = 0; i<items.length;i++) {
					System.out.println(items[i]+" | $"+prices[i]);
				}
				System.out.print("\nWhich item do you want to purchase?");
				int it = sc.nextInt();
				item = items[it-1];
				price = prices[it-1];
				int draw = generateRandom();
				if(isPrime(draw)||isRound(draw)) {
					System.out.println("You don't have to pay for the purchase!");
				}
				else {
					System.out.println("You lost the lucky draw!");
					amount-=price;
				}
			}

		}
		else {
			System.out.println("You can go to toilet!");
		}
	}
}
