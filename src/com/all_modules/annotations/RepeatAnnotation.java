package com.all_modules.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnnotation {
	
	// Repeat Words on newMethod
    @Words(word = "First", value = 1)
    @Words(word = "Second", value = 2)
    public static void newMethod(){
    	RepeatAnnotation obj = new RepeatAnnotation();
  
        try{
            Class<?> c = obj.getClass();
  
            // Obtain the annotation for newMethod
            Method m = c.getMethod("newMethod");
              
            // Display the repeated annotation
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        }catch (NoSuchMethodException e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        newMethod();
    }
    
}
