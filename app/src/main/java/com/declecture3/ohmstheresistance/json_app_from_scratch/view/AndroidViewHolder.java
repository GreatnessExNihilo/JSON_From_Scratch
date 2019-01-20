package com.declecture3.ohmstheresistance.json_app_from_scratch.view;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.declecture3.ohmstheresistance.json_app_from_scratch.DisplayActivity;
import com.declecture3.ohmstheresistance.json_app_from_scratch.R;
import com.declecture3.ohmstheresistance.json_app_from_scratch.model.MyAndroid;

public class AndroidViewHolder extends RecyclerView.ViewHolder {

    private TextView apiTextView;
    private TextView nameTextView;
    private TextView versionTextView;
    private Intent intent;

    public AndroidViewHolder(View itemView) {
        super(itemView);

        apiTextView = itemView.findViewById(R.id.android_api_textview);
        nameTextView = itemView.findViewById(R.id.android_name_textview);
        versionTextView = itemView.findViewById(R.id.android_version_textview);

    }



    public void onBind(final String api, final String name, final String version) {
        apiTextView.setText("API: " + api);
        nameTextView.setText("Name: " + name);
        versionTextView.setText("Version: " + version);
//itemview on click listener sets the entire item in the view and not just 1 widget (not just name or not just api etc etc)
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(itemView.getContext(), DisplayActivity.class);
                intent.putExtra("api", api);
                intent.putExtra("name", name);
                intent.putExtra("version", version);


                itemView.getContext().startActivity(intent);
            }

        });

    }
}
