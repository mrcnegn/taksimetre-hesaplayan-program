import java.util.Scanner;
public class taksimetreprogram� {

	public static void main(String[] args) {
		
		int km;
		double �cret;
		
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.printf("ka� km gittiniz: ");
		km = input.nextInt();
		
		�cret = (km * 2.20) + 10;
		
		if(�cret>=20) {
			
			System.out.printf("�cretiniz: " + �cret);
			
			
		}
		else {
			
			System.out.printf("�cretiniz 20 tl");
			
		}

	}

}
