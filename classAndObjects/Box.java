package classAndObjects;

class Boxs
{
	int width,depth,height;
	Boxs(int a,int b,int c)
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

public class Box {
	public static void main(String[] args) {
		Boxs b=new Boxs(10,20,30);
		System.out.println(b.volume());
	}

}


