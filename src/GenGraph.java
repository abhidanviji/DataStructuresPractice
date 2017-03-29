import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class GenGraph {
	public static HashMap<String, Integer> map = new HashMap<>();
	public static ArrayList<String> al = new ArrayList<>();
	public static ArrayList<String> gen = new ArrayList<>();
	public static String val="";
	public static String findNodes(int parent, boolean flag){
		val="";
		for (Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(parent)) {
                val=val+entry.getKey()+",";
                if(flag)
        			gen.add(entry.getKey());
            }
           
        }
		
		 return val.substring(0,val.lastIndexOf(","));
	}

	public static void main(String[] args) {
		
		
		String input = "Frank->Mary,Mary->Sam,Mary->Bob,Sam->Katie,Sam->Pete,Bob->John,Bob";
		String[] tree = input.split(",");
		for(int i=0;i<tree.length-1;i++){
			//System.out.println(tree[i]);
			String[] s = tree[i].split("->");
			if(!al.contains(s[0])){
			al.add(s[0]);
			}
			map.put(s[1], al.indexOf(s[0]));
		}
		int parent = map.get(al.get(map.get(tree[tree.length-1])));
		String p = findNodes(parent,false);
		
		String spl[] = p.split(",");
		for(int i=0;i<spl.length;i++){
			p = findNodes(al.indexOf(spl[i]),true);
		}
		Collections.sort(gen);
		System.out.println(gen.toString().replace("[","").replace("]","").replace(" ", ""));
		
		//System.out.println(val.substring(0,val.lastIndexOf(",")));
	}

}
