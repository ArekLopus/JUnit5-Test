package annotations.parameterized;

import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD})
@ParameterizedTest(name = "Elaborate name listing all {arguments}")
@ValueSource(strings = { "Hello", "JUnit" })
public @interface MyParams { }
