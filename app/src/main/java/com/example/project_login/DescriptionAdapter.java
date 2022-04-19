package com.example.project_login;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DescriptionAdapter extends RecyclerView.Adapter<DescriptionAdapter.VersionVH> {

    List<Description> DescriptionsList;

    public DescriptionAdapter(List<Description> descriptionsList) {
        DescriptionsList = descriptionsList;
    }

    @NonNull
    @Override
    public VersionVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return null;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new VersionVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VersionVH holder, int position) {

        Description description = DescriptionsList.get(position);
        holder.codeNameTxt.setText(description.getCodeName());
        holder.desctiptionTxt.setText(description.getDescription());

        boolean isExpandable = DescriptionsList.get(position).isExpandable();
        holder.expandableLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return DescriptionsList.size();
    }

    public class VersionVH extends RecyclerView.ViewHolder{

        TextView codeNameTxt, desctiptionTxt;
        LinearLayout linearLayout;
        RelativeLayout expandableLayout;

        public VersionVH(@NonNull View itemView) {
            super(itemView);

            codeNameTxt = itemView.findViewById(R.id.code_name);
            desctiptionTxt = itemView.findViewById(R.id.description);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            expandableLayout = itemView.findViewById(R.id.expandable_layout);

            linearLayout.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Description description = DescriptionsList.get(getAdapterPosition());
                    description.setExpandable(!description.isExpandable());
                    notifyItemChanged(getAdapterPosition());
                }

            });
        }
    }
}
