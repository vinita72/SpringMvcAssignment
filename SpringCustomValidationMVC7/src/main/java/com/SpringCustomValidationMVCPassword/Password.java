package com.SpringCustomValidationMVCPassword;

import jakarta.validation.Constraint;

@Constraint(validatedBy = PasswordConstraintValidator.class)  

@Target( { ElementType.METHOD, ElementType.FIELD } )  
@Retention(RetentionPolicy.RUNTIME)  
public @interface Password {  
    //error message  
        public String message() default "must contain jtp";  
    //represents group of constraints     
        public Class<?>[] groups() default {};  
    //represents additional information about annotation  
        public Class<? extends Payload>[] payload() default {};  
}  