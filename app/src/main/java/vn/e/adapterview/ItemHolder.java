package vn.e.adapterview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

class ItemHolder extends RecyclerView.ViewHolder {


    public TextView tvName;
    public TextView tvYearOld;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tvName);
        tvYearOld = itemView.findViewById(R.id.tvYearOld);

    }


}
