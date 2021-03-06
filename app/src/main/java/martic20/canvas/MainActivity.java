package martic20.canvas;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.hardware.Camera;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Lienzo l;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (Lienzo)findViewById(R.id.canvas);
        setupButtons();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED)
            ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CAMERA}, 100);

        if (null == savedInstanceState) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2BasicFragment.newInstance())
                    .commit();
        }


    }



    private void setupButtons() {
        ImageButton red = (ImageButton) findViewById(R.id.colorRed);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.RED);
            }
        });
        ImageButton green = (ImageButton) findViewById(R.id.colorGreen);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.GREEN);
            }
        });
        ImageButton blue = (ImageButton) findViewById(R.id.colorBlue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.BLUE);
            }
        });
        ImageButton orange = (ImageButton) findViewById(R.id.colorOrange);
        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.rgb(255, 111, 0));
            }
        });

        Button sS = (Button) findViewById(R.id.sizeS);
        sS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setSize(4);
            }
        });
        Button sM = (Button) findViewById(R.id.sizeM);
        sM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setSize(16);
            }
        });
        Button sL = (Button) findViewById(R.id.sizeL);
        sL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setSize(32);
            }
        });
        Button sXL = (Button) findViewById(R.id.sizeXL);
        sXL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setSize(64);
            }
        });
    }
}

