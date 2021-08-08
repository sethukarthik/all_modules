package com.all_modules.annotations;

import java.lang.reflect.Method;

//@MyAnnotation(count = 123, name = "Java") 
//@MyAnnotation(intArray={123}) //we don't need to consider the elements if it does contains default values 

public class AnnotationClass implements MyInterface {
	private int count;

	@MyAnnotation(count = 123, name = "Java", intArray = {1,2})
	public void open_1(int count) {
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		AnnotationClass name = new AnnotationClass();
		name.open_1(0);		
	}

	@Override
	public void open() {
	}

}

//1. Implementation, Compiler, Runtime

/*
  	@Inherited
	The @Inherited annotation signals that a custom Java annotation used in a class should be inherited by subclasses inheriting from that class. Here is an @Inherited Java annotation example:
	
	java.lang.annotation.Inherited
	
	@Inherited
	public @interface MyAnnotation {
	
	}
	@MyAnnotation
	public class MySuperClass { ... }
	public class MySubClass extends MySuperClass { ... }
*/

/*
 * Override
 * Deprecated
 * Document 
 * SuppressWarnings -> It hide the warning
 * FunctionalAnnotation
 * SafeVarrags
 * Inheritance
 */
