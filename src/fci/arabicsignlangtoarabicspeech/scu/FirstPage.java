package fci.arabicsignlangtoarabicspeech.scu;

import nl.fampennings.keyboard.R;
import com.chatt.demo.Login ;
import nl.fampennings.keyboard.R.id;
import nl.fampennings.keyboard.R.layout;
import nl.fampennings.keyboard.R.menu;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class FirstPage extends Activity {
	private Button chat , keyboard ;
	Intent I1 , I2 ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first_page);
		chat=(Button)findViewById(R.id.button_chat) ;
		keyboard =(Button)findViewById(R.id.button_keyboard);
		chat.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent I1= new Intent(FirstPage.this,Login.class);
				startActivity(I1);
				
			}
		});
       keyboard.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent I2= new Intent(FirstPage.this,MainActivity.class);
				startActivity(I2);
				
			}
		});
	}
	 
     
     }
