import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class GenGraph {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<String> al = new ArrayList<>();
		String val="";
		String input = "Sam->Pete,Pete->Nancy,Sam->Katie,Mary->Bob,Frank->Mary,Mary->Sam,Bob->John,Pete";
		String[] tree = input.split(",");
		for(int i=0;i<tree.length-1;i++){
			//System.out.println(tree[i]);
			String[] s = tree[i].split("->");
			if(!al.contains(s[0])){
			al.add(s[0]);
			}
			map.put(s[1], al.indexOf(s[0]));
		}
		
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key - "+entry.getKey()+" Value - "+entry.getValue());
            if (entry.getValue().equals(map.get(tree[tree.length-1]))) {
                val=val+entry.getKey()+",";
            }
        }
		System.out.println(al.get(map.get(tree[tree.length-1])));//parent
		System.out.println(map.get(al.get(map.get(tree[tree.length-1]))));
		System.out.println(val.substring(0,val.lastIndexOf(",")));
	}

}
