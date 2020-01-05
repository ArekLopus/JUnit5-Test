package annotations.tag;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

// Needs dependencies:
// junit-platform-suite-api
// junit-platform-runner

// You CAN NOT include both @IncludeTags and @ExcludeTags annotations in single test plan.

@RunWith(JUnitPlatform.class)
@SelectPackages("annotations.tag")
//@IncludeTags({"Group1","Group2"})
@ExcludeTags({"Group1","Group2"})
@SuppressWarnings("unused")
public class TagTestPlan {}
