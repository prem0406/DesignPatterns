package com.structural.bridge.demo;

interface Renderer {
	public String whatToRenderAs();
}

class VectorRenderer implements Renderer
{
	Shape shape;
	public VectorRenderer() {
		
	}
	
	public VectorRenderer(Shape shape) {
		this.shape = shape;
	}

	@Override
	public String whatToRenderAs() {
		return String.format("Drawing %s as lines", shape.getName());
	}

}

class RasterRenderer implements Renderer
{
	Shape shape;
	public RasterRenderer() {
		
	}
	
	public RasterRenderer(Shape shape) {
		this.shape = shape;
	}
	@Override
	public String whatToRenderAs() {
		return String.format("Drawing %s as pixels", shape.getName());
	}
}

abstract class Shape
{
  public abstract String getName();
}

class Triangle extends Shape
{
  @Override
  public String getName()
  {
    return "Triangle";
  }
}

class Square extends Shape
{
  @Override
  public String getName()
  {
    return "Square";
  }
}

//class VectorSquare extends Square
//{
//  @Override
//  public String toString()
//  {
//    return String.format("Drawing %s as lines", getName());
//  }
//}
//
//class RasterSquare extends Square
//{
//  @Override
//  public String toString()
//  {
//    return String.format("Drawing %s as pixels", getName());
//  }
//}

// imagine VectorTriangle and RasterTriangle are here too

public class BridgeExample {
	
	
	public static void main(String[] args) {
		Shape t = new Triangle();
		Shape s = new Square();
		
		Renderer vector = new VectorRenderer(t);
		Renderer raster = new RasterRenderer(s);
		
		System.out.println(vector.whatToRenderAs());
		System.out.println(raster.whatToRenderAs());
	}
}
