package com.example.androidstudio2dgamedevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * MainActivity is entry point of our application
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set wndow to fullscreen (this will hide the status bar
        Window window = getWindow();
        window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        // Set content view to the game, so that objects in the game class can be rendered to screen
        setContentView(new Game(this));
    }
}