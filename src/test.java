
public class test {

	public static void main(String[] args) {
		char[] a=new char[27];
		int x=0;
		for (int i = 65; i < 92; i++) {
			a[x]=(char)i;
			x++;
		}
		for (int i=0; i<a.length-1; i++){
			System.out.println(a[i]);
		}
	}
}
