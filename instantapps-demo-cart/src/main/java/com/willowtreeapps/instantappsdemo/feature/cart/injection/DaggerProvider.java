package com.willowtreeapps.instantappsdemo.feature.cart.injection;

import android.content.Context;

public class DaggerProvider {

    private static FeatureComponent featureComponent;

    private DaggerProvider() {
    }

    public static FeatureComponent getFeatureComponent(Context context) {
        if (featureComponent == null) {
            featureComponent = DaggerFeatureComponent.builder().bindContext(context.getApplicationContext()).build();
        }
        return featureComponent;
    }

}
