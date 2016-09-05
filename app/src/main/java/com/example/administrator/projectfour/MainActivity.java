package com.example.administrator.projectfour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private final static String studentname="name";
    private final static String Sex="sex";
    private final static String Class="class";
    private final static String NUMBER="number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] Stuname={"小明","小青","小李"};
        String[] sex={"性别：男","性别：女","性别：男"};
        String[] cla={"软工1401    学号：2014011123","软工1402    学号：2014011456","软工1403    学号：2014011789"};
        String[] Numble={"电话号码：18810104172","电话号码：18810104171","电话号码：18810104170"};

        List<Map<String,Object>> items=new ArrayList<>
                ();//Map<String,Object>>
        for (int i=0;i<Stuname.length;i++){
            Map<String,Object>item=new HashMap<>
                    ();//String,Object
            item.put(studentname,Stuname[i]);
            item.put(Class,cla[i]);
            item.put(Sex,sex[i]);
            item.put(NUMBER,Numble[i]);
            items.add(item);
        }
        SimpleAdapter adapter=new SimpleAdapter
                (this,items,R.layout.item,new String[]
                        {studentname,Sex,Class,NUMBER},new int[]
                        {R.id.student1,R.id.student2,R.id.student3,R.id.student4}
                );
        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        }
    }