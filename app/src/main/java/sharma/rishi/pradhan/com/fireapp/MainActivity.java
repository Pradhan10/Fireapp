package sharma.rishi.pradhan.com.fireapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {


    private EditText mValueField;
    private Button mAddButton;
    private EditText mKeyButton;

    private Firebase mRootRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootRef = new Firebase("https://fireapp-56a44.firebaseio.com/Users");

        mValueField = (EditText) findViewById(R.id.editText_value);
        mAddButton = (Button) findViewById(R.id.button_add);
        mKeyButton = (EditText) findViewById(R.id.editText_key);

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String value = mValueField.getText().toString();
                String key = mKeyButton.getText().toString();
                Firebase mChiildRef = mRootRef.child(key);

                mChiildRef.setValue(value);

            }
        });


    }
}
