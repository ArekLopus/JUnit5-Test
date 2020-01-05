package a_basic;

//-Test Class: any top-level class, static member class, or @Nested class that contains at least one test method.
//-Test classes must not be abstract and must have a single constructor.

//-Test Method: any instance method that is directly annotated or meta-annotated with 
// @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, or @TestTemplate.

//-Lifecycle Method: any method that is directly annotated or meta-annotated with @BeforeAll, @AfterAll, @BeforeEach, or @AfterEach.

//-Test methods and lifecycle methods may be declared locally within the current test class, inherited from super classes,
// or inherited from interfaces (see Test Interfaces and Default Methods). 

//-Test classes, test methods, and lifecycle methods are not required to be public, but they must not be private.


// 	Error: org.hamcrest.Matchers"'s signer information does not match signer information of other classes in the same package
// https://stackoverflow.com/questions/9651784/hamcrest-tests-always-fail
// https://www.vogella.com/tutorials/Hamcrest/article.html#hamcrest_eclipse
public class AnInfo {}
