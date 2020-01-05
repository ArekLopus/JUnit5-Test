package extensions;

//-JUnit 5 extensions are related to a certain event in the execution of a test, referred to as an extension point.
// When a certain life cycle phase is reached, the JUnit engine calls registered extensions.
//-To create a JUnit 5 extension, we need to define a class which implements one or more interfaces corresponding to the JUnit 5 extension points.
//-All of these interfaces extend the main Extension interface, which is only a marker interface.


// AfterAllCallback		- AfterAllCallback defines the API for Extensions that wish to provide additional behavior to test containers after all tests have been invoked.
// AfterEachCallback	- AfterEachCallback defines the API for Extensions that wish to provide additional behavior to tests after each test method has been invoked.
// AfterTestExecutionCallback	- AfterTestExecutionCallback defines the API for Extensions that wish to provide additional behavior to tests immediately after each test has been executed.
// BeforeAllCallback	- BeforeAllCallback defines the API for Extensions that wish to provide additional behavior to test containers before all tests are invoked.
// BeforeEachCallback	- BeforeEachCallback defines the API for Extensions that wish to provide additional behavior to tests before each test is invoked.
// BeforeTestExecutionCallback	- BeforeTestExecutionCallback defines the API for Extensions that wish to provide additional behavior to tests immediately before each test is executed.
// ExecutionCondition	- ExecutionCondition defines the Extension API for programmatic, conditional test execution.
// Extension			- Marker interface for all extensions.
// InvocationInterceptor	- InvocationInterceptor defines the API for Extensions that wish to intercept calls to test code.
// LifecycleMethodExecutionExceptionHandler	- LifecycleMethodExecutionExceptionHandler defines the API for Extensions that wish to handle exceptions thrown during the execution of @BeforeAll, @BeforeEach, @AfterEach, and @AfterAll lifecycle methods.
// ParameterResolver	- ParameterResolver defines the API for Extensions that wish to dynamically resolve arguments for parameters at runtime.
// TestExecutionExceptionHandler	- TestExecutionExceptionHandler defines the API for Extensions that wish to handle exceptions thrown during test execution.
// TestInstanceFactory	-TestInstanceFactory defines the API for Extensions that wish to create test instances.
// TestInstancePostProcessor	- TestInstancePostProcessor defines the API for Extensions that wish to post-process test instances.
// TestTemplateInvocationContextProvider	- TestTemplateInvocationContextProvider defines the API for Extensions that wish to provide one or multiple contexts for the invocation of a @TestTemplate method.
// TestWatcher			-TestWatcher defines the API for Extensions that wish to process test results.


// ExtensionContext	- ExtensionContext encapsulates the context in which the current test or container is being executed.
// ExtensionContext.Store - Store provides methods for extensions to save and retrieve data.
// ExtensionContext.Store.CloseableResource - Classes implementing this interface indicate that they want to ExtensionContext.Store.CloseableResource.close() some underlying resource or resources when the enclosing Store is closed.
// ParameterContext	- ParameterContext encapsulates the context in which an Executable will be invoked for a given Parameter.
// ReflectiveInvocationContext<T extends Executable> - ReflectiveInvocationContext encapsulates the context of a reflective invocation of an executable (method or constructor).
// TestInstanceFactoryContext	- TestInstanceFactoryContext encapsulates the context in which a test class is to be instantiated by a TestInstanceFactory.
// TestTemplateInvocationContext	- TestTemplateInvocationContext represents the context of a single invocation of a test template.

public class AInfo_Interfaces {}
