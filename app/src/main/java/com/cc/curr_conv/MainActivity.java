package com.cc.curr_conv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView amount;
    Spinner sfrom,sto;
    Button convert;
    TextView tvfrom,tvfrom_disp,tvto,tvto_disp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount=findViewById(R.id.edt_amount);
        sfrom=findViewById(R.id.spi_from);
        sto=findViewById(R.id.spi_to);
        convert=findViewById(R.id.btn_convert);
        tvfrom=findViewById(R.id.tv_from);
        tvfrom_disp=findViewById(R.id.tv_from_disp);
        tvto=findViewById(R.id.tv_to);
        tvto_disp=findViewById(R.id.tv_to_disp);

//for 1st spinner
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.cur1,
                android.R.layout.simple_spinner_item);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sfrom.setAdapter(adapter1);


//for 2nd spinner
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.cur2,
                android.R.layout.simple_spinner_item);

        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sto.setAdapter(adapter2);




//for from to text
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String r1  =sfrom.getSelectedItem().toString();
                String r2  =sto.getSelectedItem().toString();


                tvfrom.setText(r1);
                tvto.setText(r2);





                int am = Integer.parseInt(amount.getText().toString());

                if (r1.equals("INR"))
                {
                    if (r2.equals("USD"))
                    {
                        int result =  am*74 ;
                        String str1 = Integer.toString(am);
                        String res = Integer.toString(result);

                       tvfrom_disp.setText(str1);
                       tvto_disp.setText(res);

                    }
                    else if (r2.equals("Pound"))
                    {
                        int result =  am*95 ;
                        String str1 = Integer.toString(am);
                        String res = Integer.toString(result);

                        tvfrom_disp.setText(str1);
                        tvto_disp.setText(res);
                    }
                }



                if (r1.equals("USD"))
                {
                    if (r2.equals("INR"))
                    {
                        int result =  am*74 ;
                        String str1 = Integer.toString(am);
                        String res = Integer.toString(result);

                        tvfrom_disp.setText(str1);
                        tvto_disp.setText(res);
                    }
                    else if (r2.equals("Pound"))
                    {

                        Double result =  am/1.29 ;
                        String str1 = Integer.toString(am);
                        String res = Double.toString(result);

                        tvfrom_disp.setText(str1);
                        tvto_disp.setText(res);
                    }
                }



                if (r1.equals("Pound"))
                {
                    if (r2.equals("INR"))
                    {
                        int result =  am*95 ;
                        String str1 = Integer.toString(am);
                        String res = Integer.toString(result);

                        tvfrom_disp.setText(str1);
                        tvto_disp.setText(res);
                    }
                    else if (r2.equals("USD"))
                    {
                        double result =  am*1.29 ;
                        String str1 = Integer.toString(am);
                        String res = Double.toString(result);

                        tvfrom_disp.setText(str1);
                        tvto_disp.setText(res);
                    }
                }


            }
        });






    }



}