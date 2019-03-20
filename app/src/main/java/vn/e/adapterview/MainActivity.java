package vn.e.adapterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lvList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.lvList);
        // 1 chuoi sinh vien Rong~
        List<Student> students = new ArrayList<>();

        Student khanh = new Student();
        khanh.id = "1";
        khanh.name = "Duy Khanh";
        khanh.yearOld = "30";


        Student tuanHung = new Student();
        tuanHung.id = "2";
        tuanHung.name = "Tuan Hung";
        tuanHung.yearOld = "31";


        // them sinh vien vao mang?
        students.add(khanh);
        students.add(tuanHung);

        for (int i = 0; i < 100; i++) {
            students.add(khanh);
            students.add(tuanHung);
        }



        ItemAdapter itemAdapter = new ItemAdapter(students,MainActivity.this);

        // quy dinh Recycler View hien thi theo chieu doc
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);


        // dua du lieu adapter vap List
        lvList.setAdapter(itemAdapter);

        // dua doi tuong linearlayoutmanager vua tao vao list
        lvList.setLayoutManager(linearLayoutManager);




    }

}
