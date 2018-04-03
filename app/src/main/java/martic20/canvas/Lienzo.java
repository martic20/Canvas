package martic20.canvas;


        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.graphics.RectF;
        import android.view.MotionEvent;
        import android.view.View;

/**
 * Created by ximo on 03/04/2018.
 */

public class Lienzo extends View {
    Paint pintar = new Paint();

    int x = 100;
    int y = 100;
    int cont = 0;

    public Lienzo(Context context) {
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int eventaction = event.getAction();

        if (eventaction == MotionEvent.ACTION_DOWN) {
            x = (int) event.getX();
            y = (int) event.getY();
            invalidate();
        }
        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (cont) {
            case 0:
                pintar.setColor(Color.RED);
                canvas.drawRect(x - 20, y - 20, x + 20, y + 10, pintar);
                pintar.setColor(Color.GREEN);
                canvas.drawRect(x - 20, y, x + 20, y + 20, pintar);
                break;

            case 1:
                pintar.setColor(Color.YELLOW);
                canvas.drawCircle(x, y, 40, pintar);
                break;

            case 2:
                pintar.setColor(Color.YELLOW);
                pintar.setTextSize(40);
                canvas.drawText("EYYYY!!", x, y, pintar);
                break;

            case 3:
                pintar.setColor(Color.MAGENTA);
                canvas.drawOval(new RectF(x - 40, y - 20, x + 40, y + 20), pintar);
                break;
        }
        cont = (cont + 1) % 4;
    }



}

