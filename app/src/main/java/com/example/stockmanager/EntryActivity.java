package com.example.stockmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        ImageView menu_bar =findViewById(R.id.entryactivity_menu);
        menu_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showMenu(view);
            }
        });
    }
    private void showMenu(View view){
        PopupMenu popupMenu = new PopupMenu(EntryActivity.this,view);
        popupMenu.getMenuInflater().inflate(R.menu.menu_3,popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.logout_item) {
                    Intent intent = new Intent(EntryActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
                else if(menuItem.getItemId() == R.id.about_item2) {
                    Intent intent = new Intent(EntryActivity.this, RegisterActivity.class);
                    startActivity(intent);
                }
                else{
                    Intent intent = new Intent(EntryActivity.this, AboutActivity.class);
                    startActivity(intent);
                }


                return false;
            }
        });

    }
}