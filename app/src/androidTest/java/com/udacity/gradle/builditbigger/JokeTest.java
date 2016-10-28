package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Created by daman on 28/10/16.
 */

@RunWith(AndroidJUnit4.class)
public class JokeTest extends ApplicationTestCase<Application> implements OnJokeReceivedListener {

    CountDownLatch signal;
    String joke;

    public JokeTest() {
        super(Application.class);
    }

    @Test
    public void testJoke() {
        try {
            signal = new CountDownLatch(1);
            new EndpointsAsyncTask().execute(this);
            signal.await(10, TimeUnit.SECONDS);
            assertNotNull("joke is null", joke);
            assertFalse("joke is empty", joke.isEmpty());
        } catch (Exception ex) {
            fail();
        }
    }

    @Override
    public void onReceived(String joke) {
        this.joke = joke;
        signal.countDown();
    }
}
