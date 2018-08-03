package com.trifecta.team.qrich;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;

public class CuisineActivity extends AppCompatActivity {
ImageButton imgBtnChine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuisine);
        final CardView cardView = (CardView)findViewById(R.id.crdC1);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CuisineActivity.this,RestaurantActivity.class);
                startActivity(intent);

            }
        });
    }
}
