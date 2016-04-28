package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import java.util.concurrent.ExecutionException;


/**
 * Created by Pradeep on 4/28/16.
 */
public class JokeTest extends AndroidTestCase {

    public void testJokeIsRetrieved() {
        String joke = null;
        try {
            joke = new EndpointsAsyncTask().execute().get();
        } catch (InterruptedException | ExecutionException e) {
            fail("Error : " + e.getLocalizedMessage());
        }
        assertNotNull(joke);
        assertTrue(joke.trim().length() > 0);
        String error = "Unable to resolve host";
        assertTrue("Network Error", !joke.contains(error));
    }

}
