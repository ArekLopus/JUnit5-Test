package annotations.nested;

//-@Nested tests give the test writer more capabilities to express the relationship among several groups of tests.
//-Only non-static nested classes (i.e. inner classes) can serve as @Nested test classes.
//-Nesting can be arbitrarily deep, and those inner classes are considered to be full members of the test class family with one exception:
// @BeforeAll and @AfterAll methods do not work by default. The reason is that Java does not allow static members in inner classes.
// However, this restriction can be circumvented by annotating a @Nested test class with @TestInstance(Lifecycle.PER_CLASS).

//-@Nested annotation can be used to mark a nested class to be included in the test cases.
//-By default nested classes are not scanned for test methods.
// We have to explicitly mark them to be scanned for test cases using @Nested annotation.
//-It helps to create hierarchical contexts to structure the related unit tests together. Helps to keep the tests clean and readable.
public class AnInfo {}
