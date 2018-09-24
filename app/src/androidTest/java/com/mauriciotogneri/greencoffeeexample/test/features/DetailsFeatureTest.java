package com.mauriciotogneri.greencoffeeexample.test.features;

import androidx.test.rule.ActivityTestRule;

import com.mauriciotogneri.greencoffee.GreenCoffeeConfig;
import com.mauriciotogneri.greencoffee.GreenCoffeeTest;
import com.mauriciotogneri.greencoffee.ScenarioConfig;
import com.mauriciotogneri.greencoffeeexample.activities.LoginActivity;
import com.mauriciotogneri.greencoffeeexample.test.steps.ContactListSteps;
import com.mauriciotogneri.greencoffeeexample.test.steps.DetailsSteps;
import com.mauriciotogneri.greencoffeeexample.test.steps.LoginSteps;
import com.mauriciotogneri.greencoffeeexample.test.steps.ScreenshotSteps;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.io.IOException;

import static com.mauriciotogneri.greencoffeeexample.test.TestSuite.ENGLISH;
import static com.mauriciotogneri.greencoffeeexample.test.TestSuite.SPANISH;

@RunWith(Parameterized.class)
public class DetailsFeatureTest extends GreenCoffeeTest
{
    @Rule
    public ActivityTestRule<LoginActivity> activity = new ActivityTestRule<>(LoginActivity.class);

    public DetailsFeatureTest(ScenarioConfig scenarioConfig)
    {
        super(scenarioConfig);
    }

    @Parameters(name = "{0}")
    public static Iterable<ScenarioConfig> scenarios() throws IOException
    {
        return new GreenCoffeeConfig()
                .withFeatureFromAssets("assets/details.feature")
                .takeScreenshotOnFail()
                .scenarios(ENGLISH, SPANISH);
    }

    @Test
    public void test()
    {
        start(new LoginSteps(),
              new ContactListSteps(),
              new DetailsSteps(),
              new ScreenshotSteps());
    }
}