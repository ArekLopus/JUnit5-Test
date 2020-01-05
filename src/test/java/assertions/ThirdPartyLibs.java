package assertions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

//-Even though the assertion facilities provided by JUnit Jupiter are sufficient for many testing scenarios, there are times when more power and additional
// functionality such as matchers are desired or required. In such cases, the JUnit team recommends the use of third-party assertion libraries
// such as AssertJ, Hamcrest, Truth, etc. Developers are therefore free to use the assertion library of their choice.

//-For example, the combination of matchers and a fluent API can be used to make assertions more descriptive and readable.
// However, JUnit Jupiter’s org.junit.jupiter.api.Assertions class does not provide an assertThat() like the one found in JUnit 4’s org.junit.Assert class
// which accepts a Hamcrest Matcher. Instead, developers are encouraged to use the built-in support for matchers provided by third-party assertion libs.
public class ThirdPartyLibs {

	@Test
    void assertWithHamcrestMatcher() {
        assertThat(2 + 1, is(equalTo(3)));
    }
	
}
