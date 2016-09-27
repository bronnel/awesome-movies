package net.marcosrocha.awesomemovies.presenters;

import android.content.Context;
import android.content.Intent;
import net.marcosrocha.awesomemovies.activities.MainActivity;

/**
 * Created by marcos.rocha on 9/27/16.
 */
public class MainActivityPresenter {
    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }
}
