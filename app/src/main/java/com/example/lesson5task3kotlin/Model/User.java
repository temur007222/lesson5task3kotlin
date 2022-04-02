package com.example.lesson5task3kotlin.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    String name;
    String pword;

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            String name = source.readString();
            String pword = source.readString();
            return new User(name, pword);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public User(String name, String pword) {
        this.name = name;
        this.pword = pword;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(pword);
    }
}