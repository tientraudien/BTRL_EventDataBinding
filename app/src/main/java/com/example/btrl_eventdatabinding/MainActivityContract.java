package com.example.btrl_eventdatabinding;

import com.example.model.TemperatureData;

public interface MainActivityContract {
    public interface Presenter{
        void onShowData(TemperatureData temperatureData);
    }
    public interface View{
        void showData(TemperatureData temperatureData);
    }
}
