package extensions;

//-In contrast to the competing Runner, TestRule, and MethodRule extension points in JUnit 4, the JUnit Jupiter extension model consists of a single,
// coherent concept: the Extension API. Note, however, that Extension itself is just a marker interface.


//	Registering Extensions
//-Extensions can be registered declaratively via @ExtendWith,
// programmatically via @RegisterExtension,
// or automatically via Java’s ServiceLoader mechanism.

//	Declarative Extension Registration
//-Developers can register one or more extensions declaratively by annotating a test interface, test class, test method, or custom composed annotation
// with @ExtendWith() and supplying class references for the extensions to register.
//	Extension Registration Order
//-Extensions registered declaratively via @ExtendWith will be executed in the order in which they are declared in the source code.
// Fe, the execution of tests in both MyFirstTests and MySecondTests will be extended by the DatabaseExtension and WebServerExtension, in exactly that order.

//	Programmatic Extension Registration
//-Developers can register extensions programmatically by annotating fields in test classes with @RegisterExtension.
//-When an extension is registered declaratively via @ExtendWith, it can typically only be configured via annotations.
// In contrast, when an extension is registered via @RegisterExtension, it can be configured programmatically — for example,
// in order to pass arguments to the extension’s constructor, a static factory method, or a builder API.
//	Extension Registration Order
//-By default, extensions registered programmatically via @RegisterExtension will be ordered using an algorithm that is deterministic but intentionally
// nonobvious. This ensures that subsequent runs of a test suite execute extensions in the same order, thereby allowing for repeatable builds.
// However, there are times when extensions need to be registered in an explicit order. To achieve that, annotate each @RegisterExtension field
// with @Order. Any @RegisterExtension field not annotated with @Order will appear at the end of the sorted list.
//-@RegisterExtension fields must not be private or null (at evaluation time) but may be either static or non-static.
//	Static Fields
//-If a @RegisterExtension field is static, the extension will be registered after extensions that are registered at the class level via @ExtendWith.
// Such static extensions are not limited in which extension APIs they can implement. Extensions registered via static fields may therefore implement
// class-level and instance-level extension APIs such as BeforeAllCallback, AfterAllCallback, and TestInstancePostProcessor
// as well as method-level extension APIs such as BeforeEachCallback, etc.
//	Instance Fields
//-If a @RegisterExtension field is non-static (i.e., an instance field), the extension will be registered after the test class has been instantiated and
// after each registered TestInstancePostProcessor has been given a chance to post-process the test instance (potentially injecting the instance of the
// extension to be used into the annotated field). Thus, if such an instance extension implements class-level or instance-level extension APIs such as
// BeforeAllCallback, AfterAllCallback, or TestInstancePostProcessor, those APIs will not be honored. By default, an instance extension will be registered
// after extensions that are registered at the method level via @ExtendWith; however, if the test class is configured with @TestInstance(Lifecycle.PER_CLASS)
// semantics, an instance extension will be registered before extensions that are registered at the method level via @ExtendWith.

//	Automatic Extension Registration
//-In addition to declarative extension registration and programmatic extension registration support using annotations, JUnit Jupiter also supports
// global extension registration via Java’s java.util.ServiceLoader mechanism, allowing third-party extensions to be auto-detected and automatically
// registered based on what is available in the classpath.
//-Specifically, a custom extension can be registered by supplying its fully qualified class name in a file named org.junit.jupiter.api.extension.Extension
// within the /META-INF/services folder in its enclosing JAR file.
//	Enabling Automatic Extension Detection
//-Auto-detection is an advanced feature and is therefore not enabled by default. To enable it, simply set the junit.jupiter.extensions.autodetection.enabled
// configuration parameter to true. This can be supplied as a JVM system property, as a configuration parameter in the LauncherDiscoveryRequest that is
// passed to the Launcher, or via the JUnit Platform configuration file (see Configuration Parameters for details).
//-For example, to enable auto-detection of extensions, you can start your JVM with the following system property.
//	-Djunit.jupiter.extensions.autodetection.enabled=true
//-When auto-detection is enabled, extensions discovered via the ServiceLoader mechanism will be added to the extension registry after
// JUnit Jupiter’s global extensions (e.g., support for TestInfo, TestReporter, etc.).

//	Extension Inheritance
//-Registered extensions are inherited within test class hierarchies with top-down semantics. Similarly, extensions registered at the class-level
// are inherited at the method-level. Furthermore, a specific extension implementation can only be registered once for a given extension context
// and its parent contexts. Consequently, any attempt to register a duplicate extension implementation will be ignored.


//	Conditional Test Execution
//-ExecutionCondition defines the Extension API for programmatic, conditional test execution.
//-An ExecutionCondition is evaluated for each container (e.g., a test class) to determine if all the tests it contains should be executed based on
// the supplied ExtensionContext. Similarly, an ExecutionCondition is evaluated for each test to determine if a given test method should be executed
// based on the supplied ExtensionContext.
//-When multiple ExecutionCondition extensions are registered, a container or test is disabled as soon as one of the conditions returns disabled.
// Thus, there is no guarantee that a condition is evaluated because another extension might have already caused a container or test to be disabled.
// In other words, the evaluation works like the short-circuiting boolean OR operator.
//-See the source code of DisabledCondition and @Disabled for concrete examples.
//	Deactivating Conditions
//-Sometimes it can be useful to run a test suite without certain conditions being active. For example, you may wish to run tests even if they are
// annotated with @Disabled in order to see if they are still broken. To do this, simply provide a pattern for the junit.jupiter.conditions.deactivate
// configuration parameter to specify which conditions should be deactivated (i.e., not evaluated) for the current test run. The pattern can be supplied
// as a JVM system property, as a configuration parameter in the LauncherDiscoveryRequest that is passed to the Launcher, or via the JUnit Platform
// configuration file (see Configuration Parameters for details).
//-For example, to deactivate JUnit’s @Disabled condition, you can start your JVM with the following system property.
//	-Djunit.jupiter.conditions.deactivate=org.junit.*DisabledCondition


//	Test Instance Factories
//-TestInstanceFactory defines the API for Extensions that wish to create test class instances.
//-Common use cases include acquiring the test instance from a DI framework or invoking a static factory method to create the test class instance.
//-If no TestInstanceFactory is registered, the framework will simply invoke the sole constructor for the test class to instantiate it,
// potentially resolving constructor arguments via registered ParameterResolver extensions.
//-Extensions that implement TestInstanceFactory can be registered on test interfaces, top-level test classes, or @Nested test classes.
//-Registering multiple extensions that implement TestInstanceFactory for any single class will result in an exception being thrown for all tests in that
// class, in any subclass, and in any nested class. Note that any TestInstanceFactory registered in a superclass or enclosing class (i.e., in the case of
// a @Nested test class) is inherited. It is the user’s responsibility to ensure that only a single TestInstanceFactory is registered for any specific test class.


//	Test Instance Post-processing
//-TestInstancePostProcessor defines the API for Extensions that wish to post process test instances.
//-Common use cases include injecting dependencies into the test instance, invoking custom initialization methods on the test instance, etc.
//-For a concrete example, consult the source code for the MockitoExtension and the SpringExtension.


//	Parameter Resolution
//-ParameterResolver defines the Extension API for dynamically resolving parameters at runtime.
//-If a test class constructor, test method, or lifecycle method (see Test Classes and Methods) accepts a parameter, the parameter must be resolved
// at runtime by a ParameterResolver. A ParameterResolver can either be built-in (see TestInfoParameterResolver) or registered by the user.
// Generally speaking, parameters may be resolved by name, type, annotation, or any combination thereof.
// For concrete examples, consult the source code for CustomTypeParameterResolver and CustomAnnotationParameterResolver.
//-Due to a bug in the byte code generated by javac on JDK versions prior to JDK 9, looking up annotations on parameters directly via the core
// java.lang.reflect.Parameter API will always fail for inner class constructors (e.g., a constructor in a @Nested test class).
// The ParameterContext API supplied to ParameterResolver implementations therefore includes the following convenience methods for correctly looking up
// annotations on parameters. Extension authors are strongly encouraged to use these methods instead of those provided in java.lang.reflect.Parameter
// in order to avoid this bug in the JDK.
//	boolean isAnnotated(Class<? extends Annotation> annotationType)
//	Optional<A> findAnnotation(Class<A> annotationType)
//	List<A> findRepeatableAnnotations(Class<A> annotationType)


//	Test Result Processing
//-TestWatcher defines the API for extensions that wish to process the results of test method executions.
// Specifically, a TestWatcher will be invoked with contextual information for the following events.
// • testDisabled: invoked after a disabled test method has been skipped
// • testSuccessful: invoked after a test method has completed successfully
// • testAborted: invoked after a test method has been aborted
// • testFailed: invoked after a test method has failed
//-In contrast to the definition of "test method" presented in Test Classes and Methods, in this context test method refers to any @Test method
// or @TestTemplate method (for example, a @RepeatedTest or @ParameterizedTest).
//-Extensions implementing this interface can be registered at the method level or at the class level. In the latter case they will be invoked for
// any contained test method including those in @Nested classes.
//-Any instances of ExtensionContext.Store.CloseableResource stored in the Store of the provided ExtensionContext will be closed before methods
// in this API are invoked (see Keeping State in Extensions). You can use the parent context’s Store to work with such resources.


//	Test Lifecycle Callbacks
//-The following interfaces define the APIs for extending tests at various points in the test execution lifecycle. Consult the following sections for
// examples and the Javadoc for each of these interfaces in the org.junit.jupiter.api.extension package for further details.
// • BeforeAllCallback
//   • BeforeEachCallback
//     • BeforeTestExecutionCallback
//     • AfterTestExecutionCallback
//   • AfterEachCallback
// • AfterAllCallback
//-Implementing Multiple Extension APIs - Extension developers may choose to implement any number of these interfaces within a single extension.
// Consult the source code of the SpringExtension for a concrete example.


//	Exception Handling
//-Exceptions thrown during the test execution may be intercepted and handled accordingly before propagating further, so that certain actions like
// error logging or resource releasing may be defined in specialized Extensions. JUnit Jupiter offers API for Extensions that wish to handle exceptions
// thrown during @Test methods via TestExecutionExceptionHandler and for those thrown during one of test lifecycle methods (@BeforeAll, @BeforeEach,
// @AfterEach and @AfterAll) via LifecycleMethodExecutionExceptionHandler.


//	Intercepting Invocations
//-InvocationInterceptor defines the API for Extensions that wish to intercept calls to test code.


//	Providing Invocation Contexts for Test Templates
//-A @TestTemplate method can only be executed when at least one TestTemplateInvocationContextProvider is registered. Each such provider
// is responsible for providing a Stream of TestTemplateInvocationContext instances. Each context may specify a custom display name and a list
// of additional extensions that will only be used for the next invocation of the @TestTemplate method.




//-All extension interfaces (ExecutionCondition, BeforeAllCallback, etc) EXTEND Extension interface! No need to declare it.

//-Lifecycle callbacks:
//	BeforeAllCallback
//	@BeforeAll
//	TestInstancePostProcessor
//	BeforeEachCallback
//	@BeforeEach
//	BeforeTestExecutionCallback
//	@Test
//	AfterTestExecutionCallback
//	@AfterEach
//	AfterEachCallback
//	@AfterAll
//	AfterAllCallback

public class AInfo_ {}
