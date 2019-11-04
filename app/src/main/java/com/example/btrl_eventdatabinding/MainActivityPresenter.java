package com.example.btrl_eventdatabinding;

import com.example.btrl_eventdatabinding.MainActivityContract;
import com.example.model.TemperatureData;

public class MainActivityPresenter  {
    private  MainActivityContract.View view;
    public MainActivityPresenter(MainActivityContract.View view)
    {
        this.view=view;
    }
    public void onShowData(TemperatureData temperatureData){
        this.view.showData(temperatureData);
    }
}
