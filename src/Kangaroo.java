import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		if (x2 > x1 && v2 > v1) {
			System.out.println("NO");
		} else {
			while (true) {
				int a = x1, b = x2;
				if (a == b) {
					System.out.println("YES");
					break;
				} else {
					a = a + v1;
					b = b + v2;
					if (a == b) {
						System.out.println("YES");
						break;
					}
				}
			}
		}
	}
}
