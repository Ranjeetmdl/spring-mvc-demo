package com.luv2code.springdemo.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements 
ConstraintValidator<CourseCode, String>{
	
	private String[] coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix=theCourseCode.value();
	}
	@Override
	public boolean isValid(String theCode, 
			ConstraintValidatorContext theConstraintValidatorContext) {
		if(theCode != null){
			for(String courseCode : coursePrefix)
				if(theCode.startsWith(courseCode))
					return true;
		 return false;
		}else{
			return true;
		}
	}

}
