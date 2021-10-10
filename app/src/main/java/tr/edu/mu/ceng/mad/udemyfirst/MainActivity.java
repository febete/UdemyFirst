package tr.edu.mu.ceng.mad.udemyfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeImage(View view){
//        Button button = findViewById(R.id.button);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.mskuceng);
        /*ImageView fbt = findViewById(R.id.imageView);
        fbt.setImageResource(R.drawable.mskuceng);*/

    }

}