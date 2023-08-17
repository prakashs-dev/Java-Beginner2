// Java program to implement run length encoding 
class Main { 
	static void gen_compressed_str(String str) 
	{ 
		int n = str.length(); 
		for (int i = 0; i < n; i++) { 

			// Count occurrences of current character 
			int count = 0; 
			while (i < n - 1 && 
				str.charAt(i) == str.charAt(i + 1)) { 
				count++; 
				i++; 
			} 

			if (count == 0) {
			  System.out.print(str.charAt(i)); 
      } 
      else {
			  System.out.print(str.charAt(i)); 
  			System.out.print(count+1); 
      }
		} 
	} 

	public static void main(String[] args) 
	{ 
		String str = "abbbccd"; 
		gen_compressed_str(str); 
	} 
} 