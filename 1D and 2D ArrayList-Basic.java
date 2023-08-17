import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1D ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("ArrayList Input Size ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            list.add(num);
        }
		for(int i = 0; i < list.size(); i++){
		    System.out.print(list.get(i)+" ");
// 		}
		
		//2D ArrayList
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		System.out.println("2D ArrayList");
		System.out.print("Row ");
		int row = sc.nextInt();//row
		System.out.print("Col ");
		int col = sc.nextInt();//col
		for(int i = 0; i < row; i++){
		    list2.add(new ArrayList<>());
		}
		
		for(int i = 0; i < row; i++){
		    for(int j = 0; j < col; j++){
		        int m = sc.nextInt();
		        list2.get(i).add(m);
		    }
		}
		
		for(int i = 0; i < list2.size(); i++){
		    System.out.print(list2.get(i)+" ");
		}
		
		
		
		
	}
}
