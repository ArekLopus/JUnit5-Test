package annotations.test_factory_dynamic_tests;

//-With JUnit 5’s dynamic tests it is possible to define fully fledged test cases at run time.
// This way, tests can be created from parameters, external data sources, or simple lambda expressions.
// They are particularly suitable for hierarchical data.
//-This fixes a long-standing weakness of JUnit 4, where tests had to be defined at compile time.

//-Contrary to the Static Tests, which allow us to define a static number of fixed test cases at compile time,
// Dynamic Tests allow us to define the test case dynamically at runtime.

//-Dynamic tests must return either a Collection, Iterable, Iterator, or Stream, of DynamicNode types.
// DynamicNode is an abstract class with two default implementations of DynamicTest and DynamicContainer. 

//-DynamicTest is the executable test composed in a @TestFactory method that will be executed by JUnit.
// For building DynamicTests the JUnit has provided some factory methods: dynamicTest(), stream().
//-dynamicTest(String displayName, Executable executable). displayName is the name that will show up in test reports and
// executable is a method reference or lambda of the code that will actually be executed in the test.


// DynamicTest and DynamicContainer are concrete classes of DynamicNode abstract class.
// The former is a simple wrapper class for a single test and the latter a just-as-simple wrapper for a bunch of dynamic tests.
//-A DynamicTest stores the test’s name as a String and its code as an Executable – that’s like a Runnable that can throw a Throwable (the naming is formidable).
// It is created with a static factory method:
//	public static DynamicTest dynamicTest(String name, Executable test);
//-A DynamicContainer is even simpler. It stores a name and a bunch of dynamic tests. It also comes with a static factory method: (There is also an overload that accepts a Stream<DynamicNode>.)
//	public static DynamicContainer dynamicContainer(String name, Iterable<DynamicNode> dynamicNodes);
// 
//-The @TestFactory annotate methods. Those methods must return an Iterator, Iterable (this includes all collections), or Stream of dynamic nodes.
//	@TestFactory
//	List<DynamicTest> testPointsDynamically() {
//		return List.of(
//			DynamicTest.dynamicTest("Test One", () -> {	/* test code */ }),
//			DynamicTest.dynamicTest("Test Two",	() -> {	/* test code */	})
//		);
//	}
//-We are able to dynamically create tests at run time. And tools won’t know the difference and report on each dynamic test individually.


//-Lifecycle callbacks and extensions are not applied around the invocation of a dynamic test.
//-A dynamic test cannot directly benefit from parameter resolution.
//-A dynamic test cannot make use of a TestReporter.


//-DynamicContainer is a container generated at run time. It is created using display name and Iterable or Stream of instances of DynamicNode.

//-Imagine you have a hierarchical data structure (could be JSON or a POJO tree) and want to generate a test case for each element in that structure.
// Then a combination of dynamic containers and dynamic tests lets you organize these tests in a way that closely resembles the data structure,
// making it much easier to navigate between the two. 
//-You’re gonna do three things for each node:
// • create DynamicTest instances to test the node’s behavior
// • create a DynamicContainer for each of the node’s children
// • create a DynamicContainer for the node itself to wrap the previously created tests and containers
// This gives you a one-to-one relationship of nodes in your data structure to dynamic containers in the resulting test tree,
// where each container holds the tests that apply to the corresponding node.
//-The cool thing is, if a node’s correct behavior depends on its children’s correct behavior, you can follow the path of failed tests to the root cause.



public class AnInfo {}
