package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewShapeFactory {

	//by type
	@Autowired
	@Qualifier("square")
	IShape shape;

	//by Name
	@Autowired
	IShape triangle;
	IShape rectangle;

	public NewShapeFactory(IShape rectangle) {
		super();
		this.rectangle = rectangle;
	}

	public void printArea(String choice, int length,int breadth) {
		System.out.println("Printing Area");
		if(choice.equals("s"))
		shape.calcArea(length, breadth);
		if(choice.equals("r"))
		rectangle.calcArea(length, breadth);
		if(choice.equals("t"))
		triangle.calcArea(length, breadth);
	}


}
