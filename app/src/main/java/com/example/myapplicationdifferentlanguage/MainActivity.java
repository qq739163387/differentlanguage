package com.example.myapplicationdifferentlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edit;
    private TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       edit=(EditText)findViewById(R.id.edit_text_country);
        Button mButton01 = (Button) findViewById(R.id.button_change_language);
       mButton01.setOnClickListener(new mClick());

    }

    private class mClick implements OnClickListener {

        @Override
        public void onClick(View view) {
            String passwd;
            passwd=edit.getText().toString();

            Context context=getApplicationContext();
            String resName="language_"+passwd;
            int textid=context.getResources().getIdentifier(resName,"string",context.getPackageName());

            TextView textshow,buttonshow;
            textshow=findViewById(R.id.text_view_language);
            textshow.setText(getString(textid));

            String resName2="change_language_"+passwd;
            int textid2=context.getResources().getIdentifier(resName,"string",context.getPackageName());

            buttonshow=findViewById(R.id.button_change_language);
            buttonshow.setText(getString(textid2));
        }
    }

}
