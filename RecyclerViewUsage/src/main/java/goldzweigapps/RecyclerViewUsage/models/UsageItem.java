package goldzweigapps.RecyclerViewUsage.models;

import java.util.ArrayList;

/**
 * Created by gilgoldzweig on 15/11/2016.
 */

public class UsageItem {

    String sectionTitle;
    ArrayList<SingleItemModel> SingleItemArray;

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public ArrayList<SingleItemModel> getSingleItemArray() {
        return SingleItemArray;
    }

    public void setSingleItemArray(ArrayList<SingleItemModel> singleItemArray) {
        SingleItemArray = singleItemArray;
    }

    public UsageItem(String sectionTitle, ArrayList<SingleItemModel> singleItemArray) {

        this.sectionTitle = sectionTitle;
        SingleItemArray = singleItemArray;
    }
}
