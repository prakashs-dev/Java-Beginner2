import java.util.*;

public class Main {
    static void timeConversion(String s) {
        //Write your code here
		char h1 = s.charAt(0);
		char h2 = s.charAt(1);
		int hh = (int)(h1-'0')*10 +(int)(h2-'0');

		if(s.charAt(8) == 'P'){
			if(hh == 12){
				for(int i = 0; i <= 7; i++){
					System.out.print(s.charAt(i));
				}
			}else{
				hh = hh+12;
				System.out.print(hh);
				for(int i = 2; i <= 7; i++){
					System.out.print(s.charAt(i));
				}
			}
		}else{
			if(hh == 12){
				System.out.print("00");
				for(int i = 2; i <= 7; i++){
					System.out.print(s.charAt(i));
				}
			}else{
				for(int i = 0; i <= 7; i++){
					System.out.print(s.charAt(i));
				}
			}
		}
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        timeConversion(str);
        sc.close();
    }
}