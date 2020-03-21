package hilmi.phonebase.com.covid19.view;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

import hilmi.phonebase.com.covid19.R;

public class AboutMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_menu);
        setTitle("AboutMe");

        CardView tvVisitLink = (CardView) findViewById(R.id.crd_about);
        tvVisitLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                browserIntent.setData(Uri.parse("https://www.instagram.com/hilmihidayat__/"));
                startActivity(browserIntent);
            }
        });
        textBlinkCovid();
    }


    public void textBlinkCovid(){
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int timeToBlink = 1000;    //in milissegunds
                try{Thread.sleep(timeToBlink);}catch (Exception e) {}
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        TextView txt = (TextView) findViewById(R.id.footer);
                        if(txt.getVisibility() == View.VISIBLE){
                            txt.setVisibility(View.INVISIBLE);
                        }else{
                            txt.setVisibility(View.VISIBLE);
                        }
                        textBlinkCovid();
                    }
                });
            }
        }).start();
    }
}
