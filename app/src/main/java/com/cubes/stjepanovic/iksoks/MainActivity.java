package com.cubes.stjepanovic.iksoks;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.cubes.stjepanovic.iksoks.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   private ActivityMainBinding binding;

   private static int a,b,c,d,e,f,g,h,i,m;
   private static int control, player1,player2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.viewVictory1.setVisibility(View.GONE);
        binding.viewVictory2.setVisibility(View.GONE);
        binding.viewVictory3.setVisibility(View.GONE);
        binding.viewVictory4.setVisibility(View.GONE);
        binding.viewVictory5.setVisibility(View.GONE);
        binding.viewVictory6.setVisibility(View.GONE);
        binding.viewVictory7.setVisibility(View.GONE);
        binding.viewVictory8.setVisibility(View.GONE);


        a=0;
        b=0;
        c=0;
        d=0;
        e=0;
        f=0;
        g=0;
        h=0;
        i=0;

        m=0;

        control=0;


        binding.imageViewA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a==0 && control==0){

                    a=1;


                    control=control+1;


                    binding.imageViewA.setImageResource(R.drawable.baseline_x);

                }


               else if (a==0 && control==1){

                    a=2;

                    control=control-1;


                    binding.imageViewA.setImageResource(R.drawable.baseline_o);

                }



               checkVictory();




            }
        });








        binding.imageViewB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b==0 && control==0){

                    b=1;


                    control=control+1;


                    binding.imageViewB.setImageResource(R.drawable.baseline_x);

                }


                else if (b==0 && control==1){

                    b=2;

                    control=control-1;


                    binding.imageViewB.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });
        binding.imageViewC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (c==0 && control==0){

                    c=1;


                    control=control+1;


                    binding.imageViewC.setImageResource(R.drawable.baseline_x);

                }


                else if (c==0 && control==1){

                    c=2;

                    control=control-1;


                    binding.imageViewC.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });




        binding.imageViewD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (d==0 && control==0){

                    d=1;


                    control=control+1;


                    binding.imageViewD.setImageResource(R.drawable.baseline_x);

                }


                else if (d==0 && control==1){

                    d=2;

                    control=control-1;


                    binding.imageViewD.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });




        binding.imageViewE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e==0 && control==0){

                    e=1;


                    control=control+1;


                    binding.imageViewE.setImageResource(R.drawable.baseline_x);

                }


                else if (e==0 && control==1){

                    e=2;

                    control=control-1;


                    binding.imageViewE.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });




        binding.imageViewF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (f==0 && control==0){

                    f=1;


                    control=control+1;


                    binding.imageViewF.setImageResource(R.drawable.baseline_x);

                }


                else if (f==0 && control==1){

                    f=2;

                    control=control-1;


                    binding.imageViewF.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });




        binding.imageViewG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (g==0 && control==0){

                    g=1;


                    control=control+1;


                    binding.imageViewG.setImageResource(R.drawable.baseline_x);

                }


                else if (g==0 && control==1){

                    g=2;

                    control=control-1;


                    binding.imageViewG.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });




        binding.imageViewH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (h==0 && control==0){

                    h=1;


                    control=control+1;


                    binding.imageViewH.setImageResource(R.drawable.baseline_x);

                }


                else if (h==0 && control==1){

                    h=2;

                    control=control-1;


                    binding.imageViewH.setImageResource(R.drawable.baseline_o);

                }



                checkVictory();

            }
        });




        binding.imageViewI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (i==0 && control==0){

                   i=1;


                    control=control+1;


                    binding.imageViewI.setImageResource(R.drawable.baseline_x);

                }


                else if (i==0 && control==1){

                    i=2;

                    control=control-1;


                    binding.imageViewI.setImageResource(R.drawable.baseline_o);

                }


                checkVictory();


            }
        });












    }

    private void checkVictory() {


        if (a==1 && b == 1 && c==1){

            binding.viewVictory1.setVisibility(View.VISIBLE);

            m=1;

             new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {


                     binding.viewVictory1.setVisibility(View.GONE);
                     binding.viewVictory2.setVisibility(View.GONE);
                     binding.viewVictory3.setVisibility(View.GONE);
                     binding.viewVictory4.setVisibility(View.GONE);
                     binding.viewVictory5.setVisibility(View.GONE);
                     binding.viewVictory6.setVisibility(View.GONE);
                     binding.viewVictory7.setVisibility(View.GONE);
                     binding.viewVictory8.setVisibility(View.GONE);


                     a=0;
                     b=0;
                     c=0;
                     d=0;
                     e=0;
                     f=0;
                     g=0;
                     h=0;
                     i=0;


                     control=0;


                     binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                     binding.imageViewI.setImageResource(R.drawable.baseline_0_white);




                      player1=player1+1;



                      binding.textViewPlayer1Wins.setText(""+player1);

                      m=0;


                 }
             }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {


                     onBackPressed();


                 }
             }).show();

        }

        else   if (a==2 && b == 2 && c==2){

            binding.viewVictory1.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);



                    player2=player2+1;

                    m=0;

                    binding.textViewPlayer2Wins.setText(""+player2);

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }



        else   if (d==1 && e == 1 && f==1){

            binding.viewVictory2.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);



                    player1=player1+1;

                    m=0;
                    binding.textViewPlayer1Wins.setText(""+player1);

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();



        }

        else   if (d==2 && e == 2 && f==2){

            binding.viewVictory2.setVisibility(View.VISIBLE);

            m=1;


            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);



                    player2=player2+1;
                    m=0;
                    binding.textViewPlayer2Wins.setText(""+player2);
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();






        }





        else    if (g==1 && h == 1 && i==1){

            binding.viewVictory3.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);




                    player1=player1+1;
                    binding.textViewPlayer1Wins.setText(""+player1);

                    m=0;
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }

        else   if (g==2 && h == 2 && i==2){

            binding.viewVictory3.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);

                    player2=player2+1;
                    binding.textViewPlayer2Wins.setText(""+player2);

                    m=0;

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();



        }




        else   if (b==1 && e == 1 && h==1){

            binding.viewVictory5.setVisibility(View.VISIBLE);

            m=1;


            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);

                    player1=player1+1;
                    binding.textViewPlayer1Wins.setText(""+player1);
                    m=0;

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();

        }

        else   if (b==2 && e == 2 && h==2){

            binding.viewVictory5.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);

                    player2=player2+1;
                    m=0;
                    binding.textViewPlayer2Wins.setText(""+player2);

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }



        else   if (a==1 && d == 1 && g==1){

            binding.viewVictory4.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);

                    player1=player1+1;
                    binding.textViewPlayer1Wins.setText(""+player1);
                   m=0;
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();

        }

        else   if (a==2 && d == 2 && g==2){

            binding.viewVictory4.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    player2=player2+1;
                    binding.textViewPlayer2Wins.setText(""+player2);
                    m=0;

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }



     else   if (c==1 && f == 1 && i==1){

            binding.viewVictory6.setVisibility(View.VISIBLE);
            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);

                    player1=player1+1;
                    binding.textViewPlayer1Wins.setText(""+player1);
                    m=0;

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();

        }

        else   if (c==2 && f == 2 && i==2){

            binding.viewVictory6.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    player2=player2+1;
                    binding.textViewPlayer2Wins.setText(""+player2);
                   m=0;
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }




      else  if (g==1 && e == 1 && c==1){

            binding.viewVictory7.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    player1=player1+1;
                    binding.textViewPlayer1Wins.setText(""+player1);
                   m=0;

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();

        }

        else   if (g==2 && e == 2 && c==2){

            binding.viewVictory7.setVisibility(View.VISIBLE);
           m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    player2=player2+1;
                    binding.textViewPlayer2Wins.setText(""+player2);
                  m=0;

                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }




        else if (i==1 && e == 1 && a==1){

            binding.viewVictory8.setVisibility(View.VISIBLE);

            m=1;

            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 1 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    player1=player1+1;
                    binding.textViewPlayer1Wins.setText(""+player1);
                    m=0;
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();

        }

        else   if (i==2 && e == 2 && a==2){

            binding.viewVictory8.setVisibility(View.VISIBLE);

            m=1;
            new AlertDialog.Builder(MainActivity.this).setTitle("IGRAČ 2 JE POBEDIO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    player2=player2+1;
                    binding.textViewPlayer2Wins.setText(""+player2);
                    m=0;
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();


        }
        else if (a!=0&& b!=0 && c!=0 && d!=0 && e!=0 && f!=0 && g!=0 && h!=0 && i !=0 && m==0) {

            new AlertDialog.Builder(MainActivity.this).setTitle("NEREŠENO , NOVA IGRA ?").setPositiveButton("DA", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    binding.viewVictory1.setVisibility(View.GONE);
                    binding.viewVictory2.setVisibility(View.GONE);
                    binding.viewVictory3.setVisibility(View.GONE);
                    binding.viewVictory4.setVisibility(View.GONE);
                    binding.viewVictory5.setVisibility(View.GONE);
                    binding.viewVictory6.setVisibility(View.GONE);
                    binding.viewVictory7.setVisibility(View.GONE);
                    binding.viewVictory8.setVisibility(View.GONE);


                    a=0;
                    b=0;
                    c=0;
                    d=0;
                    e=0;
                    f=0;
                    g=0;
                    h=0;
                    i=0;


                    control=0;

                    binding.imageViewA.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewB.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewC.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewD.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewE.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewF.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewG.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewH.setImageResource(R.drawable.baseline_0_white);
                    binding.imageViewI.setImageResource(R.drawable.baseline_0_white);


                    m=0;
                }
            }).setNegativeButton("NE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    onBackPressed();


                }
            }).show();



        }


    }




}