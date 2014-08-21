import java.util.HashMap;
import java.util.HashSet;
public class PointLab{
	public static void main(String[] args) {

		HashMap<Point,String> map = new HashMap<Point,String>();
		Point p1 = new Point(10,20);
		map.put(p1, "Point p1");
		Point p2 = new Point(10,20);

		System.out.println(map.get(p2));
		System.out.println(map.get(p1)); 

		HashSet<Point> set = new HashSet<Point>();
		Point p3 = new Point(100,0);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.print("Points: ");
		for (Point point : set){
			System.out.print("("+point.x+","+ point.y+")"); 
		}
	}
}

class Point{

	public int x;
	public int y;

	public Point (int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public boolean equals(Object obj)
	{
		Point newPoint = (Point)obj;

		if (newPoint.x==x)
		{
			if (newPoint.y==y)
				return true;
		return false;
		}
	return false;
	}

	// public int hashCode()
	// {
	// 	int value;

	// 	value=x+y;

	// 	return value;
	// }

}

