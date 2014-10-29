package com.example.specs;

import android.test.suitebuilder.annotation.LargeTest;

import com.example.R;
import com.example.test.support.EspressoSpec;

import br.com.izie.app.activity.main.MainActivity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;

/**
 * Created by marcelomarra on 29/10/14.
 */
@LargeTest
public class MainActivitySpec extends EspressoSpec<MainActivity> {

    public MainActivitySpec() {
        super(MainActivity.class);
    }

    public void testShouldNotResume(){
        onView(withId(R.id.main_menu_bt_load_more)).check(matches(withId(br.com.izie.app.aar.R.string.main_load_more)));
    }
}
