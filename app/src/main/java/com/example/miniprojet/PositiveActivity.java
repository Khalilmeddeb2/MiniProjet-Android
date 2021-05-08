package com.example.miniprojet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.TextView;

public class PositiveActivity extends AppCompatActivity {


    String[] labotunis = {"Chelli Abdelhak LE Bardo 71507986", "Chahed Moncef Tunis 71325517", "Enneifer Ali Tunis 71801000"};
    String[] laboariana = {"Kallel Leila Ennasser I 71888443", "Zouari Hosny Menzeh6 71751050", "Rachid Med Tahar Ariana 71701846"};
    String[] labobenarous = {"Bellil Mounir Ezzahra 71450296", "Ben Dhamen Mongi Ben Arous  71382337", "Kojok Hamza Sana EL Mourouj 1 71363715"};
    String[] all = {"Tunis", "Ariana", "Ben Arous", "Autre"};
    ListView lst;
    AutoCompleteTextView autoSaisie;
    //  private RadioButton r1 ;
// private RadioButton r2 ;
//private RadioButton r3 ;
//private RadioButton r4 ;
//private ListView list;
    String selectedStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positive);
        // this.r1 = (RadioButton)findViewById(R.id.radioButton);
        //this.r2= (RadioButton)findViewById(R.id.radioButton2);
        //this.r3= (RadioButton)findViewById(R.id.radioButton5);
        //this.r4= (RadioButton)findViewById(R.id.radioButton6);
        //this.list= (ListView) findViewById(R.id.list);
        this.lst = (ListView) this.findViewById(R.id.ListView);
        this.autoSaisie = (AutoCompleteTextView) this.findViewById(R.id.autoCompleteTextView);
        ArrayAdapter ar = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, this.all);
        autoSaisie.setAdapter(ar);

        autoSaisie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                selectedStudent = ((TextView) v).getText().toString();
                ArrayAdapter adapter;

                if (selectedStudent.equals("Tunis")) {
                    adapter = new ArrayAdapter(PositiveActivity.this, android.R.layout.simple_list_item_1, labotunis);
                    lst.setAdapter(adapter);

                } else if (selectedStudent.equals("Ariana")) {
                    adapter = new ArrayAdapter(PositiveActivity.this, android.R.layout.simple_list_item_1, laboariana);
                    lst.setAdapter(adapter);

                } else if (selectedStudent.equals("Ben Arous")) {
                    adapter = new ArrayAdapter(PositiveActivity.this, android.R.layout.simple_list_item_1, labobenarous);
                    lst.setAdapter(adapter);
                }

            }
        });

    }
}
