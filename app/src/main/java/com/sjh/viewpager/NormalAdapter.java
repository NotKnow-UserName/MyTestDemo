package com.sjh.viewpager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.jude.rollviewpager.adapter.StaticPagerAdapter;

import java.util.List;

/**
 * Created by sjh on 2017/9/25.
 */

public class NormalAdapter extends StaticPagerAdapter {

    private List<View> list;
    private Context mContext;

    public NormalAdapter(List<View> list, Context mContext) {
        this.mContext = mContext;
        this.list = list;
    }


    @Override
    public View getView(final ViewGroup container, final int position) {
        RecyclerView recyclerView = new RecyclerView(mContext);

        return container;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
