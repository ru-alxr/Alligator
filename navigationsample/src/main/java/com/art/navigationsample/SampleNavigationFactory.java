package com.art.navigationsample;

import com.art.alligator.implementation.RegistryNavigationFactory;
import com.art.navigationsample.screens.*;
import com.art.navigationsample.ui.*;

/**
 * Date: 11.02.2017
 * Time: 12:15
 *
 * @author Artur Artikov
 */
public class SampleNavigationFactory extends RegistryNavigationFactory {
	public SampleNavigationFactory() {
		registerActivity(TestScreen.class, TestActivity.class);
		registerFragment(TestSmallScreen.class, TestFragment.class);
	}
}