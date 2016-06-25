package com.example.michel.bayleyecholocation;

import android.view.View;

/**
 * Created by michel on 25/06/16.
 */
public class MainView extends View {
    private MainActivity mainActivity;
    private Model model;

    public MainView(MainActivity mainActivity) {
        super(mainActivity);
        this.mainActivity = mainActivity;
        this.model = mainActivity.getModel();

        //start your stuff here
    }
}
