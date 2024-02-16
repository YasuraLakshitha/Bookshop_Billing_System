import java.util.*;
class BillingSystem{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("\t\t\t  ________             _       _____ _                     ");
		System.out.println("\t\t\t  |  ___  \\           | |     /  ___| |                    ");
		System.out.println("\t\t\t  |  |_/  / ___   ___ | | __  \\ '--.| |__   ___  _ __      ");
		System.out.println("\t\t\t  |  ___  \\/ _ \\ / _ \\| |/ /   '--. \\  _ \\ / _ \\| '_ \\     ");
		System.out.println("\t\t\t  |  |_/  / ( ) | ( ) |   <   /\\_/  / | | | (_) | |_) |    ");
		System.out.println("\t\t\t  \\______/ \\___/ \\___/|_|\\_\\  \\____/|_| |_|\\___/| .__/     ");
		System.out.println("\t\t\t                                                | |        ");
		System.out.println("\t\t\t                                                |_|        ");
		System.out.println("\t\t\t ======================================================     ");

		System.out.print("\n\n\t\t\t\t Enter the Date\t\t\t: ");
		String date=input.next();
		System.out.print("\n\t\t\t\t Customer number\t\t: ");
		String phone=input.next();
		System.out.print("\n\t\t\t\t Enter customer Name\t\t: ");
		String name=input.next();
		
		//School Items
		System.out.println("\n\n");
		System.out.println("\t\t\t   _____        _                 _    _______ _                                        ");
		System.out.println("\t\t\t  /  ___|      | |               | |  |__   __| |                                       ");
		System.out.println("\t\t\t |  (___   ____| |__   ___   ___ | |     | |  | |_ ___ _ __ ___  ____                   ");
		System.out.println("\t\t\t  \\___  \\ /  __| '_ \\ / _ \\ / _ \\| |     | |  | __/ _ \\ '_ ' _ \\/  __|                  ");
		System.out.println("\t\t\t   ___)  |  (__| | | | (_) | (_) | |   __| |__| ||  __/ | | | | \\___ \\                  ");
		System.out.println("\t\t\t  |_____/ \\____|_| |_|\\___/ \\___/|_|  |_______|\\__\\___|_| |_| |_|____/                  ");
		System.out.println("\t\t\t =======================================================================     ");


		System.out.print("\n\n\t\t\t\t CR Book (Qty)\t\t\t :");
		int cr=input.nextInt();
		System.out.print("\n\t\t\t\t pen (Qty)\t\t\t :");
		int pen=input.nextInt();
		System.out.print("\n\t\t\t\t pencil (Qty)\t\t\t :");
		int pencil=input.nextInt();
		System.out.print("\n\t\t\t\t Eraser (Qty)\t\t\t :");
		int eraser=input.nextInt();
		System.out.print("\n\t\t\t\t Pencil box (Qty)\t\t :");
		int pencilBox=input.nextInt();
		System.out.print("\n\t\t\t\t Glue Bottle (Qty)\t\t :");
		int glueBottle=input.nextInt();
		System.out.print("\n\t\t\t\t Ruler(MEDIUM) (Qty)\t\t :");
		int ruler=input.nextInt();

		
		//Office items
		System.out.println("\n\n\n\t\t\t   ______  ___  ___ _               _____ _                                        ");
		System.out.println("\t\t\t  /  __  \\/  _|/  _(_)             |_   _| |                                      ");
		System.out.println("\t\t\t |  |  |  | |_|| |_ _  ____ ____     | | | |_ ___ _ __ ___  ____                   ");
		System.out.println("\t\t\t |  |  |  |  _||  _| |/  __/  _ \\    | | | __/ _ \\ '_ ' _ \\/  __|               ");
		System.out.println("\t\t\t |  |__|  | |  | | | |  (_|   __/   _| |_| ||  __/ | | | | \\___ \\                ");
		System.out.println("\t\t\t  \\______/|_|  |_| |_|\\___|\\____|  |_____|\\__\\___|_| |_| |_|____/             ");
		System.out.println("\t\t\t====================================================================               ");

		System.out.print("\n\n\t\t\t\t Calculator (Qty)\t\t : ");
		int calc=input.nextInt();
		System.out.print("\n\t\t\t\t Highlighter (Qty)\t\t : ");
		int highLighter=input.nextInt();
		System.out.print("\n\t\t\t\t Cardboard file(Qty)\t\t : ");
		int cardboard=input.nextInt();


		//Other Items
		System.out.println("\n\n\n\t\t\t   ______  _   _                   _____ _                                                 ");
		System.out.println("\t\t\t  /  __  \\| | | |                 |_   _| |                                     ");
		System.out.println("\t\t\t |  |  |  | |_| |__   _____ _ ___   | | | |_ _____ _ __ ___  ____            ");
		System.out.println("\t\t\t |  |  |  | __|  _ \\ /  _  \\ ' __|  | | | __/  _  \\ '_ ' _ \\/  __|         ");
		System.out.println("\t\t\t |  |__|  | |_| | | |   ___/  |    _| |_|  ||  ___/ | | | | \\___ \\              ");
		System.out.println("\t\t\t  \\______/ \\__|_| |_|\\_____|__|   |_____|\\__\\_____|_| |_| |_|____/                ");
		System.out.println("\t\t\t====================================================================               ");

		System.out.print("\n\n\t\t\t\t Water Bottle (Qty)\t\t : ");
		int waterBottle = input.nextInt();
		System.out.print("\n\t\t\t\t Lunch Box (Qty)\t\t : ");
		int lunchBox = input.nextInt();
		System.out.print("\n\t\t\t\t School Bag (Qty)\t\t : ");
		int schoolBag = input.nextInt();


		//Calculating amount
		System.out.println("\n\n\n+------------------------------------------------------------------------------------------------+");
		System.out.println("|\t\t\t  ________             _       _____ _                                   |");
		System.out.println("|\t\t\t  |  ___  \\           | |     /  ___| |                                  | ");
		System.out.println("|\t\t\t  |  |_/  / ___   ___ | | __  \\ '--.| |__   ___  _ __                    | ");
		System.out.println("|\t\t\t  |  ___  \\/ _ \\ / _ \\| |/ /   '--. \\  _ \\ / _ \\| '_ \\                   |");
		System.out.println("|\t\t\t  |  |_/  / ( ) | ( ) |   <   /\\_/  / | | | (_) | |_) |                  | ");
		System.out.println("|\t\t\t  \\______/ \\___/ \\___/|_|\\_\\  \\____/|_| |_|\\___/| .__/                   |");
		System.out.println("|\t\t\t                                                | |                      | ");
		System.out.println("|\t\t\t                                                |_|                      | ");
		System.out.println("+------------------------------------------------------------------------------------------------+");
		System.out.printf("|Tel   : %-87s |\n",phone);
		System.out.printf("|name  : %-69sDate : %-12s|\n",name,date);
		System.out.println("|------------------------------------------------------------------------------------------------|");
		System.out.println("|\t Items \t\t|\tQty \t|\t  Unit Price\t\t|\t Price \t\t |");
		System.out.println("|------------------------------------------------------------------------------------------------|");
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t CR Book \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",cr,80.00,(cr*80.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Pen \t\t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",pen,20.00,(pen*20.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Pencil \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",pencil,15.00,(pencil*15.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Eraser \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",eraser,10.00,(eraser*10.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Glue \t\t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",glueBottle,40.00,(glueBottle*40.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Pencil Box\t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",pencilBox,100.00,(pencilBox*100.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Water Bottel \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",waterBottle,230.00,(waterBottle*230.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Lunch Box \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",lunchBox,250.00,(lunchBox*250.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Calculator \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",calc,250.00,(calc*250.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t School Bag \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",schoolBag,1000.00,(schoolBag*1000.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Ruler \t\t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",ruler,10.00,(ruler*10.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Highlighter \t|\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",highLighter,50.00,(highLighter*50.00));
		System.out.println("|\t\t\t| \t\t|\t\t\t\t|\t\t\t |");
		System.out.printf("|\t Cardboard File |\t%-3d \t|\t%10.2f\t\t|\t%-17.2f|\n",cardboard,25.00,(cardboard*25.00));
		System.out.println("+------------------------------------------------------------------------------------------------+");
		
		Double Total =(cr*80.00)+(pen*20.00)+(pencil*15.00)+(eraser*10.00)+(glueBottle*40.00)+(pencilBox*100.00)+(waterBottle*230.00)+(lunchBox*250.00)+(calc*250.00)+(schoolBag*1000.00)+(ruler*10.00)+(highLighter*50.00)+(cardboard*25.00);

		System.out.printf("|\t\t\t|\t\t Total \t\t\t\t|\t%-17.2f|\n",Total);
		System.out.println("|\t\t\t|------------------------------------------------------------------------+");
		System.out.printf("|\t\t\t|\t\t Discount(10%c) \t\t\t|\t%-17.2f|\n",'%',Total*0.1);
		System.out.println("|\t\t\t|------------------------------------------------------------------------+");
	
		Double netAmount = (Total-Total*0.1);

		System.out.printf("|\t\t\t|\t\t Price \t\t\t\t|\t%-17.2f|\n",netAmount);
				System.out.println("+------------------------------------------------------------------------------------------------+");

		System.out.println("\n\n\n\n");
	
		//Calculating Balance
		System.out.println("\t\t\t  ______        _                                  ");
		System.out.println("\t\t\t |  __  \\      | |                                ");
		System.out.println("\t\t\t | |__)  | __ _| | __ _ _ __   ____ ___            ");
		System.out.println("\t\t\t |  __  < / _' | |/ _  | '_ \\ /  __/ _ \\         ");
		System.out.println("\t\t\t | |__)  | (_| | | (_| | | | |  (_|  __/           ");
		System.out.println("\t\t\t |______/ \\__,_|_|\\__,_|_| |_|\\___ \\___|       ");
		System.out.println("\t\t\t===========================================        ");

		System.out.print("\n\n\nEnter Customer given amout - ");
		double cusAmount = input.nextDouble(); 

		System.out.println("\n\n");		

		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Net Amount\t|\t%-12.2f|\n",netAmount);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Cash\t\t|\t%-12.2f|\n",cusAmount);
		System.out.println("\t\t\t +------------------------------------------+");
		
		double change = cusAmount-netAmount;
		
		System.out.printf("\t\t\t |\t Change\t\t|\t%-12.2f|\n",change);
		System.out.println("\t\t\t +------------------------------------------+");

		System.out.println("\n\n");
		
		
		//calculating number of notes
		int fiveThousand = (int)change/5000;
		int fiveThousandRemainder = (int)change%5000;

		int twoThousand = fiveThousandRemainder/2000;
		int twoThousandRemainder = fiveThousandRemainder%2000;

		int oneThousand = twoThousandRemainder/1000;
		int oneThousandRemainder = twoThousandRemainder%1000;	
	
		int fiveHundred = oneThousandRemainder/500;
		int fiveHundredRemainder = oneThousandRemainder%500;	

		int twoHundred = fiveHundredRemainder/200;
		int twoHundredRemainder = fiveHundredRemainder%200;	

		int oneHundred = twoHundredRemainder/100;
		int oneHundredRemainder = twoHundredRemainder%100;

		int fifty = oneHundredRemainder/50;
		int fiftyRemainder = oneHundredRemainder%50;

		int twenty = fiftyRemainder/20;
		int twentyRemainder = fiftyRemainder%20;

		int ten = twentyRemainder/10;
		int tenRemainder = twentyRemainder%10;

		int five = tenRemainder/5;

		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Value\t\t|\t%-12s|\n","no");
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.5000\t|\t%-12d|\n",fiveThousand);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.2000\t|\t%-12d|\n",twoThousand);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.1000\t|\t%-12d|\n",oneThousand);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.500\t\t|\t%-12d|\n",fiveHundred);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.200\t\t|\t%-12d|\n",twoHundred);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.100\t\t|\t%-12d|\n",oneHundred);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.50\t\t|\t%-12d|\n",fifty);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t Rs.20\t\t|\t%-12d|\n",twenty);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t coins 10\t|\t%-12d|\n",ten);
		System.out.println("\t\t\t +------------------------------------------+");
		System.out.printf("\t\t\t |\t coins 5\t|\t%-12d|\n",five);
		System.out.println("\t\t\t +------------------------------------------+");

		
	}
}






















