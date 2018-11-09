package auxiliar.withoutJUnit;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

// La METAinformacion se retiene hasta "RUNTIME", "CLASS", "SOURCE"
@Retention(RetentionPolicy.RUNTIME)
// A que tipo de elemento puedo aplicarle esta anotacion para que compile
@Target(ElementType.METHOD) 
// Una Anotacion es una interfaz que interpone el "@"
public @interface AnnotationExample {

}
