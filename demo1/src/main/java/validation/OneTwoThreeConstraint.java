package validation;

import java.lang.annotation.*;

import javax.validation.Constraint;
import javax.validation.Payload;
@Constraint(validatedBy = OneTwoThreeConstraintValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)

public @interface OneTwoThreeConstraint {
    String message() default "123 is unallowed";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
