package com.example.thomas.getitdone;

/**
 * Created by All on 10/23/2017.
 */
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    List<RowItem> rowItems;

    CustomAdapter(Context context, List<RowItem> rowItems) {
        this.context = context;
        this.rowItems = rowItems;
    }

    @Override
    public int getCount() {
        return rowItems.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return rowItems.indexOf(getItem(position));
    }

    /* private view holder class */
    private class ViewHolder {
        ImageView trans_icon;
        TextView transaction;
        TextView trans_description;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        LayoutInflater mInflater = (LayoutInflater) context
                .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.activity_listview, null);
            holder = new ViewHolder();

            holder.transaction = (TextView) convertView
                    .findViewById(R.id.transaction);
            holder.trans_icon = (ImageView) convertView
                    .findViewById(R.id.transaction_icon);
            holder.trans_description = (TextView) convertView.findViewById(R.id.transaction_description);

            RowItem row_pos = rowItems.get(position);

            holder.trans_icon.setImageResource(row_pos.getTrans_icon_id());
            holder.transaction.setText(row_pos.getTransaction());
            holder.trans_description.setText(row_pos.getTrans_description());

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        return convertView;
    }

}
