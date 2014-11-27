import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Crawling {
	public static void main(String args[]) throws IOException {	
		BufferedReader id = new BufferedReader( new InputStreamReader(System.in));
		
		// Task 1) 
		System.out.println("Vuvedete ime: ");
		String name = id.readLine();
		System.out.println("Hello, " + name);
		
		// Task 2)
		System.out.println("Vuvedete 4islo a: ");
		int a = Integer.parseInt(id.readLine());
		System.out.println("Vuvedete 4islo b (b > a !): ");
		int b = Integer.parseInt(id.readLine());
		
		if (b>a) {
			System.out.println("All the numbers between a and b:");
			while(a<b){
				a++;
				if (a<b) {
					System.out.println(a);
				}
			}
		} else {
			System.out.println("Error: b is not bigger than a !");
		}
		
		// Task 3)
		System.out.println("Vuvedete niz:");
		String Symbols = id.readLine();
		int i=0, count=0;
		while (i<Symbols.length()) {
			if (Symbols.charAt(i) == '1') {
				count += 1;
			}
			i++;
		}
		System.out.println("How many times the symbol 1 appears: " + count);
		
	}
}
