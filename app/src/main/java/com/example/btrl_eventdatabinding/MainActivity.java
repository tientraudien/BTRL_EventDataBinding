package com.example.btrl_eventdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.btrl_eventdatabinding.databinding.ActivityMainBinding;
import com.example.model.TemperatureData;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        MainActivityPresenter presenter=new MainActivityPresenter(MainActivity.this);
        TemperatureData temp=new TemperatureData("100");

        binding.setTemp(temp);
        binding.setPresenter(presenter);
    }

    @Override
    public void showData(TemperatureData temperatureData) {
        String celsius=temperatureData.getCelsius();
        Toast.makeText(MainActivity.this,temperatureData.getCelsius(),Toast.LENGTH_LONG).show();
    }
}
