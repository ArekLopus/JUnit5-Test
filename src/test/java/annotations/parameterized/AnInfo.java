package annotations.parameterized;

// As ver. 5.5.2 -> status=EXPERIMENTAL, since="5.0"

//-Parameterized tests make it possible to run a test multiple times with different arguments.
//-They are declared just like regular @Test methods but use the @ParameterizedTest annotation instead.
// In addition, you must declare at least one source that will provide the arguments for each invocation and then consume the arguments in the test method.


//	Argument Sources
//-@ArgumentsSource is a repeatable annotation that is used to register argument providers for the annotated test method.
//-@ArgumentsSources is a simple container for one or more ArgumentsSource annotations.
//-@CsvFileSource is an ArgumentsSource which is used to load comma-separated value (CSV) files from one or more classpath resources.
//-@CsvSource is an ArgumentsSource which reads comma-separated values (CSV) from one or more supplied CSV lines.
//-@EmptySource is an ArgumentsSource which provides a single empty argument to the annotated @ParameterizedTest method.
//-@EnumSource is an ArgumentsSource for constants of a specified Enum.
//-@MethodSource is an ArgumentsSource which provides access to values returned from factory methods of the class in which this annotation is declared or from static factory methods in external classes referenced by fully qualified method name.
//-@NullAndEmptySource is a composed annotation that combines the functionality of @NullSource and @EmptySource.
//-@NullSource is an ArgumentsSource which provides a single null argument to the annotated @ParameterizedTest method.
//-@ValueSource is an ArgumentsSource which provides access to an array of literal values.


//	Argument Conversion
//-Widening Conversion
// JUnit Jupiter supports Widening Primitive Conversion for arguments supplied to a @ParameterizedTest. For example, a parameterized test annotated
// with @ValueSource(ints = { 1, 2, 3 }) can be declared to accept not only an argument of type int but also an argument of type long, float, or double.
//-Implicit Conversion
// To support use cases like @CsvSource, JUnit Jupiter provides a number of built-in implicit type converters.
// The conversion process depends on the declared type of each method parameter.
//-Fallback String-to-Object Conversion
// In addition to implicit conversion from strings to the target types listed in the above table, JUnit Jupiter also provides a fallback mechanism for automatic
// conversion from a String to a given target type if the target type declares exactly one suitable factory method or a factory constructor as defined below.
// • factory method: a non-private, static method declared in the target type that accepts a single String argument and returns an instance
//   of the target type. The name of the method can be arbitrary and need not follow any particular convention.
// • factory constructor: a non-private constructor in the target type that accepts a single String argument. Note that the target type must be
//   declared as either a top-level class or as a static nested class.
// If multiple factory methods are discovered, they will be ignored. If a factory method and a factory constructor are discovered,
// the factory method will be used instead of the constructor.
//-Explicit Conversion
// Instead of relying on implicit argument conversion you may explicitly specify an ArgumentConverter to use for a certain parameter using the @ConvertWith annotation.
// Note that an implementation of ArgumentConverter must be declared as either a top-level class or as a static nested class.


//	Argument Aggregation
//-By default, each argument provided to a @ParameterizedTest method corresponds to a single method parameter. Consequently, argument sources which
// are expected to supply a large number of arguments can lead to large method signatures.
//-In such cases, an ArgumentsAccessor can be used instead of multiple parameters. Using this API, you can access the provided arguments through
// a single argument passed to your test method. In addition, type conversion is supported as discussed in Implicit Conversion.

// Custom Aggregators
//-Apart from direct access to a @ParameterizedTest method’s arguments using an ArgumentsAccessor, JUnit also supports the usage of custom, reusable aggregators.
//-To use a custom aggregator, implement the ArgumentsAggregator interface and register it via the @AggregateWith annotation on a compatible parameter
// in the @ParameterizedTest method. The result of the aggregation will then be provided as an argument for the corresponding parameter when the parameterized
// test is invoked. Note that an implementation of ArgumentsAggregator must be declared as either a top-level class or as a static nested class.


//	Customizing Display Names
//-By default, the display name of a parameterized test invocation contains the invocation index and the String representation of all arguments for that
// specific invocation. However, you can customize invocation display names via the name attribute of the @ParameterizedTest annotation.

// Placeholder		Description
//  {index}			the current invocation index (1-based)
//  {arguments}		the complete, comma-separated arguments list
//  {0}, {1}, …​		an individual argument


//	Lifecycle and Interoperability
//-Each invocation of a parameterized test has the same lifecycle as a regular @Test method.
// For example, @BeforeEach methods will be executed before each invocation. Similar to Dynamic Tests, invocations will appear one by one in the test
// tree of an IDE. You may at will mix regular @Test methods and @ParameterizedTest methods within the same test class.

//-You may use ParameterResolver extensions with @ParameterizedTest methods. However, method parameters that are resolved by argument sources need
// to come first in the argument list. Since a test class may contain regular tests as well as parameterized tests with different parameter lists,
// values from argument sources are not resolved for lifecycle methods (e.g. @BeforeEach) and test class constructors.
public class AnInfo {}
