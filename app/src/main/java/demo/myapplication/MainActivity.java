package demo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import demo.myapplication.item.Body;
import demo.myapplication.item.Foot;
import demo.myapplication.item.Head;
import demo.myapplication.item.Insert;
import demo.myapplication.itemtype.ItemType;

public class MainActivity extends AppCompatActivity {
    private List<ItemType> list=new ArrayList<>();
    private RecyclerView mRecycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化布局
        initView();
        //初始化数据
        initData();
        //设置布局管理器
        mRecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        //适配器
        mRecycle.setAdapter(new Myadapter(list,this));
    }

    private void initData() {
        list.add(new Head());
        for (int i = 0;i<100;i++){
                if(i%3==0){
                    list.add(new Insert());
                }
            list.add(new Body());
        }
        list.add(new Foot());
    }

    private void initView() {
        mRecycle = (RecyclerView)findViewById(R.id.recyclerView);
    }
}
