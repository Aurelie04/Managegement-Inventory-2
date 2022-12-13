package com.example.stockmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView about_menu = findViewById(R.id.about_menu);
        TextView purchase_entry_title = findViewById(R.id.purchase_entry_title);
        TextView item_name = findViewById(R.id.item_name);
        EditText enterItem = findViewById(R.id.enterItem);
        TextView category = findViewById(R.id.category);
        EditText enterCategory = findViewById(R.id.enterCategory);
        ImageView dropdown_menu1 = findViewById(R.id.dropdown_menu1);
        ImageView add_category = findViewById(R.id.add_category);
        TextView price_bought = findViewById(R.id.price_bought);
        EditText priceBought = findViewById(R.id.priceBought);
        TextView quantity = findViewById(R.id.quantity);
        EditText enterQuantity = findViewById(R.id.enterQuantity);
        ImageView dropdown_menu2 = findViewById(R.id.dropdown_menu2);
        TextView priceSold = findViewById(R.id.priceSold);
        EditText selling_Price = findViewById(R.id.selling_Price);
        TextView dateEntry = findViewById(R.id.dateEntry);
        EditText enterDate = findViewById(R.id.enterDate);
        ImageView dropdown_menu3 = findViewById(R.id.dropdown_menu3);
        TextView barCode = findViewById(R.id.barCode);
        EditText scanBarCode = findViewById(R.id.scanBarCode);




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