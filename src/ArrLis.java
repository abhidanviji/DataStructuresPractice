import java.util.ArrayList;
public class ArrLis {

	public static void main(String[] args) {
	ArrayList<Integer> al = new ArrayList<>();
	int j=1;
	al.add(1);
	al.add(5);
	al.add(2);
	if(al.contains(j)){
		System.out.println("Hi");
	}
	for(int i=0;i<al.size();i++){
		System.out.println(al.get(i));
	}
		

	}

}
