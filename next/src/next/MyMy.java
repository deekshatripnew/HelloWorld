package next;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class MyMy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line = "";
		// Gson gson = new Gson();
		//5555
		 ArrayList<String> l1=new ArrayList<>();
	        ArrayList<String> l2=new ArrayList<>();
		 BufferedReader br = new BufferedReader(new FileReader("./json.txt"));
			while ((line = br.readLine()) != null) {
	           String[] transactionAttributes = line.split(",");
				//my2 f=gson.fromJson(line, my2.class);			
	            l1.add(transactionAttributes[0]);
	            l2.add(transactionAttributes[1]);

	}
			System.out.println(l1+" "+l2);

}
}
