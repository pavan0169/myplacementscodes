package company;

import java.math.*;
import java.util.*;

class StringSum2 {
    
    public static String isPrefixOf(BigInteger X, BigInteger Y,  String S) {
        String XPlusY = X.add(Y).toString();
        if(XPlusY.equals(S)){
            return "Full";
        } else if(S.startsWith(XPlusY)){
            return "Pref";
        } else {
            return "False";
        }
    }
    public static boolean isXInitialSubString(BigInteger X, String S) {
        for(int i = 1; i < S.length(); i++){
            BigInteger Y = new BigInteger(S.substring(0, i));
            String restOfS = S.substring(i, S.length());
            String res = isPrefixOf(X, Y, restOfS); 
            if(res == "Full"){
                return true;
            } else if (res == "Pref"){
                if (isXInitialSubString(Y, restOfS)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static int isSumString(String S) {
        for(int i = 1; i < S.length(); i++){
            BigInteger X = new BigInteger(S.substring(0, i));
            if(isXInitialSubString(X, S.substring(i, S.length()))){
                return 1;
            }
        }
        return 0;
    }
	public static void main (String[] args)
	{
	    Scanner scanner = new Scanner(System.in);
        Integer T = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < T; i++){
            String line = scanner.nextLine();
            System.out.println(isSumString(line));
        }
	}
}