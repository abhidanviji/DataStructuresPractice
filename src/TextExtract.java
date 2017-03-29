import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class TextExtract {

	public static void main(String[] args) {
		int count = 0, ind = 1;

		HashMap<String, Integer> map = new HashMap<>();
		String s = "\"watson Represents\"|watson represents|Watson represents a first step into cognitive systems -- a new era of computing.|first step into Cognitive|Cognitive Systems - a new era of computing,|what does watson represent";
		String[] spl = s.split("\\|");
		String spl1[] = spl.clone();
		for (int main = 0; main < spl.length; main++) {
			for (int i = 0; i < spl.length; i++) {
				if (i != main) {
					spl[i] = spl[i].replace("\"", "");
					spl[i] = spl[i].replace("--*", "-");
					spl[main] = spl[main].replace("\"", "");
					spl[main] = spl[main].replace("--*", "-");
					String[] chk = spl[main].split(" ");
					if (chk.length == 1) {
						String[] achk = spl[i].split(" ");
						for (int j = 0; j < achk.length; j++) {
							if (spl[i].equalsIgnoreCase(achk[j]))
								count++;
						}
						if (count == 0) {
							map.put(spl1[main], ind);
							ind++;
						}
						System.out.println(spl[main]);
					}
					if (spl[main].toLowerCase().contains(spl[i].toLowerCase())) {
						System.out.println("Print - " + main + "-" + i + "-" + spl[main].toLowerCase() + "=="
								+ spl[i].toLowerCase());
						map.remove(spl1[i], ind);
						map.put(spl1[main], ind);
						ind++;
					} else if (spl[i].toLowerCase().contains(spl[main].toLowerCase())) {
						System.out.println("Print1 - " + main + "-" + i + "-" + spl[i].toLowerCase() + "=="
								+ spl[main].toLowerCase());
						map.remove(spl1[main], ind);
						map.put(spl1[i], ind);
						ind++;
					}

					count = 0;
				}
			}
		}

		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey().toString();
			Integer value = entry.getValue();
			System.out.println("key, " + key + " value " + value);
		}

	}

}
