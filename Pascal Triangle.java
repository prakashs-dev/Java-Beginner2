import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        // write code here
		ArrayList<ArrayList<Integer>> pasTriangle = new ArrayList<>();
		
		for(int i = 0; i < numRows; i++){
			pasTriangle.add(new ArrayList<>());
		}
		
		for(int i = 0; i < numRows; i++){
		    for(int j = 0; j <= i; j++){
		        if(j == 0 || i == j){
		           pasTriangle.get(i).add(1); 
		        }else{
		            pasTriangle.get(i).add(pasTriangle.get(i-1).get(j) + pasTriangle.get(i-1).get(j-1));
		        }
		    }
		}
		return pasTriangle;
    }
}
