package app.ewtc.masterung.easypicture;

import android.app.Application;

import com.inthecheesefactory.thecheeselibrary.manager.Contextor;

/**
 * Created by masterung on 8/1/2017 AD.
 */

public class MainApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //Initial
        Contextor.getInstance().init(getApplicationContext());


    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}   // Main Class
