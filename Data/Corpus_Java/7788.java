package test.invocationcount;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.List;

import test.InvokedMethodNameListener;
import test.SimpleBaseTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test various combination of @BeforeMethod(firstTimeOnly = true/false) and
 * @AfterMethod(lastTimeOnly = true/false) with invocation counts and data
 * providers.
 */
public class FirstAndLastTimeTest extends SimpleBaseTest {

  @Test
  public void verifyDataProviderFalseFalse() {
    List<String> invokedMethodNames = run(DataProviderFalseFalseTest.class);

    assertThat(invokedMethodNames).containsExactly(
            "beforeMethod", "f(0)", "afterMethod",
            "beforeMethod", "f(1)", "afterMethod",
            "beforeMethod", "f(2)", "afterMethod",
            "beforeMethod", "f2(0)", "afterMethod",
            "beforeMethod", "f2(1)", "afterMethod",
            "beforeMethod", "f2(2)", "afterMethod"
    );
  }

  @Test
  public void verifyDataProviderTrueFalse() {
    List<String> invokedMethodNames = run(DataProviderTrueFalseTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f(0)", "afterMethod",
        "f(1)", "afterMethod",
        "f(2)", "afterMethod",
        "beforeMethod", "f2(0)", "afterMethod",
        "f2(1)", "afterMethod",
        "f2(2)", "afterMethod"
    );
  }

  @Test
  public void verifyDataProviderFalseTrue() {
    List<String> invokedMethodNames = run(DataProviderFalseTrueTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f(0)",
        "beforeMethod", "f(1)",
        "beforeMethod", "f(2)", "afterMethod",
        "beforeMethod", "f2(0)",
        "beforeMethod", "f2(1)",
        "beforeMethod", "f2(2)", "afterMethod"
    );
  }

  @Test
  public void verifyDataProviderTrueTrue() {
    List<String> invokedMethodNames = run(DataProviderTrueTrueTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f(0)",
        "f(1)",
        "f(2)", "afterMethod",
        "beforeMethod", "f2(0)",
        "f2(1)",
        "f2(2)", "afterMethod"
    );
  }

  @Test
  public void verifyInvocationCountFalseFalse() {
    List<String> invokedMethodNames = run(InvocationCountFalseFalseTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f", "afterMethod",
        "beforeMethod", "f", "afterMethod",
        "beforeMethod", "f", "afterMethod"
    );
  }

  @Test
  public void verifyInvocationCountTrueFalse() {
    List<String> invokedMethodNames = run(InvocationCountTrueFalseTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f", "afterMethod",
        "f", "afterMethod",
        "f", "afterMethod"
    );
  }

  @Test
  public void verifyInvocationCountFalseTrue() {
    List<String> invokedMethodNames = run(InvocationCountFalseTrueTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f",
        "beforeMethod", "f",
        "beforeMethod", "f", "afterMethod"
    );
  }

  @Test
  public void verifyInvocationCountTrueTrue() {
    List<String> invokedMethodNames = run(InvocationCountTrueTrueTest.class);

    assertThat(invokedMethodNames).containsExactly(
        "beforeMethod", "f",
        "f",
        "f", "afterMethod"
    );
  }

  private static List<String> run(Class<?> cls) {
    TestNG tng = create(cls);
    InvokedMethodNameListener listener = new InvokedMethodNameListener();
    tng.addListener((ITestNGListener) listener);

    tng.run();

    return listener.getInvokedMethodNames();
  }
}
