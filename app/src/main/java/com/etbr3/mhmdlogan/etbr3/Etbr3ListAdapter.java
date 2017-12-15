package com.etbr3.mhmdlogan.etbr3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MhmdLoGaN on 14/12/2017.
 */

public class Etbr3ListAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<Etbr3> etbr3List;

    public Etbr3ListAdapter(Context context, int layout, ArrayList<Etbr3> etbr3List) {
        this.context = context;
        this.layout = layout;
        this.etbr3List = etbr3List;
    }

    @Override
    public int getCount() {
        return etbr3List.size();
    }

    @Override
    public Object getItem(int position) {
        return etbr3List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        ImageView imageView;
        TextView txtName, txtPrice;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View row = view;
        ViewHolder holder = new ViewHolder();

        if(row == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(layout, null);
            holder.txtName = (TextView) row.findViewById(R.id.txtName);
            holder.txtPrice = (TextView) row.findViewById(R.id.txtNumber);
            holder.imageView = (ImageView) row.findViewById(R.id.imgChiri);
            row.setTag(holder);
        }
        else {
            holder = (ViewHolder) row.getTag();
        }

        Etbr3 etbr3 = etbr3List.get(position);

        holder.txtName.setText(etbr3.getName());
        holder.txtPrice.setText(etbr3.getNumber());

        byte[] foodImage = etbr3.getImage();
        Bitmap bitmap = BitmapFactory.decodeByteArray(foodImage, 0, foodImage.length);
        holder.imageView.setImageBitmap(bitmap);

        return row;
    }
}
