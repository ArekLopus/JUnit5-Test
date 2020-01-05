package assertions;

//-JUnit Jupiter comes with many of the assertion methods that JUnit 4 has and adds a few that lend themselves well to being used with Java 8 lambdas.
// All JUnit Jupiter assertions are static methods in the org.junit.jupiter.api.Assertions class.

//	https://junit.org/junit5/docs/5.5.2/api/org/junit/jupiter/api/Assertions.html
// assertAll, assertArrayEquals, assertDoesNotThrow, assertEquals, assertFalse, assertIterableEquals, assertLinesMatch, assertNotEquals​,
// assertNotNull, assertNotSame, assertNull, assertSame, assertThrows, assertTimeout, assertTimeoutPreemptively, assertTrue, fail​​​

//-Preemptive Timeouts with assertTimeoutPreemptively()
// Contrary to declarative timeouts, the various assertTimeoutPreemptively() methods in the Assertions class execute the provided executable or supplier
// in a different thread than that of the calling code. This behavior can lead to undesirable side effects if the code that is executed within
// the executable or supplier relies on java.lang.ThreadLocal storage.


//-Even though the assertion facilities provided by JUnit Jupiter are sufficient for many testing scenarios, there are times when more power and additional
// functionality such as matchers are desired or required. In such cases, the JUnit team recommends the use of third-party assertion libraries such as 
// AssertJ, Hamcrest, Truth, etc. Developers are therefore free to use the assertion library of their choice.

//-For example, the combination of matchers and a fluent API can be used to make assertions more descriptive and readable.
// However, JUnit Jupiter’s org.junit.jupiter.api.Assertions class does not provide an assertThat() method like the one found in JUnit 4’s org.junit.Assert class
// which accepts a Hamcrest Matcher. Instead, developers are encouraged to use the built-in support for matchers provided by third-party assertion libraries.

public class AnInfo {}
