package sharma.rishi.pradhan.com.fireapp;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by yash on 4/11/16.
 */

public class Fireapp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);

    }
}
