package com.mauriciotogneri.greencoffeeexample.test.features;

import android.support.test.rule.ActivityTestRule;

import com.mauriciotogneri.greencoffee.GreenCoffeeConfig;
import com.mauriciotogneri.greencoffee.GreenCoffeeTest;
import com.mauriciotogneri.greencoffee.Scenario;
import com.mauriciotogneri.greencoffee.ScenarioConfig;
import com.mauriciotogneri.greencoffeeexample.activities.LoginActivity;
import com.mauriciotogneri.greencoffeeexample.test.steps.ContactListSteps;
import com.mauriciotogneri.greencoffeeexample.test.steps.LoginSteps;
import com.mauriciotogneri.greencoffeeexample.test.steps.ScreenshotSteps;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;
import java.util.Locale;

import static com.mauriciotogneri.greencoffeeexample.test.TestSuite.ENGLISH;
import static com.mauriciotogneri.greencoffeeexample.test.TestSuite.SPANISH;

// TODO: auto-generate the steps from gherkin
@RunWith(Parameterized.class)
public class LoginFeatureTest extends GreenCoffeeTest
{
    @Rule
    public ActivityTestRule<LoginActivity> activity = new ActivityTestRule<>(LoginActivity.class);

    public LoginFeatureTest(ScenarioConfig scenarioConfig)
    {
        super(scenarioConfig);
    }

    @Parameters
    public static Iterable<ScenarioConfig> scenarios() throws IOException
    {
        return new GreenCoffeeConfig("testapp")
                .withFeatureFromAssets("assets/login.feature")
                .scenarios(ENGLISH, SPANISH);
    }

    @Test
    public void test()
    {
        start(new LoginSteps(), new ContactListSteps(), new ScreenshotSteps());
    }

    @Override
    protected void beforeScenarioStarts(Scenario scenario, Locale locale)
    {
        // do something
    }
}