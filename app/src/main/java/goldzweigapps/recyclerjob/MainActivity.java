package goldzweigapps.recyclerjob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import goldzweigapps.RecyclerViewUsage.models.SectionDataModel;
import goldzweigapps.RecyclerViewUsage.models.SingleItemModel;
import goldzweigapps.RecyclerViewUsage.models.Usage;
import goldzweigapps.RecyclerViewUsage.models.UsageItem;

public class MainActivity extends AppCompatActivity {
    ArrayList<SingleItemModel> models = new ArrayList<>();
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);



            for (int i = 0; i <= 50; i++){
                models.add(new SingleItemModel("item " + String.valueOf(i),"http://icons.iconarchive.com/icons/tinylab/android-lollipop-apps/128/Amazon-icon.png"));
            }
            new Usage(this,recyclerView,
                new UsageItem("section 1",models),
                new UsageItem("section 2",models),
                new UsageItem("section 3",models),
                new UsageItem("section 4",models),
                new UsageItem("section 5",models));
    }
}
