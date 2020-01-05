package annotations.test_instance;

//-If a test class or test interface is not annotated with @TestInstance, JUnit Jupiter will use a default lifecycle mode: PER_METHOD.

//-In order to allow individual test methods to be executed in isolation and to avoid unexpected side effects due to mutable test instance state,
// JUnit creates a new instance of each test class before executing each test method.
// This "per-method" test instance lifecycle is the default behavior in JUnit Jupiter and is analogous to all previous versions of JUnit.

//-Please note that the test class will still be instantiated if a given test method is disabled via a condition
// (e.g., @Disabled, @DisabledOnOs, etc.) even when the "per-method" test instance lifecycle mode is active.

//-If you would prefer that JUnit Jupiter execute all test methods on the same test instance, annotate your test class with
// @TestInstance(Lifecycle.PER_CLASS). When using this mode, a new test instance will be created once per test class.
// Thus, if your test methods rely on state stored in instance variables, you may need to reset that state in @BeforeEach or @AfterEach methods.

//-The "per-class" mode has some additional benefits over the default "per-method" mode.
// Specifically, with the "per-class" mode it becomes possible to declare @BeforeAll and @AfterAll on non-static methods as well as on interface
// default methods. The "per-class" mode therefore also makes it possible to use @BeforeAll and @AfterAll methods in @Nested test classes.
public class AnInfo {}
