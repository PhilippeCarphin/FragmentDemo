package com.example.pcarphin.fragmentdemo;


import android.content.Context;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MenuListFragment extends ListFragment {

    static interface MenuListListener{
        void itemClicked(long id);
    }

    private MenuListListener listener;

    @Override
    public void onAttach(Context ctx){
        // https://stackoverflow.com/questions/32083053/android-fragment-onattach-deprecated
        super.onAttach(ctx);

        this.listener = (MenuListListener) ctx;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        if(listener != null){
            listener.itemClicked(id);
        }
        super.onListItemClick(l, v, position, id);
    }

    public MenuListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        MenuItem[] menu = MainActivity.menu;
        String names[] = new String[menu.length];
        for(int i = 0; i < names.length; ++i){
            names[i] = menu[i].getName();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                names
        );

        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

}
