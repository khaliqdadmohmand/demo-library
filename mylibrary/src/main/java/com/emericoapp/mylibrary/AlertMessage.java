package com.emericoapp.mylibrary;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class AlertMessage {
    public String title;
    public String message;

    public AlertMessage(String title, String message) {
        this.title = title;
        this.message = message;
    }


    public void showAlert(Context con){
       new AlertDialog.Builder(con)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .show();
    }
}
