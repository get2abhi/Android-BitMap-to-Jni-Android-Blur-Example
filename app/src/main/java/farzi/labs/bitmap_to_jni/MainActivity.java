package farzi.labs.bitmap_to_jni;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bitmap = ((BitmapDrawable) getResources().getDrawable(R.drawable.pencils)).getBitmap().copy(Bitmap.Config.ARGB_8888, true);
        sendBitmapToNative(bitmap);
        ((ImageView)findViewById(R.id.img_blurred)).setImageBitmap((Bitmap) sendBitmapToNative(bitmap));
        ((ImageView)findViewById(R.id.img_original)).setImageDrawable(getResources().getDrawable(R.drawable.pencils));
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native Bitmap sendBitmapToNative(Bitmap bitmap);
}
