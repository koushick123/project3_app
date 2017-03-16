package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.paid.sync.EndpointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertEquals;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest{

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