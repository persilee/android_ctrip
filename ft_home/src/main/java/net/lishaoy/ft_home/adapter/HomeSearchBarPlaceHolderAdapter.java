package net.lishaoy.ft_home.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.youth.banner.adapter.BannerAdapter;

import net.lishaoy.ft_home.R;
import net.lishaoy.ft_home.model.Home;

import java.util.List;

public class HomeSearchBarPlaceHolderAdapter extends BannerAdapter<Home.SearchPlaceHolderListBean, HomeSearchBarPlaceHolderAdapter.MyViewHolder> {


    public HomeSearchBarPlaceHolderAdapter(List<Home.SearchPlaceHolderListBean> datas) {
        super(datas);
    }

    @Override
    public MyViewHolder onCreateHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_search_bar_place_holder_item,parent,false));
    }

    @Override
    public void onBindView(MyViewHolder holder, Home.SearchPlaceHolderListBean data, int position, int size) {
        holder.placeHolder.setText(data.getText());
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView placeHolder;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            placeHolder = itemView.findViewById(R.id.home_search_bar_placeholder_item);
        }
    }
}
