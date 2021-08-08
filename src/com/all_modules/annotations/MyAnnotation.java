package com.all_modules.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE) //Type allows to implements in class and interface level
@Target(ElementType.METHOD)

@Retention(RetentionPolicy.RUNTIME) //Reflection
//@Retention(RetentionPolicy.CLASS)
//@Retention(RetentionPolicy.SOURCE)


public @interface MyAnnotation {
	//we call it as elements
	//we can provide default value followed by default keywords
	String name() default "Java";
	int count() default 500;
	String[] token() default {"Spring", "Hybernet"};
	int[] intArray();
	double[] val() default {1.2, 3.4};
}

//interface and @interface -> 