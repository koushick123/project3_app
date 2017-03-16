package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.paid.sync.EndpointAsyncTask;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class PaidAsyncTaskTest extends AndroidTestCase {

    @Test
    public void testJoke()
    {
        String joke = null;
        try {
            joke = new EndpointAsyncTask().execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertEquals("What do you call the security outside of a Samsung Store? Guardians of the Galaxy.",joke);
    }
}