package com.mauriciotogneri.greencoffeeexample.test;

import com.mauriciotogneri.greencoffeeexample.test.features.ContactListFeatureTest;
import com.mauriciotogneri.greencoffeeexample.test.features.DetailsFeatureTest;
import com.mauriciotogneri.greencoffeeexample.test.features.LoginFeatureTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import java.util.Locale;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginFeatureTest.class,
        ContactListFeatureTest.class,
        DetailsFeatureTest.class
})
public class TestSuite
{
    public static final Locale ENGLISH = new Locale("en", "GB");
    public static final Locale SPANISH = new Locale("es", "ES");
}