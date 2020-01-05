package annotations.temp_dir;

//-@TempDir is an experimental feature as 5.5.2 version

//-The built-in TempDirectory extension is used to create and clean up a temporary directory for an individual test or all tests in a test class.
//-It is registered by default. To use it, annotate a non-private field of type java.nio.file.Path or java.io.File
// with @TempDir or add a parameter of type java.nio.file.Path or java.io.File annotated with @TempDir to a lifecycle method or test method.

//-@TempDir is not supported on constructor parameters.
// If you wish to retain a single reference to a temp directory across lifecycle methods and the current test method, please use field injection,
// by annotating a non-private instance field with @TempDir.
public class AnInfo {

}
