package conditional_execution;

//-Entire test classes or individual test methods may be disabled
// • via the @Disabled annotation,
// • via one of the annotations discussed in Conditional Test Execution,
// • or via a custom ExecutionCondition.

//-The ExecutionCondition extension API in JUnit Jupiter allows developers to either enable or disable a container or test based on certain conditions
// programmatically. The simplest example of such a condition is the built-in DisabledCondition which supports the @Disabled annotation.
// In addition to @Disabled, JUnit Jupiter also supports several other annotation-based conditions in the org.junit.jupiter.api.condition package
// that allow developers to enable or disable containers and tests declaratively.

//-Note that any of the conditional annotations may also be used as a meta-annotation in order to create a custom composed annotation.
// For example, the @TestOnMac annotation in the @EnabledOnOs demo shows how you can combine @Test and @EnabledOnOs in a single, reusable annotation.

//-Each of the conditional annotations can only be declared once on a given test interface, test class, or test method.
// If a conditional annotation is directly present, indirectly present, or meta-present multiple times on a given element, only the first such annotation
// discovered by JUnit will be used; any additional declarations will be silently ignored.
// Note, however, that each conditional annotation may be used in conjunction with other conditional annotations in the org.junit.jupiter.api.condition pkg.


//	Operating System Conditions
//-A container or test may be enabled or disabled on a particular operating system via the @EnabledOnOs and @DisabledOnOs annotations.

//	Java Runtime Environment Conditions
//-A container or test may be enabled or disabled on a particular version of the Java Runtime Environment (JRE) via the @EnabledOnJre and @DisabledOnJre annotations.

//	System Property Conditions
//-A container or test may be enabled or disabled based on the value of the named JVM system property via the @EnabledIfSystemProperty and @DisabledIfSystemProperty annotations.
// The value supplied via the matches attribute will be interpreted as a regular expression.

//	Environment Variable Conditions
//-A container or test may be enabled or disabled based on the value of the named environment variable from the underlying operating system via
// the @EnabledIfEnvironmentVariable and @DisabledIfEnvironmentVariable annotations.
// The value supplied via the matches attribute will be interpreted as a regular expression.

//	Script-based Conditions
//-Conditional test execution via @EnabledIf and @DisabledIf is deprecated for removal in a 5.6 version of JUnit Jupiter.
//-JUnit Jupiter provides the ability to either enable or disable a container or test depending on the evaluation of a script configured via
// the @EnabledIf or @DisabledIf annotation. Scripts can be written in JavaScript, Groovy, or any other scripting language for which there is support
// for the Java Scripting API, defined by JSR 223.
public class AnInfo {}
