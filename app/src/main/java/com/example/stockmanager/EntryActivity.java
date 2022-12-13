package com.example.stockmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);
        TextView purchase_entry_title = findViewById(R.id.purchase_entry_title);
        TextView item_name = findViewById(R.id.item_name);
        EditText enterItem = findViewById(R.id.enterItem);
        TextView category = findViewById(R.id.category);
        EditText enterCategory = findViewById(R.id.enterCategory);
        EditText priceBought = findViewById(R.id.priceBought);
        TextView price_bought= findViewById(R.id.price_bought);
        TextView quantity = findViewById(R.id.quantity);
        EditText enterQuantity = findViewById(R.id.enterQuantity);
        TextView priceSold = findViewById(R.id.priceSold);
        EditText selling_Price = findViewById(R.id.selling_Price);
        TextView dateEntry = findViewById(R.id.dateEntry);
        EditText enterDate = findViewById(R.id.enterDate);
        TextView barCode = findViewById(R.id.barCode);
        EditText scanBarCode = findViewById(R.id.scanBarCode);
        Button add_button = findViewById(R.id.add_button);
        ImageView dropdown_menu1 = findViewById(R.id.dropdown_menu1);
        ImageView add_category = findViewById(R.id.add_category);
        ImageView dropdown_menu2 = findViewById(R.id.dropdown_menu2);
        ImageView dropdown_menu3 = findViewById(R.id.dropdown_menu3);
        ImageView camera = findViewById(R.id.camera);
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