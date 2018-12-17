package com.tss.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class User extends BaseObservable {

    private String name;
    private String address;
    private String email;
    private String image;


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.tss.myapplication.BR.name);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

        notifyPropertyChanged(com.tss.myapplication.BR.address);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.tss.myapplication.BR.email);
    }

    @Bindable
    public String getImage() {
        return image;

    }

    @Bindable
    public void setImage(String image) {
        this.image = image;
        notifyPropertyChanged(com.tss.myapplication.BR.image);
    }


    @BindingAdapter({"android:image"})
    public static void loadImage(ImageView imageView, String image) {
        Glide.with(imageView)
                .load(image)
                .into(imageView);
    }
}