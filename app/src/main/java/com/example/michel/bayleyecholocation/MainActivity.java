package com.example.michel.bayleyecholocation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {
    private Model model;
    private MainView mainView;
    private Controller controller;

    public Controller getController() {
        return controller;
    }

    public Model getModel() {
        return model;
    }

    public MainView getMainView() {
        return mainView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeModelViewControl();
    }

    private void initializeModelViewControl() {
        this.model = new Model();
        this.mainView = new MainView(this);
        this.controller = new Controller();

    }
}