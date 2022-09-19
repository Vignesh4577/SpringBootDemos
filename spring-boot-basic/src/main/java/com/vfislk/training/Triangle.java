package com.vfislk.training;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	@Override
	public void calcArea(int length, int breadth) {

         System.out.println("Traiangle :"+(0.5*length*breadth));

	}

}
