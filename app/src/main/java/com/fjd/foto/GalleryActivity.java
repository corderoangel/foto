package com.fjd.foto;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        ImageView galleryImageView = findViewById(R.id.galleryImageView);

        // Obtener la Uri de la imagen de la actividad anterior
        Uri photoUri = getIntent().getParcelableExtra("PHOTO_URI");

        if (photoUri != null) {
            // Configurar la imagen en la ImageView
            galleryImageView.setImageURI(photoUri);
        }
    }
}
