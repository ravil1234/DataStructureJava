package recursionchallenges;
import java.util.*;
public class dictonaryorder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		printPermutation(str,"",str);
	}
public static void printPermutation(String ques, String ans,String orig) {
    if (ques.length() == 0) {

        if(ans.compareTo(orig) <0){
            System.out.println(ans+" ");

        }
        return;
    }
    for (int i = 0; i < ques.length(); i++) {

        char ch = ques.charAt(i);
        String roq = ques.substring(0, i) + ques.substring(i + 1);

        printPermutation(roq, ans + ch,orig);

    }
}
}