package com.sync.g2.poems;

/**
 * Created by G2 on 15-Jun-17.
 */

public class DataProvider {

    public DataProvider(int img_res, String f_name) {
        this.setImg_res(img_res);
        this.setF_name(f_name);

    }

    private int img_res;
    private String f_name;

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }
}

