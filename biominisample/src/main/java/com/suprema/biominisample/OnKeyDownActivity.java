package com.suprema.biominisample;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.Toast;

public class OnKeyDownActivity extends AppCompatActivity {

    static final int REQUEST_IMAGE_CAPTURE = 1;

    public boolean onKeyDown(int keyCode, KeyEvent event){
        if(keyCode == KeyEvent.KEYCODE_F2){
            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
            }
            Toast.makeText(this,"Open camera",Toast.LENGTH_SHORT).show();
            return true;
        }else if(keyCode == KeyEvent.KEYCODE_VOLUME_UP){
            Toast.makeText(this,"Volume +",Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
