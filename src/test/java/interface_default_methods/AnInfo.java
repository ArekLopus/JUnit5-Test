package interface_default_methods;

//-JUnit 5 allows @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, @TestTemplate, @BeforeEach, and @AfterEach to be declared on interface default methods.
// @BeforeAll and @AfterAll can either be declared on static methods in a test interface or on interface default methods if the test interface
// or test class is annotated with @TestInstance(Lifecycle.PER_CLASS) (see Test Instance Lifecycle). Here are some examples.

//-@ExtendWith and @Tag can be declared on a test interface so that classes that implement the interface automatically inherit its tags and extensions.

//-Unit5 introduces the concept of a test interface which allows you to pre-implement some test code as default methods in interfaces.
//-These default test methods can be inherited by implementing test classes, thereby enabling multiple inheritance in tests.

//-@Test, @TestFaactry, @BeforeEach, @AfterEach can be defined on interface default methods.
//-@BeforeAll and @AfterAll can be declared on static methods in a test interface.
// If a test class that implements a given interface ot the interface itself is annotated with @TestInstance(TestInstance.Lifecycle.PER_CLASS)
// @BeforeAll and @AfterAll methods dont need to be static, but default methods.
//-@ExtendWith and @Tag also can be declared on test interfaces to configure extensions and tags.
public class AnInfo {}
