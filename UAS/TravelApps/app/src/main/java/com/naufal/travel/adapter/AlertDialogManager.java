package com.naufal.travel.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import naufal.travel.R;

public class AlertDialogManager {

    public void showAlertDialog(Context context, String title, String message, Boolean status) {

        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);
        alertDialog.setMessage(message);

        if (status != null)
            alertDialog.setIcon((status) ? R.drawable.ic_success : R.drawable.ic_fail);
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        alertDialog.show();
    }
}