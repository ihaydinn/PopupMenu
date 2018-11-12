package com.ismailhakkiaydin.popupmenu;
import android.os.Bundle;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView txtTest;

    private void init()
    {
        txtTest = (TextView) findViewById(R.id.txtTest);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void btnPopupClick(View v)
    {
        PopupMenu pm = new PopupMenu(this, txtTest, Gravity.END);
        pm.inflate(R.menu.popup_menu);
        pm.show();
    }

    public void mnuClick(MenuItem item)
    {
        this.setTitle(item.getTitle());

    }
}
