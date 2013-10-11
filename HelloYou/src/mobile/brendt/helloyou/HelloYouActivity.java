package mobile.brendt.helloyou;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HelloYouActivity extends Activity {
	private static final String DEBUGTAG = "HelloYouActivity"; 
	public static final String EXTRA_MESSAGE = "mobile.brendt.helloyou.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_you);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello_you, menu);
        return true;
    }
    
    public void onClick(View view){
    	 Log.v(DEBUGTAG, "clicked HELLO");
    	 /*
    	 Intent intent = new Intent(this, DisplayMessageActivity.class);
    	 EditText editText = (EditText) findViewById(R.id.txtName);
    	 String message = editText.getText().toString();
    	 intent.putExtra(EXTRA_MESSAGE, message);
    	 startActivity(intent);
    	 */
    	 
    	 Context context = getApplicationContext();
    	 EditText editText = (EditText) findViewById(R.id.txtName);
    	 CharSequence text = "Hello " + editText.getText().toString() + "!";
    	 int duration = Toast.LENGTH_LONG;

    	 Toast toast = Toast.makeText(context, text, duration);
    	 toast.show();
    } 
    
}
