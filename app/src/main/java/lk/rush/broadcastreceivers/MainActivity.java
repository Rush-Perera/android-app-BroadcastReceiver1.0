package lk.rush.broadcastreceivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter filter = new IntentFilter("lk.example.rush.CUSTOM_INTENT");
        MyBroadcastReceiver receiver = new MyBroadcastReceiver();
//        registerReceiver(receiver,filter);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction("lk.example.rush.CUSTOM_INTENT");
                sendBroadcast(intent);

//                IntentFilter filter = new IntentFilter("lk.example.rush.CUSTOM_INTENT");
//                MyBroadcastReceiver receiver = new MyBroadcastReceiver();

            }
        });

        registerReceiver(receiver,filter);
    }
}