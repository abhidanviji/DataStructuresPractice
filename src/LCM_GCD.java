import java.util.ArrayList;

class LCM_GCD {
	public static ArrayList<Integer> getLCM(int[] a, int len) {
		ArrayList<Integer> lcm = new ArrayList<>();
		boolean found;
		for (int i = 1; i <= len; i++) {
			found = true;
			for (int x = 0; x < a.length; x++) {
				if (i % a[x] != 0) {
					found = false;
					break;
				}
			}
			if (found) {
				lcm.add(i);
			}
		}
		return lcm;
	}

	public static ArrayList<Integer> getGCD(int[] b,ArrayList<Integer> a) {
		ArrayList<Integer> gcd = new ArrayList<>();
		boolean found;
		for(int i=0;i<a.size();i++){
			found = true;
			for(int j=0;j<b.length;j++){
				
				if(b[j]%a.get(i)!=0){
					found = false;
					break;
				}
			}
			if (found) {
				gcd.add(a.get(i));
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		int a[] = { 2, 4 };
		int b[] = { 16, 32, 96 };
		System.out.println(getLCM(a, b[b.length - 1]));
		System.out.println(getGCD(b,getLCM(a, b[b.length - 1])));
	}
}