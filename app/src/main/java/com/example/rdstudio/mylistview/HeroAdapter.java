package com.example.rdstudio.mylistview;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class HeroAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Hero> heroes;

    public HeroAdapter(Context context) {
        this.context = context;
    }

    public HeroAdapter(ArrayList<Hero> heroes) {
        this.heroes = heroes;
        heroes = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
