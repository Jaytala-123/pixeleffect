
package com.jaytala.pixeleffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity5 extends AppCompatActivity {

    private Object MainActivity4;
    ImageView back, img, d, effect, brush, lenseflare, edit, text , sticker, rotate, flip;
    int r1 = 0, f1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        back = findViewById(R.id.back);
        img = findViewById(R.id.img);
        d = findViewById(R.id.imageView);
        effect = findViewById(R.id.effect);
        brush = findViewById(R.id.brush);
        lenseflare = findViewById(R.id.lenseflare);
        edit = findViewById(R.id.edit);
        text = findViewById(R.id.text);
        sticker = findViewById(R.id.sticker);
        rotate = findViewById(R.id.rotate);
        flip = findViewById(R.id.flip);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        effect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        brush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        lenseflare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (f1 == 0) {
                    img.setRotationY(180);
                    f1 = 1;
                } else if (f1 == 1) {
                    img.setRotationY(0);
                    f1 = 0;
                }
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (r1 == 0) {
                    img.setRotation(90);
                    r1 = 1;
                } else if (r1 == 1) {
                    img.setRotation(180);
                    r1 = 2;
                } else if (r1 == 2) {
                    img.setRotation(270);
                    r1 = 3;
                } else if (r1 == 3) {
                    img.setRotation(360);
                    r1 = 0;
                }
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });

        sticker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });


        Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
        startActivity(intent);

    }
}