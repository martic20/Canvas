package martic20.canvas;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Lienzo lienzo = new Lienzo(this);
        lienzo.setBackgroundColor(Color.BLACK);
        setContentView(lienzo);
    }
}
