package com.jaytala.pixeleffect;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageview, imageview3, imageview2, dot;

    public static Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageview2 = findViewById(R.id.imageView2);
        imageview3 = findViewById(R.id.imageView3);
        imageview = findViewById(R.id.imageView);
        dot = findViewById(R.id.dot);

        imageview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        imageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, 1002);
            }
        });

        imageview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                PopupMenu menu = new PopupMenu(MainActivity2.this, dot);
                menu.getMenuInflater().inflate(R.menu.optionmenu, menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()) {

                            case R.id.Rate:
                                Toast.makeText(MainActivity2.this, "Rate", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.Share:
                                Toast.makeText(MainActivity2.this, "Share", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.More:
                                Toast.makeText(MainActivity2.this, "More", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.Policy:
                                Toast.makeText(MainActivity2.this, "Policy", Toast.LENGTH_SHORT).show();
                                break;


                        }
                        return false;
                    }
                });

                menu.show();

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {

            if (requestCode == 1002) {
                 uri = data.getData();
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);
            }
        }
    }
}