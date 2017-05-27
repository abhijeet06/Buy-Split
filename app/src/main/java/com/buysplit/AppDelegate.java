package com.buysplit;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Abhijeet on 27-05-2017.
 */

public class AppDelegate extends Application {
    private static final String TAG = "AppDelegate";
    public static Context appContext;
    private static AppDelegate appDelegateInstance;
    public static int currentIndex = 1;
    public static boolean createEvent = false;
    public static String currentPatient = "";
    public static ArrayList<String> friendList;

    @Override
    public void onCreate() {
        super.onCreate();

        appDelegateInstance = this;
        appContext = getApplicationContext();

        friendList.add("Abhijeet#9035169886");
        friendList.add("Sumit#8953835728");
        friendList.add("Mohit#9045895448");
        friendList.add("Ravi#9402658903");
    }
}
