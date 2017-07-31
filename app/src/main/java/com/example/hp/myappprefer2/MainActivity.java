package com.example.hp.myappprefer2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tv;
    Button bt1,bt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textView);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt1:
                Toast.makeText(getApplicationContext(),"starting..",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,PrefsActivity.class);
                startActivity(intent);

                break;
            case R.id.bt2:
                DisplaySharedPreferences();
                break;
            default:
                break;

    }
}

    private void DisplaySharedPreferences() {
        SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(MainActivity.this);
        String username = prefs.getString("username","sanal");
        String passw=prefs.getString("password","123");
        boolean checkbox = prefs.getBoolean("check",false);
        String listpref = prefs.getString("listpref","default list");

        StringBuilder builder= new StringBuilder();
        builder.append("Username:"+username+"\n");
        builder.append("Password:"+passw+"\n");
        builder.append("Keep me Loged in:"+String.valueOf(checkbox)+"\n");
        builder.append("list Preferences:"+listpref);
        tv.setText(builder.toString());
    }


}
