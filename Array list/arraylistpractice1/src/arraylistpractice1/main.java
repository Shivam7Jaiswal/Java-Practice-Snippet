//Merging two arraylist


package arraylistpractice1;
import java.util.ArrayList;
class main {

	public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<>(); 
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(10);
	a.add(50);

	ArrayList<Integer> b=new ArrayList<>();
	b.add(80);
	b.add(90);
	
	ArrayList<Integer> c=new ArrayList<>();
	int count=0;
	for (int i=0;i<a.size();i++) {
		int g;
		g=a.get(i);
		c.add(g);
		count++;
	}
	System.out.println(count);
	int z=0;
	int size=a.size()+b.size();
	for(int i=count;i<size;i++) {
		int g;
		g=b.get(z);
		c.add(g);
		z++;
	}
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	}
}
