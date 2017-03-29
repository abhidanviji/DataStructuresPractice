import java.util.ArrayList;
import java.util.HashMap;

public class GenGraph {

	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		String input = "Frank->Mary,Mary->Sam,Mary->Bob,Sam->Katie,Sam->Pete,Bob->John,Bob";
		String[] tree = input.split(",");
		for(int i=0;i<tree.length-1;i++){
			System.out.println(tree[i]);
			String[] s = tree[i].split("->");
			System.out.println(s[0]+","+s[1]);
			map.put(s[0], null);
		}

	}

}
