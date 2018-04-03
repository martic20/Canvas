package martic20.canvas;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Lienzo l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (Lienzo)findViewById(R.id.canvas);

        ImageButton red = (ImageButton)findViewById(R.id.colorRed);
        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.RED);
            }
        });
        ImageButton green = (ImageButton)findViewById(R.id.colorGreen);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.GREEN);
            }
        });
        ImageButton blue = (ImageButton)findViewById(R.id.colorBlue);
        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                l.setColor(Color.BLUE);
            }
        });


    }
}

