package com.mauriciotogneri.greencoffeeexample.test.steps;

import com.mauriciotogneri.greencoffee.GreenCoffeeSteps;
import com.mauriciotogneri.greencoffee.annotations.Then;

public class ScreenshotSteps extends GreenCoffeeSteps
{
    @Then("^I take a screenshot named '(\\w+)'$")
    public void iSeeAnEmptyLoginForm(String name)
    {
        takeScreenshot(String.format("greencoffeeexample/%s/%s", locale(), name));
    }
}