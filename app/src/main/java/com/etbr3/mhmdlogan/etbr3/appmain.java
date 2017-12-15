package com.etbr3.mhmdlogan.etbr3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.phoneNumber;
import static android.R.id.message;

/**
 * Created by MhmdLoGaN on 14/12/2017.
 */

public class appmain extends MainActivity implements View.OnClickListener {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main);
        Button b1 = (Button)findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        Button b2 = (Button)findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        Button b3 = (Button)findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        Button b4 = (Button)findViewById(R.id.btn4);
        b4.setOnClickListener(this);
        Button b5 = (Button)findViewById(R.id.btn5);
        b5.setOnClickListener(this);
        Button b6 = (Button)findViewById(R.id.btn6);
        b6.setOnClickListener(this);
        Button b7 = (Button)findViewById(R.id.btn7);
        b7.setOnClickListener(this);
        Button b8 = (Button)findViewById(R.id.btn8);
        b8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn1:
                sendmsg("57357"," ");
                break;

            case R.id.btn2:
                sendmsg("9597"," ");
                break;

            case R.id.btn3:
                sendmsg("9698","قلب");
                break;

            case R.id.btn4:
                sendmsg("9595"," ");
                break;

            case R.id.btn5:
                sendmsg("9598"," ");
                break;

            case R.id.btn6:
                sendmsg("95535","n");
                break;

            case R.id.btn7:
                sendmsg("95530","ستر");
                break;

            case R.id.btn8:
                sendmsg("9695"," ");
                break;
            default:
                break;
        }
    }
    public void sendmsg(String phoneNumber,String message)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("sms:" + phoneNumber));
        intent.putExtra("sms_body", message);
        startActivity(intent);
    }
}