package pe.app.validator;

import java.lang.annotation.*;
import javax.validation.*;
import pe.app.validator.Text.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=TextValidator.class)
public @interface Text 
{
	String message() default "{application.error.Text}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    TextType value();
    
    public static class TextValidator implements ConstraintValidator<Text,String>
    {
        private Text text;
        
        public void initialize(Text text) {
            this.text=text;
        }
        
        public boolean isValid(String str, ConstraintValidatorContext cvc) 
        {
            boolean valid=true;
            
            if(str.isEmpty())
                return false;
            
            if(text.value()==TextType.INTEGER)
            {
                try{Long.parseLong(str);}
                catch(NumberFormatException e){valid=false;}
            }
            else if(text.value()==TextType.DOUBLE)
            {
                try{Double.parseDouble(str);}
                catch(NumberFormatException e){valid=false;}
            }
            else if(text.value()==TextType.LETTERS)
            {
                if(!str.trim().matches("[a-zA-ZáÁéÉíÍóÓúÚüÜñÑ ]*"))
                    valid=false;
            }
            
            return valid;
        }
    }
    
    public enum TextType {
        INTEGER,DOUBLE,LETTERS
    }
}
