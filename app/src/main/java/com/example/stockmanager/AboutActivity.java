package com.example.stockmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ImageView about_menu = findViewById(R.id.about_menu);
    }
    private void showMenu(View view){
        PopupMenu popupMenu = new PopupMenu(AboutActivity.this,view);
        popupMenu.getMenuInflater().inflate(R.menu.menu_2,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.logout_item) {
                    Intent intent = new Intent(AboutActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId() == R.id.home_item) {
                    Intent intent = new Intent(AboutActivity.this, RegisterActivity.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(AboutActivity.this, DashboardActivity.class);
                    startActivity(intent);
                }


                return false;
            }
        });

    }
}