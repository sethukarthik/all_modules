package com.all_modules.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//Create container annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRepeatedAnnos{
	Words[] value();
}