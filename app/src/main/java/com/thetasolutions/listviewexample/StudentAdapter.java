package com.thetasolutions.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StudentAdapter extends BaseAdapter {

    LayoutInflater inflater;
    Context activityContext;
    String[] studentsNames;

    public StudentAdapter(Context activityContext, String[] studentsNames) {
        //inflater=(LayoutInflater) activityContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = (LayoutInflater.from(activityContext));
        this.activityContext = activityContext;
        this.studentsNames = studentsNames;
    }

    @Override
    public int getCount() {
        return studentsNames.length;
    }

    @Override
    public Object getItem(int i) {
        return studentsNames[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view=inflater.inflate(R.layout.item_list_view,null);

        TextView txtName=view.findViewById(R.id.txt_item_name);
        ImageView imgStudent = view.findViewById(R.id.img_item_thumbnail);

        txtName.setText(studentsNames[i]);
        imgStudent.setImageResource(R.drawable.img_profile);

        return view;
    }
}
