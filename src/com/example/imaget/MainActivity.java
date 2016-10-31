package com.example.imaget;
import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    private boolean flag=true;
    private ImageButton myBtn;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn=(ImageButton)findViewById(R.id.myImg);
        myBtn.setOnClickListener(new OnClickListener() {			
			public void onClick(View v) {
				
				if(flag){
					myBtn.setImageResource(R.drawable.k4);
				}else{
					myBtn.setImageResource(R.drawable.ice);
				}
				flag=!flag;
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}