package com.nagareddy.listview;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final int[] imgid;

    public CustomListAdapter(Activity context, String[] itemname, int[] imgid) {
        super(context, R.layout.activity_main, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }



    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.row_view, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.ssidname);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.profileicon);


        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);

        return rowView;

    };
}
/**
 * Created by keerthichandra on 2/27/2016.
 */




