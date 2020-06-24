package iheritace;
class Box
{
	int width,depth,height;
	Box(int a,int b,int c)
	{
		width=a;
		depth=b;
		height=c;
	}
	int volume()
	{
		return width*depth*height;
	}
}

public class example {
	public static void main(String[] args) {
		Box b=new Box(10,20,30);
		System.out.println(b.volume());
	}

}
