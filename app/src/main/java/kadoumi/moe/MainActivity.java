package kadoumi.moe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spn1=findViewById(R.id.spn1);
        BookDA bookd=new BookDA();
        String[] types=bookd.getvalues();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,types);
        spn1.setAdapter(adapter);

    }

    public void btnonclk(View view) {
        String res="ur Book Is "+spn1.getSelectedItem().toString();
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }
}