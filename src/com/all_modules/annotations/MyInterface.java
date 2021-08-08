package com.all_modules.annotations;

import java.lang.annotation.Documented;

//@MyAnnotation(count = 345, name = "Spring",intArray= {1,2,3,4})
public interface MyInterface {
	@Deprecated
	void open();
}

//@Document -> Javdoc