
//Working program with FastReader

/**
 * Class(es) to describe a faster, more efficient reader to replace Java's
 * scanner class.
 * 
 * @author ccardona
 *
 */
public class Tester {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int k = s.nextInt();
		int count = 0;
		while (n-- > 0) {
			int x = s.nextInt();
			if (x % k == 0)
				count++;
		}
		System.out.println(count);
	}
}
