package com.example.meet.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class employee_custom_adapter extends BaseAdapter {

    Context mContext;
    ArrayList<employee> mArrayList;
    LayoutInflater mLayoutInflater;


    public employee_custom_adapter(Context mContext, ArrayList<employee> mArrayList) {
        this.mContext = mContext;
        this.mArrayList = mArrayList;
        this.mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        employee_view_holder mItem;

        if(view==null)
        {

            view=mLayoutInflater.inflate(R.layout.employee_viewholder,null);
            mItem=new employee_view_holder((TextView) view.findViewById(R.id.txtemployeeid),
                                            (TextView) view.findViewById(R.id.txtemployeename));
            view.setTag(mItem);
        }
        else
        {
            mItem= (employee_view_holder) view.getTag();
        }
        mItem.tvid.setText(mArrayList.get(i).getId()+"");
        mItem.tvname.setText(mArrayList.get(i).getName()+"");

        return view;
    }
}
