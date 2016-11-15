package goldzweigapps.RecyclerViewUsage.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import java.util.ArrayList;

import goldzweigapps.RecyclerViewUsage.R;
import goldzweigapps.RecyclerViewUsage.models.SingleItemModel;

public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;

    public SectionListDataAdapter(ArrayList<SingleItemModel> itemsList) {
        this.itemsList = itemsList;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SingleItemRowHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_single_card, null));
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int i) {
        SingleItemModel singleItem = itemsList.get(i);
        holder.title.setText(singleItem.getName());
        Glide.with(holder.itemView.getContext()).load(singleItem.getUrl()).placeholder(R.drawable.android).into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

         TextView title;
         ImageView itemImage;


        public SingleItemRowHolder(View view) {
            super(view);

            this.title = (TextView) view.findViewById(R.id.tvTitle);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Toast.makeText(v.getContext(), title.getText(), Toast.LENGTH_SHORT).show();

                }
            });


        }

    }

}