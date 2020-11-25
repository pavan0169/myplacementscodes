package company;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for(int z = 0; z < t; z++){
		    String str = scn.next();
		    System.out.println(checkSumString(str));
		}
	}
	
	public static int checkSumString(String str) {
		if(str.length() <= 2)
			return 0;
		for(int x = 1; x < str.length(); x++) {
			for(int j = x + 1; j < str.length(); j++) {
				if(checkString(str, 0, x, j)) {
					return 1;
				}
			}
		}
		return 0;
	}
	
	public static boolean checkString(String str, int beg, int mid, int end) {
		int l = getThirdIndex(str, beg, mid, end);
		
		if(l == -1)
			return false;
		if(l == str.length())
			return true;
		
		return checkString(str, mid, end, l);
	}

	public static int getThirdIndex(String str, int beg, int mid, int end) {
		String one = str.substring(beg, mid);
		String two = str.substring(mid, end);
		
		StringBuilder desiredSum = new StringBuilder();
		int i = one.length() - 1;
		int j = two.length() - 1;
		int carry = 0;
		
		while(i >= 0 && j >= 0) {
			int sum = (int)(one.charAt(i) - '0') + (int) (two.charAt(j) - '0') + carry;
			carry = sum / 10;
			sum = sum % 10;
			desiredSum.append(sum);
			i--;
			j--;
		}
		
		while(i >= 0) {
			int sum = (int)(one.charAt(i) - '0') + carry;
			carry = sum / 10;
			sum = sum % 10;
			desiredSum.append(sum);
			i--;
		}
		
		while(j >= 0) {
			int sum = (int)(two.charAt(j) - '0') + carry;
			carry = sum / 10;
			sum = sum % 10;
			desiredSum.append(sum);
			j--;
		}
		if(carry > 0)
			desiredSum.append(carry);
		
		desiredSum = desiredSum.reverse();

		for (int l = end + 1; l <= str.length(); l++) {
				String requiredSum = str.substring(end, l);
				if (requiredSum.equals(desiredSum.toString()))
					return l;

		}

		return -1;
	}


	
}