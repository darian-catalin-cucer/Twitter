package com.example.ac_twitterclone;

import static org.junit.Assert.assertEquals;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.ac_twitterclone", appContext.getPackageName());
    }
}
