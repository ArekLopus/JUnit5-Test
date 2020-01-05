package injectables;

//-In all prior JUnit versions, test constructors or methods were not allowed to have parameters (at least not with the standard Runner implementations).
// As one of the major changes in JUnit Jupiter, both test constructors and methods are now permitted to have parameters.
// This allows for greater flexibility and enables Dependency Injection for constructors and methods.

//-ParameterResolver defines the API for test extensions that wish to dynamically resolve parameters at runtime.
// If a test class constructor, a test method, or a lifecycle method accepts a parameter, the parameter must be resolved
// at runtime by a registered ParameterResolver.

//-There are currently three built-in resolvers that are registered automatically.
// TestInfo - allows to get information related to a test suite or test method such as display name, tags, test class.
// TestReporter - used to print test information to stout or stderr.
// RepetitionInfo - used only on test with @RepeatedTest and provides info regarding current repetition number or total of repetitions.

//-Other parameter resolvers must be explicitly enabled by registering appropriate extensions via @ExtendWith.
public class AnInfo {}