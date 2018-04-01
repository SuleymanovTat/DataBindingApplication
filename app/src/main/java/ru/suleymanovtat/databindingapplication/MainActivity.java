package ru.suleymanovtat.databindingapplication;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import ru.suleymanovtat.databindingapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setUser(new User("ILMIR", "https://i.pinimg.com/originals/8a/f7/b9/8af7b98580255f5005b8891ba3acd696.png"));
    }

    @BindingAdapter("app:imageUrl")
    public static void imageUrl(ImageView imImage, String linkImage) {
        Picasso.get().load(linkImage).into(imImage);
    }

    public void onClickChangeImage(View view) {
        activityMainBinding.getUser().image.set("https://dugrp0jfcvjuv.cloudfront.net/wp-content/uploads/2013/04/b2b-lead-scoring-profile.jpg");
    }
}
