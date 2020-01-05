package annotations.meta_annotations;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Test
@DisplayName("My test")
@Tag("MyTest")
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD})
public @interface MyTest { }
