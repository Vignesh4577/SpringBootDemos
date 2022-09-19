package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

//	@Autowired
//	@Qualifier("square") //to choose one bean
	
	@Autowired
	IShape triangle;
	
	public void printArea(int length, int breadth) {
		System.out.println("Printing Area ");
		triangle.calcArea(length, breadth);
		
	}
}
