package ru.suleymanovtat.databindingapplication;

import android.databinding.ObservableField;

public class User {
    private String name;
    public ObservableField<String> image;

    public User(String name, String image) {
        this.name = name;
        this.image = new ObservableField<>(image);
    }

    public String getName() {
        return name;
    }
}
