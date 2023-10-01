package validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class OneTwoThreeConstraintValidator implements ConstraintValidator<OneTwoThreeConstraint, String> {
    
    public void  initialize(OneTwoThreeConstraint constraint){

    }
    
    public boolean isValid(String constraintfield, ConstraintValidatorContext cxt){
        return constraintfield!=null && !constraintfield.equals("123");
    }
}
