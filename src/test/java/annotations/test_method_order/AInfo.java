package annotations.test_method_order;

//-By default, test methods will be ordered using an algorithm that is deterministic but intentionally nonobvious.
// This ensures that subsequent runs of a test suite execute test methods in the same order, thereby allowing for repeatable builds.

//-Although true unit tests typically should not rely on the order in which they are executed, there are times when it is necessary to enforce
// a specific test method execution order — fe, when writing integration tests or functional tests where the sequence of the tests is important,
// especially in conjunction with @TestInstance(Lifecycle.PER_CLASS).

//-To control the order in which test methods are executed, annotate your test class or test interface with @TestMethodOrder and specify the desired 
// MethodOrderer implementation. You can implement your own custom MethodOrderer or use one of the following built-in MethodOrderer implementations.
// • Alphanumeric: sorts test methods alphanumerically based on their names and formal parameter lists.
// • OrderAnnotation: sorts test methods numerically based on values specified via the @Order annotation.
// • Random: orders test methods pseudo-randomly and supports configuration of a custom seed.


//	@TestMethodOrder - EXPERIMENTAL since="5.4"
//-@TestMethodOrder is a type-level annotation that is used to configure a MethodOrderer for the test methods of the annotated test class or test interface.
// In this context, the term "test method" refers to any method annotated with @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, or @TestTemplate.
//-If @TestMethodOrder is not explicitly declared on a test class, inherited from a parent class, or declared on a test interface implemented by
// a test class, test methods will be ordered using a default algorithm that is deterministic but intentionally non obvious.


//	Order - EXPERIMENTAL since="5.4"
//-@Order is an annotation that is used to configure the order in which the annotated element (i.e., field or method)
// should be evaluated or executed relative to other elements of the same category.
//-When used with @RegisterExtension, the category applies to extension fields.
// When used with the MethodOrderer.OrderAnnotation MethodOrderer, the category applies to test methods.
//-If @Order is not explicitly declared on an element, the default order value assigned to the element is Integer.MAX_VALUE.

public class AInfo {}
