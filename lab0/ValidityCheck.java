import java.util.Scanner;

public class ValidityCheck {

	public static boolean isValidPNR(String number) {
		int sum = 0;
		int num = 0;
		for (int i = 0; i < number.length(); i++) {
			num = Character.getNumericValue(number.charAt(i));
			if (i % 2 == 0) {
				num *= 2;
			}
			if (num >= 10) {
				sum += num % 10;
				num /= 10;
				sum += num;
			} else {
				sum += num;
			}
		}
		if (sum % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String personNumber = scanner.nextLine();

		if (isValidPNR(personNumber)) {
			System.out.println("Giltigt nummer.");
		} else {
			System.out.println("Ej ett giltigt nummer.");
		}
	}
}