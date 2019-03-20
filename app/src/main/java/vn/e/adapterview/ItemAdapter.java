package vn.e.adapterview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {


    private List<Student> students;

    private Context context;


    // ham khoi tao ???
    public ItemAdapter(List<Student> students, Context context) {
        this.students = students;
        this.context = context;
    }

    // khai bao file xml giao dien cho item tren Recycle View
    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        return new ItemHolder(view);
    }


    // dua du lieu hien thi cho cac thanh phan nam tren item
    @Override
    public void onBindViewHolder(@NonNull ItemHolder itemHolder, int i) {


        // bien i la de chi vi tri cua item tren recycler View.
        // va  i = vi tri cua du lieu tren Array students

        itemHolder.tvName.setText(students.get(i).name);
        itemHolder.tvYearOld.setText(students.get(i).yearOld);

    }

    // so luong item tren recycle view
    @Override
    public int getItemCount() {
        return students.size();
    }
}
