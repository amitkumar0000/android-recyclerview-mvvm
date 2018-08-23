package com.android.recyclerview.mvvm.model;

public class UserContent {

    private String name;
    private String desc;
    private String time;
    private int imageSrc;

    public UserContent(Builder builder) {
        this.name = builder.name;
        this.desc = builder.desc;
        this.time = builder.time;
        this.imageSrc = builder.imageSrc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String getTime() {
        return time;
    }

    public int getImageSrc() {
        return imageSrc;
    }

    public static class Builder{
        private String name;
        private String desc;
        private String time;
        private int imageSrc;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setTime(String time) {
            this.time = time;
            return this;
        }

        public Builder setImageSrc(int imageSrc) {
            this.imageSrc = imageSrc;
            return this;
        }

        public UserContent build(){
            return new UserContent(this);
        }
    }
}