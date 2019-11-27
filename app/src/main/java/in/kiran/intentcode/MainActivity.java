package in.kiran.intentcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonTwo;
    Button mButtonThree;
    Button mButtonFour;
    Button mButtonFive;
    Button mButtonSix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mButtonTwo = findViewById(R.id.ButtonTwo);
        mButtonThree = findViewById(R.id.ButtonThree);
        mButtonFour = findViewById(R.id.ButtonFour);
        mButtonFive = findViewById(R.id.ButtonFive);
        mButtonSix = findViewById(R.id.ButtonSix);

        mButtonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });

        mButtonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Third.class);
                startActivity(intent);
            }
        });

        mButtonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Fourth.class );
                startActivity(intent);
            }
        });

        mButtonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Fifth.class);
                startActivity(intent);
            }
        });

        mButtonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sixth.class);
                startActivity(intent);
            }
        });






    }
}
