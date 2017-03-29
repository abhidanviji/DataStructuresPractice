import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class TextExtract {

	public static void main(String[] args) {
		int count = 0,ind=1;
		HashMap<String, Integer> map = new HashMap<>();
		String s = "natural language processing|Natural Language Processing| three additional|program|programmatic computing plus the combination of three additional capabilities|\"Combination\"";
		String[] spl = s.split("\\|");
		
		for (int i = 0; i < spl.length - 1; i++) {
			String[] chk = spl[i].split(" ");
			if(chk.length==1){
				String[] achk = spl[i+1].split(" ");
				for(int j=0;j<achk.length;j++){
					if(spl[i].equalsIgnoreCase(achk[i]))
						count++;
				}
				if(count == 0){
					map.put(spl[i], ind);
					ind++;
				}
				System.out.println(spl[i]);
			}
			if (spl[i].toLowerCase().contains(spl[i + 1].toLowerCase())) {
				map.remove(spl[i+1],ind);
				map.put(spl[i], ind);
				ind++;
			} else if (spl[i+1].toLowerCase().contains(spl[i].toLowerCase())) {
				map.remove(spl[i],ind);
				map.put(spl[i+1], ind);
				ind++;
			}
			
			count =0;
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
		    String key = entry.getKey().toString();
		    Integer value = entry.getValue();
		    System.out.println("key, " + key + " value " + value);
		}

	}

}
