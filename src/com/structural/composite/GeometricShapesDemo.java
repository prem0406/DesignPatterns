package com.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * In other Examples, Abstract class is used instead of simple class, so that a simple class and a composite
 * class both can inherit from this abstract class
 */
class GraphicObject
{
  protected String name = "Group";
  public String color;
  
  public List<GraphicObject> children = new ArrayList<>();

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public GraphicObject()
  {
  }

 

  private void print(StringBuilder stringBuilder,  int depth)
  {
	  //This part is will work for single objects
    stringBuilder.append(String.join("", Collections.nCopies(depth, "*")))
      .append(depth > 0 ? " " : "")
      .append((color == null || color.isEmpty()) ? "" : color + " ")
      .append(getName())
      .append(System.lineSeparator());
    
    //used recursion to print composite objects, if composite objects are not present then it acts as single object
    
    //this part will work for composite objects
    for (GraphicObject child : children)
      child.print(stringBuilder,  depth+1);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    print(sb, 0);
    return sb.toString();
  }
}

class Circle extends GraphicObject
{
  public Circle(String color)
  {
    name = "Circle";
    this.color = color;
  }
}

class Square extends GraphicObject
{
  public Square(String color)
  {
    name = "Square";
    this.color = color;
  }
}

public class GeometricShapesDemo
{
  public static void main(String[] args)
  {
    GraphicObject drawing = new GraphicObject();
    drawing.setName("My Drawing");
    drawing.children.add(new Square("Red"));
    drawing.children.add(new Circle("Yellow"));

    GraphicObject group = new GraphicObject();
    group.children.add(new Circle("Blue"));
    group.children.add(new Square("Blue"));
    drawing.children.add(group);

    System.out.println(drawing);
  }
}