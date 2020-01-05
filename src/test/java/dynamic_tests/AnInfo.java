package dynamic_tests;

//-The standard @Test annotation in JUnit Jupiter is very similar to the @Test annotation in JUnit 4. Both describe methods that implement test cases.
// These test cases are static in the sense that they are fully specified at compile time, and their behavior cannot be changed by anything happening at runtime.
// Assumptions provide a basic form of dynamic behavior but are intentionally rather limited in their expressiveness.

//-In addition to these standard tests a completely new kind of test programming model has been introduced in JUnit Jupiter.
// This new kind of test is a dynamic test which is generated at runtime by a factory method that is annotated with @TestFactory.

//In contrast to @Test methods, a @TestFactory method is not itself a test case but rather a factory for test cases.
// Thus, a dynamic test is the product of a factory. Technically speaking, a @TestFactory method must return a single DynamicNode or a Stream,
// Collection, Iterable, Iterator, or array of DynamicNode instances.
//-Instantiable subclasses of DynamicNode are DynamicContainer and DynamicTest.
// DynamicContainer instances are composed of a display name and a list of dynamic child nodes,
// enabling the creation of arbitrarily nested hierarchies of dynamic nodes.
// DynamicTest instances will be executed lazily, enabling dynamic and even non-deterministic generation of test cases.

//-Any Stream returned by a @TestFactory will be properly closed by calling stream.close(), making it safe to use a resource such as Files.lines().

//-As with @Test methods, @TestFactory methods must not be private or static and may optionally declare parameters to be resolved by ParameterResolvers.

//-A DynamicTest is a test case generated at runtime. It is composed of a display name and an Executable.
// Executable is a @FunctionalInterface which means that the implementations of dynamic tests can be provided as lambda expressions or method references.

//	Dynamic Test Lifecycle
//-The execution lifecycle of a dynamic test is quite different than it is for a standard @Test case. Specifically, there are no lifecycle callbacks
// for individual dynamic tests. This means that @BeforeEach and @AfterEach methods and their corresponding extension callbacks are executed
// for the @TestFactory method but not for each dynamic test. In other words, if you access fields from the test instance within a lambda expression for
// a dynamic test, those fields will not be reset by callback methods or extensions between the execution of individual dynamic tests generated
// by the same @TestFactory method.
//-As of JUnit Jupiter 5.5.2, dynamic tests must always be created by factory methods;
// however, this might be complemented by a registration facility in a later release.

public class AnInfo {}
