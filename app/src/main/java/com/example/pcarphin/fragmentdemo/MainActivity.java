package com.example.pcarphin.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MenuListFragment.MenuListListener {

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

    public void itemClicked(long id){

    }

    private MenuDetailFragment menuDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // see https://stackoverflow.com/questions/27037662/incompatible-types-homefragment-cannot-be-converted-to-fragment-in-android
        // I could have changed this to getSupportFragmentManager() but I did like in the Udemy course
        // and changed the import in the fragment class.
        menuDetailFragment = (MenuDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
    }
}
