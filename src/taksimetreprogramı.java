import java.util.Scanner;
public class taksimetreprogramý {

	public static void main(String[] args) {
		
		int km;
		double ücret;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("kaç km gittiniz: ");
		km = input.nextInt();
		
		ücret = (km * 2.20) + 10;
		
		if(ücret>=20) {
			
			System.out.printf("ücretiniz: " + ücret);
			
			
		}
		else {
			
			System.out.printf("ücretiniz 20 tl");
			
		}

	}

}
