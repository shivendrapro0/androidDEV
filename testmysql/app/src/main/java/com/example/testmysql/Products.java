package com.example.testmysql;


public class Products {

    private  int _id ;
    private String _product_name;

    public Products() {

    }
    public Products(String _product_name) {
        this._product_name = _product_name;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_product_name(String _product_name) {
        this._product_name = _product_name;
    }

    public int get_id() {
        return _id;
    }

    public String get_product_name() {
        return _product_name;
    }
}
