package com.example.rdstudio.mylistview;


import android.content.Context;
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
}
