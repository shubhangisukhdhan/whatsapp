package shubhangi.whatappapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText message;
    private Button btnMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message =  findViewById(R.id.message);
        btnMessage = findViewById(R.id.btnMessage);

    }

    public void sendMessage(View v) {

        String whatsAppMessage = message.getText().toString();

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, whatsAppMessage);
        sendIntent.setType("text/plain");

        // Do not forget to add this to open whatsApp App specifically
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);

    }

}


