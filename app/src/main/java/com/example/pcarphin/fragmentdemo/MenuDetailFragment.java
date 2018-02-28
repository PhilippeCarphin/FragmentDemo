package com.example.pcarphin.fragmentdemo;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuDetailFragment extends Fragment {

    private long menuID = 1;

    public void setMenuID(long menuID) {
        this.menuID = menuID;
    }

    public MenuDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (savedInstanceState != null){
            menuID = savedInstanceState.getLong("menuID");
        }
        return inflater.inflate(R.layout.fragment_menu_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if(view != null){
            TextView title = (TextView) view.findViewById(R.id.name);
            TextView description = (TextView) view.findViewById(R.id.description);

            MenuItem currentItem = MainActivity.menu[(int) menuID];

            title.setText(currentItem.getName());
            description.setText(currentItem.getDescription());
        }
    }
}
