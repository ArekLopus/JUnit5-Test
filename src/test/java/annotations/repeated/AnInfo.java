package annotations.repeated;

//-JUnit Jupiter provides the ability to repeat a test a specified number of times by annotating a method with @RepeatedTest and specifying the total
// number of repetitions desired. Each invocation of a repeated test behaves like the execution of a regular @Test method with full support
// for the same lifecycle callbacks and extensions.

//-In addition to specifying the number of repetitions, a custom display name can be configured for each repetition via the name attribute of
// the @RepeatedTest annotation. Furthermore, the display name can be a pattern composed of a combination of static text and dynamic placeholders.
//-The following placeholders are currently supported.
// • {displayName}: display name of the @RepeatedTest method
// • {currentRepetition}: the current repetition count
// • {totalRepetitions}: the total number of repetitions

//-The default display name for a given repetition is generated based on the following pattern: "repetition {currentRepetition} of {totalRepetitions}".
// You can also use the predefined patterns from RepeatedTest class:
//	CURRENT_REPETITION_PLACEHOLDER - {currentRepetition}
//	DISPLAY_NAME_PLACEHOLDER - {displayName}
//	LONG_DISPLAY_NAME - "{displayName} :: repetition {currentRepetition} of {totalRepetitions}"
//	SHORT_DISPLAY_NAME - "repetition {currentRepetition} of {totalRepetitions}"
//	TOTAL_REPETITIONS_PLACEHOLDER - {totalRepetitions}

//-In order to retrieve information about the current repetition and the total number of repetitions programmatically, a developer can choose to have
// an instance of RepetitionInfo injected into a @RepeatedTest, @BeforeEach, or @AfterEach method.
public class AnInfo {}
