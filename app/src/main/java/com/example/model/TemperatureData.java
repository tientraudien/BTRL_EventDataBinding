package com.example.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.btrl_eventdatabinding.BR;

public class TemperatureData extends BaseObservable {
    private String celsius;
    private String fahrenheit;


    @Bindable
    public String getCelsius() {

        return celsius;
    }

    public void setCelsius(String celsius) {
        this.celsius = celsius;
        notifyPropertyChanged(BR._all);
    }
    @Bindable
    public String getFahrenheit() {

        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {

        this.fahrenheit = fahrenheit;
    }
    public TemperatureData() {
    }

    public TemperatureData(String celsius) {
        this.celsius = celsius;
    }
}
