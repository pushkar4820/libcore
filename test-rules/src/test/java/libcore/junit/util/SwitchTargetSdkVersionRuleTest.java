
package libcore.junit.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import dalvik.system.VMRuntime;
import libcore.junit.util.SwitchTargetSdkVersionRule.TargetSdkVersion;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


public class SwitchTargetSdkVersionRuleTest {

  @Rule
  public TestRule switchTargetSdkVersionRule = SwitchTargetSdkVersionRule.getInstance();

  @Test
  @TargetSdkVersion(23)
  public void testRunningAsIfTargetedAtSDKVersion23() {
    assertEquals(23, VMRuntime.getRuntime().getTargetSdkVersion());
  }

  @Test
  public void testRunningAsIfTargetedAtCurrentSDKVersion() {
    assertNotEquals(23, VMRuntime.getRuntime().getTargetSdkVersion());
  }
}
