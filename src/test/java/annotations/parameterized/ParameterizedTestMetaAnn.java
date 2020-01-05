package annotations.parameterized;

//-@ParameterizedTest (and all the sources) can be used as meta-annotations to create custom extensions and annotations.
public class ParameterizedTestMetaAnn {

	@MyParams
	void testMetaAnnotation(String s) { }
	
}
