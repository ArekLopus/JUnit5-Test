package parallel_execution;

//-Parallel test execution is an experimental feature as 5.5.2 version.

//-By default, JUnit Jupiter tests are run sequentially in a single thread.
//-Running tests in parallel — for example, to speed up execution — is available as an opt-in feature since version 5.3.
//-To enable parallel execution, set the junit.jupiter.execution.parallel.enabled configuration parameter to true — fe, in junit-platform.properties (see Configuration Parameters for other options).

//-Please note that enabling this property is only the first step required to execute tests in parallel.
// If enabled, test classes and methods will still be executed sequentially by default. Whether or not a node in the test tree is executed concurrently
// is controlled by its execution mode. The following two modes are available.

// SAME_THREAD - Force execution in the same thread used by the parent.
// Fe, when used on a test method, the test method will be executed in the same thread as any @BeforeAll or @AfterAll methods of the containing test class.

// CONCURRENT - Execute concurrently unless a resource lock forces execution in the same thread.

//-By default, nodes in the test tree use the SAME_THREAD execution mode. You can change the default by setting
// the junit.jupiter.execution.parallel.mode.default configuration parameter.
//-Alternatively, you can use the @Execution annotation to change the execution mode for the annotated element and its subelements (if any)
// which allows you to activate parallel execution for individual test classes, one by one.
// 		Configuration parameters to execute all tests in parallel
//	junit.jupiter.execution.parallel.enabled = true
//	junit.jupiter.execution.parallel.mode.default = concurrent

//-The default execution mode is applied to all nodes of the test tree with a few notable exceptions,
// namely test classes that use the Lifecycle.PER_CLASS mode or a MethodOrderer (except for Random).
//-In the former case, test authors have to ensure that the test class is thread-safe; in the latter, concurrent execution might conflict
// with the configured execution order. Thus, in both cases, test methods in such test classes are only executed concurrently
// if the @Execution(CONCURRENT) annotation is present on the test class or method.

//-All nodes of the test tree that are configured with the CONCURRENT execution mode will be executed fully in parallel according to the provided
// configuration while observing the declarative synchronization mechanism.
// Please note that Capturing Standard Output/Error needs to be enabled separately.

//-In addition, you can configure the default execution mode for top-level classes by setting the junit.jupiter.execution.parallel.mode.classes.default
// configuration parameter. By combining both configuration parameters, you can configure classes to run in parallel but their methods in the same thread:
//		Configuration parameters to execute top-level classes in parallel but methods in same thread
//	junit.jupiter.execution.parallel.enabled = true
//	junit.jupiter.execution.parallel.mode.default = same_thread
//	junit.jupiter.execution.parallel.mode.classes.default = concurrent

//-The opposite combination will run all methods within one class in parallel, but top-level classes will run sequentially:
//		Configuration parameters to execute top-level classes in sequentially but their methods in parallel
//	junit.jupiter.execution.parallel.enabled = true
//	junit.jupiter.execution.parallel.mode.default = concurrent
//	junit.jupiter.execution.parallel.mode.classes.default = same_thread

//-If the junit.jupiter.execution.parallel.mode.classes.default configuration parameter is not explicitly set,
// the value for junit.jupiter.execution.parallel.mode.default will be used instead.

public class AnInfo {}
