package com.example.pcarphin.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final MenuItem[] menu = {
            new MenuItem(
                    "Breakfast",
                    "2 eggs bacon\nserved with potatoes\ntoast\nand coffee"
            ),
            new MenuItem(
                    "Breakfast",
                    "2 eggs bacon\nserved with potatoes\ntoast\nand coffee"
            ),
            new MenuItem(
                    "Breakfast",
                    "2 eggs bacon\nserved with potatoes\ntoast\nand coffee"
            )
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
