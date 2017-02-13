package com.desarrollodeaplicaciones.dialogosuno;

import android.support.v4.app.DialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;


public class DialogoAlerta extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Esto es un mensaje de alerta")
                            .setTitle("Informacion")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener(){
                                public void onClick(DialogInterface dialog, int id){
                                    dialog.cancel();
                                }
                            });
        return builder.create();
    }
}
