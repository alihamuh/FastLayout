package com.alihamuh.testLayout;

import android.os.Bundle;

import com.alihamuh.fastTableLayout.FastAttributes;
import com.alihamuh.fastTableLayout.FastLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        FastLayout view= findViewById(R.id.rows);


        ArrayList<FastAttributes> attributes=new ArrayList<>();
        for(int index=0;index<81;index++){
            FastAttributes attr=new FastAttributes();

            attr.setButtonText(Integer.toString(index));

            View.OnClickListener onClickListener= new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Button button= (Button)v;

                    Log.d("test","Number text is "+button.getText());

                    int number=Integer.parseInt(button.getText().toString());
                    int add=number+1;

                    button.setText(""+add);

                    //button.setText(Integer.parseInt(button.getText().toString())+1);
                }
            };

            attr.setOnClickListener(onClickListener);

            attributes.add(attr);
        }

        view.setFastAttributesList(attributes);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
