package xyz.sonbn.ircclient.activity;

import android.support.v7.widget.Toolbar;

import xyz.sonbn.ircclient.model.Server;

/**
 * Created by sonbn on 10/30/2017.
 */

public interface ClientActivity {
    Toolbar getToolbar();

    void setToolbarTitle(String title);
    void onServerSelected(Server server);
}
