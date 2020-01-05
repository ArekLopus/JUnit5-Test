package executing_test_suite;

//-The JUnitPlatform runner is a JUnit 4 based Runner which enables you to run any test whose programming model is supported on the JUnit Platform
// in a JUnit 4 environment — for example, a JUnit Jupiter test class.

//-Annotating a class with @RunWith(JUnitPlatform.class) allows it to be run with IDEs and build systems that support JUnit 4
// but do not yet support the JUnit Platform directly.
//-Since the JUnit Platform has features that JUnit 4 does not have, the runner is only able to support a subset of the JUnit Platform functionality,
// especially with regard to reporting (see Display Names vs. Technical Names). But for the time being the JUnitPlatform runner is an easy way to get started.

//-If you have multiple test classes you can create a test suite as can be seen in the following example:
//	@RunWith(JUnitPlatform.class)
//	@SuiteDisplayName("JUnit Platform Suite Demo")
//	@SelectPackages("example")
//	public class JUnitPlatformSuiteDemo {}
//-The JUnitPlatformSuiteDemo will discover and run all tests in the example package and its subpackages.
// By default, it will only include test classes whose names either begin with Test or end with Test or Tests.

//-Test classes and suites annotated with @RunWith(JUnitPlatform.class) cannot be executed directly on the JUnit Platform (or as a "JUnit 5"
// test as documented in some IDEs). Such classes and suites can only be executed using JUnit 4 infrastructure.
public class AnInfo {}
