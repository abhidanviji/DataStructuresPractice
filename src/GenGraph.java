import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class GenGraph {
	public static HashMap<String, Integer> map = new HashMap<>();
	public static ArrayList<String> al = new ArrayList<>();
	public static ArrayList<String> gen = new ArrayList<>();
	public static String val = "";

	public static String findNodes(int parent, boolean flag) {
		val = "";
		for (Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
			if (entry.getValue().equals(parent)) {
				val = val + entry.getKey() + ",";
				if (flag)
					gen.add(entry.getKey());
			}
		}
		return val.substring(0, val.lastIndexOf(","));
	}

	public static void main(String[] args) {

		String input = "F->J,I->M,F->K,I->L,H->I,D->F,D->E,G->H,B->D,B->C,A->G,A->B,G";
		String[] tree = input.split(",");
		for (int i = 0; i < tree.length - 1; i++) {
			String[] s = tree[i].split("->");
			if (!al.contains(s[0])) {
				al.add(s[0]);
			}
			map.put(s[1], al.indexOf(s[0]));
		}
		for(int i=0;i<al.size();i++){
			System.out.println(i+":"+al.get(i));
		}
	    int parent = map.get(al.get(map.get(tree[tree.length - 1])));
		//int parent = map.get(al.get(4));
		System.out.println(parent);
		String p = findNodes(parent, false);

		String spl[] = p.split(",");
		for (int i = 0; i < spl.length; i++) {
			p = findNodes(al.indexOf(spl[i]), true);
		}
		Collections.sort(gen);
		System.out.println(gen.toString().replace("[", "").replace("]", "").replace(" ", ""));
	}
}
