package goldzweigapps.RecyclerViewUsage.models;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import goldzweigapps.RecyclerViewUsage.adapters.RecyclerViewDataAdapter;
import goldzweigapps.RecyclerViewUsage.models.SectionDataModel;
import goldzweigapps.RecyclerViewUsage.models.SingleItemModel;
import goldzweigapps.RecyclerViewUsage.models.UsageItem;

/**
 * Created by gilgoldzweig on 15/11/2016.
 */

public class Usage {
    public Usage(Context context, RecyclerView rv, UsageItem... items){

        ArrayList<SectionDataModel> SectionArray = new ArrayList<>();
        for (UsageItem item : items){
            SectionArray.add(new SectionDataModel(item.getSectionTitle(),item.getSingleItemArray()));
        }
        rv.setHasFixedSize(true);
        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(context, SectionArray);
        rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        rv.setAdapter(adapter);
    }

    public static ArrayList<SectionDataModel> createList(UsageItem... items){
        ArrayList<SectionDataModel> SectionArray = new ArrayList<>();
        for (UsageItem item : items){
            SectionArray.add(new SectionDataModel(item.getSectionTitle(),item.getSingleItemArray()));
        }
    return SectionArray;
    }
}
