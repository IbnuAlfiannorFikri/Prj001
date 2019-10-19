package id.ac.poliban.dts.alfin.prj01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasikan Variable
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variable Berdasarakn id
        TextNama= findViewById(R.id.TxtNama);
        Hasil= findViewById(R.id.Lbl_Nama);

    }

    @SuppressLint("SetTextI18n")
    public void tampilNama(View view) {
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }

}
