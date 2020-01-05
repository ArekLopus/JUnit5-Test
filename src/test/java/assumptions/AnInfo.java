package assumptions;

//-JUnit Jupiter comes with a subset of the assumption methods that JUnit 4 provides and adds a few that lend themselves well to being used with
// Java 8 lambda expressions and method references. All JUnit Jupiter assumptions are static methods in the org.junit.jupiter.api.Assumptions class.

//	https://junit.org/junit5/docs/5.5.2/api/org/junit/jupiter/api/Assumptions.html
// assumeFalse​, assumeTrue, assumeThat

//-Assumptions is a collection of utility methods that support conditional test execution based on assumptions.
//-In direct contrast to failed assertions, failed assumptions DO NOT result in a test failure;
// rather, a failed assumption results in a test being aborted (skipped).
//-Assumptions are typically used whenever it does not make sense to continue execution of a given test method — for example,
// if the test depends on something that does not exist in the current runtime environment.
//-Test will show skipped test if failed assumptions.
public class AnInfo {}
