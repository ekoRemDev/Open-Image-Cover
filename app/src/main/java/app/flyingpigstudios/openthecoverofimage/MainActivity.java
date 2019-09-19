package app.flyingpigstudios.openthecoverofimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    int imageId;

    ImageView
            hint1,hint2,hint3,hint4,hint5,
            hint6,hint7,hint8,hint9,hint10,
            hint11,hint12,hint13,hint14,hint15,
            hint16,hint17,hint18,hint19,hint20,
            hint21,hint22,hint23,hint24,hint25
            ;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView image01, image02;

        image01 = findViewById(R.id.imageview_image01);
//        image02 = findViewById(R.id.imageview_image02);

        hint1 = findViewById(R.id.imageview_hint01);
        hint2 = findViewById(R.id.imageview_hint02);
        hint3 = findViewById(R.id.imageview_hint03);
        hint4 = findViewById(R.id.imageview_hint04);
        hint5 = findViewById(R.id.imageview_hint05);

        hint6 = findViewById(R.id.imageview_hint06);
        hint7 = findViewById(R.id.imageview_hint07);
        hint8 = findViewById(R.id.imageview_hint08);
        hint9 = findViewById(R.id.imageview_hint09);
        hint10 = findViewById(R.id.imageview_hint10);

        hint11 = findViewById(R.id.imageview_hint11);
        hint12 = findViewById(R.id.imageview_hint12);
        hint13 = findViewById(R.id.imageview_hint13);
        hint14 = findViewById(R.id.imageview_hint14);
        hint15 = findViewById(R.id.imageview_hint15);

        hint16 = findViewById(R.id.imageview_hint16);
        hint17 = findViewById(R.id.imageview_hint17);
        hint18 = findViewById(R.id.imageview_hint18);
        hint19 = findViewById(R.id.imageview_hint19);
        hint20= findViewById(R.id.imageview_hint20);

        hint21 = findViewById(R.id.imageview_hint21);
        hint22 = findViewById(R.id.imageview_hint22);
        hint23 = findViewById(R.id.imageview_hint23);
        hint24 = findViewById(R.id.imageview_hint24);
        hint25 = findViewById(R.id.imageview_hint25);


            hint1.setVisibility(View.VISIBLE);
            hint2.setVisibility(View.VISIBLE);
            hint3.setVisibility(View.VISIBLE);
            hint4.setVisibility(View.VISIBLE);
            hint5.setVisibility(View.VISIBLE);
            hint6.setVisibility(View.VISIBLE);
            hint7.setVisibility(View.VISIBLE);
            hint8.setVisibility(View.VISIBLE);
            hint9.setVisibility(View.VISIBLE);
            hint10.setVisibility(View.VISIBLE);
            hint11.setVisibility(View.VISIBLE);
            hint12.setVisibility(View.VISIBLE);
            hint13.setVisibility(View.VISIBLE);
            hint14.setVisibility(View.VISIBLE);
            hint15.setVisibility(View.VISIBLE);
            hint16.setVisibility(View.VISIBLE);




        Button btnHint = findViewById(R.id.button_hint);
        btnHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                rassalSayiUret();






                if (imageId == 1) {
                    hint1.setVisibility(View.INVISIBLE);
                } else if (imageId == 2) {
                    hint2.setVisibility(View.INVISIBLE);
                } else if (imageId == 3) {
                    hint3.setVisibility(View.INVISIBLE);
                } else if (imageId == 4) {
                    hint4.setVisibility(View.INVISIBLE);
                } else if (imageId == 5) {
                    hint5.setVisibility(View.INVISIBLE);
                } else if (imageId == 6) {
                    hint6.setVisibility(View.INVISIBLE);
                } else if (imageId == 7) {
                    hint7.setVisibility(View.INVISIBLE);
                } else if (imageId == 8) {
                    hint8.setVisibility(View.INVISIBLE);
                } else if (imageId == 9) {
                    hint9.setVisibility(View.INVISIBLE);
                } else if (imageId == 10) {
                    hint10.setVisibility(View.INVISIBLE);
                } else if (imageId == 11) {
                    hint11.setVisibility(View.INVISIBLE);
                } else if (imageId == 12) {
                    hint12.setVisibility(View.INVISIBLE);
                } else if (imageId == 13) {
                    hint13.setVisibility(View.INVISIBLE);
                } else if (imageId == 14) {
                    hint14.setVisibility(View.INVISIBLE);
                } else if (imageId == 15) {
                    hint15.setVisibility(View.INVISIBLE);
                } else if (imageId == 16) {
                    hint16.setVisibility(View.INVISIBLE);
                }else if (imageId == 17) {
                    hint17.setVisibility(View.INVISIBLE);
                }else if (imageId == 18) {
                    hint18.setVisibility(View.INVISIBLE);
                }else if (imageId == 19) {
                    hint19.setVisibility(View.INVISIBLE);
                }else if (imageId == 20) {
                    hint20.setVisibility(View.INVISIBLE);
                }else if (imageId == 21) {
                    hint21.setVisibility(View.INVISIBLE);
                }else if (imageId == 22) {
                    hint22.setVisibility(View.INVISIBLE);
                }else if (imageId == 23) {
                    hint23.setVisibility(View.INVISIBLE);
                }else if (imageId == 24) {
                    hint24.setVisibility(View.INVISIBLE);
                }else if (imageId == 25) {
                    hint25.setVisibility(View.INVISIBLE);
                }


//                image02.setVisibility(View.GONE);
            }
        });
    }

    // Benzersiz rassal sayi uretmek icin
    Random r;
    ArrayList<Integer> acilanKareler = new ArrayList<Integer>();

    private void rassalSayiUret() {
        r = new Random();
        // sayi uret
        imageId = r.nextInt(25)+1;

        if(acilanKareler.contains(imageId)){
            rassalSayiUret();
            Log.i("tureme","yeniden turetildi");
        }else {
            acilanKareler.add(imageId);
        }

    }
}

