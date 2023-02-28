package com.jaytala.pixeleffect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.canhub.cropper.CropImageView;

public class MainActivity4 extends AppCompatActivity {

    ImageView image;
    CropImageView crop;

    public static Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        image = findViewById(R.id.image);
        crop = findViewById(R.id.crop);

        crop.setImageUriAsync(MainActivity2.uri);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bitmap = crop.getCroppedImage();

        Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
        startActivity(intent);

            }
        });
    }
}