package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;
import fci.arabicsignlangtoarabicspeech.scu.*;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		Parse.initialize(this, "PY1bfw9c6ix89lGl7EFKxZtzYJnFKWFrTVhRBcLe",
				"P6SxDXxbVB8DcJiLAdXHBkrIG3Nn8cEQWRUbZOBD");

	}
}
