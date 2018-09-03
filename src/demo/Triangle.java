package demo;

import java.util.List;

public class Triangle 
{
	/*private List<Point> points;//initialising collections
*/	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	/*public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw()
	{
		for(Point point:points)
		{
		System.out.println("Point=(" +point.getX()+" , "+point.getY()+")");
		}
	}*/

	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw()
	{
		System.out.println("Point A=(" +getPointA().getX()+" , "+getPointA().getY()+")");
		System.out.println("Point B=(" +getPointB().getX()+" , "+getPointB().getY()+")");
		System.out.println("Point C=(" +getPointC().getX()+" , "+getPointC().getY()+")");
	}
	
	/*private String type;
	private int height;
	
	public int getHeight() {
		return height;
	}

	public Triangle(String type)
	{
		this.type=type;
	}
	public Triangle(int height)
	{
		this.height=height;
	}
	public Triangle(String type, int height)
	{
		this.type=type;
		this.height=height;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void draw()
	{
		System.out.println(getType()+" Triangle is drawn of height "+getHeight());
	}*/
}
