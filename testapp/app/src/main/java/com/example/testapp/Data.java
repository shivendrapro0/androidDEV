package com.example.testapp;

/**
 * Created by shivendrasharma on 8/27/16.
 */
public class Data {

    private int _id ;
    private String _data_bloodP;
    private int _data_bloodS;
    private Float _data_walking;
    private Float _data_running;
    private Float _data_cycling;
    private Float _data_weight;
    private String _data_dateT;

    public Data() {

    }
    public Data(String _data_bloodP,String _data_bloodS, String _data_cycling, String _data_running, String _data_walking, String _data_weight) {
        this._data_bloodP   =   _data_bloodP;
        this._data_bloodS   =   Integer.parseInt(_data_bloodS);
        this._data_cycling  =   Float.parseFloat(_data_cycling);
        this._data_running  =   Float.parseFloat(_data_running);
        this._data_walking  =   Float.parseFloat(_data_walking);
        this._data_weight   =   Float.parseFloat(_data_weight);
    }

    // Set ID
    public void set_id(int _id) {
        this._id = _id;
    }

    // Set Blood pressure
    public void set_data_bloodP(String _data_bloodP) {
        this._data_bloodP = _data_bloodP;
    }

    // Set Blood suger
    public void set_data_bloodS(int _data_bloodS) {
        this._data_bloodS = _data_bloodS;
    }

    // Set Daily walking
    public void set_data_walking(Float _data_walking) {
        this._data_walking = _data_walking;
    }
    // Set Daily Running
    public void set_data_running(Float _data_running) {
        this._data_running = _data_running;
    }
    // Set Daily Cycling
    public void set_data_cycling(Float _data_cycling) {
        this._data_cycling = _data_cycling;
    }
    // Set Daily Weight
    public void set_data_weight(Float _data_weight) {
        this._data_weight = _data_weight;
    }
    // Date & Time
    public void set_data_dateT(String _data_dateT) {
    //    this._data_dateT = _data_dateT;
          this._data_dateT = "TIME_";
    }

    public int get_id()
    {
        return _id;
    }
    public String get_data_bloodP()
    {
        return _data_bloodP;
    }
    public int get_data_bloodS()
    {
        return _data_bloodS;
    }
    public Float get_data_walking()
    {
        return _data_walking;
    }
    public Float get_data_running()
    {
        return _data_running;
    }
    public Float get_data_cycling()
    {
        return _data_cycling;
    }
    public Float get_data_weight()
    {
        return _data_weight;
    }
    public String get_data_dateT()
    {
        return "Time_";
    }


}
