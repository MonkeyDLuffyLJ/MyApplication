package demo.myapplication;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import demo.myapplication.item.Body;
import demo.myapplication.item.Foot;
import demo.myapplication.item.Head;
import demo.myapplication.item.Insert;
import demo.myapplication.itemtype.ItemType;
/**
 * Created by Administrator on 2017/7/7 0007.
 */
public class Myadapter extends RecyclerView.Adapter{

    private static final int HEAD = 0;
    private static final int BODY = 1;
    private static final int FOOT = 2;
    private static final int INSERT = 3;
    private List<ItemType> list;
    private Context mContext;

    public Myadapter(List<ItemType> list, Context context) {
        this.list = list;
        mContext= context;
    }

    @Override
    public int getItemViewType(int position) {
        if(list.get(position)instanceof Head){
            return HEAD;
        }
        if(list.get(position)instanceof Body){
            return BODY;
        }
        if(list.get(position)instanceof Foot){
            return FOOT;
        }
        if(list.get(position)instanceof Insert){
            return INSERT;
        }
        return BODY;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType){
            case HEAD:
                ImageView imageView = new ImageView(mContext);
                imageView.setImageResource(R.mipmap.ic_launcher);
                view=imageView;
                break;
            case BODY:
                TextView textView = new TextView(mContext);
                textView.setText("我是body");
                view=textView;
                break;
            case INSERT:
                ImageView imageView1 = new ImageView(mContext);
                imageView1.setImageResource(R.mipmap.ic_launcher_round);
                view=imageView1;
                break;
            case FOOT:
                ImageView imageView2 = new ImageView(mContext);
                imageView2.setImageResource(R.mipmap.ic_launcher);
                view=imageView2;
                break;
        }
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
