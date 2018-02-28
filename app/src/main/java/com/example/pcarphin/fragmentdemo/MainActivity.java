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
                    "Lunch",
                    "Club sandwich\nserved with fries\ncoleslaw\nand pepsi"
            ),
            new MenuItem(
                    "Dinner",
                    "Filet mignon\nserved with mashed potatoes\nand red wine"
            )
    };

    public void itemClicked(long id){
        menuDetailFragment = new MenuDetailFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        menuDetailFragment.setMenuID(id);
        ft.replace(R.id.fragment_container, menuDetailFragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }

    private MenuDetailFragment menuDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
