package com.github.ayskin.bootcamp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Intent;

import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GreetingActivityTest {

    @Test
    public void displaysGreetingMessageOnReceivingIntent() {
        Intent intent = new Intent(ApplicationProvider.getApplicationContext(), GreetingActivity.class);
        intent.putExtra("nameToGreet", "Louis");
        ActivityScenario<GreetingActivity> activityScenario = ActivityScenario.launch(intent);
        onView(withId(R.id.greetingMessage)).check(matches(ViewMatchers.withText("Hello Louis!")));
        activityScenario.close();
    }
}
