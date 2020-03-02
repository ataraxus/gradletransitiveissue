package com.example.gradletransitiveissue;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lib.TransitiveFactory;

public class MainActivity extends AppCompatActivity   {


	@Override
	protected void onCreate(final Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		TransitiveFactory.create().doSomething();
	}


}
