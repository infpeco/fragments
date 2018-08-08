package com.example.infante.fragmens;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements FragmentVerde.OnFragmentInteractionListener,
        FragmentRojo.OnFragmentInteractionListener, FragmentAmarillo.OnFragmentInteractionListener,
        FragmentAzul.OnFragmentInteractionListener, FragmentMorado.OnFragmentInteractionListener{

    FragmentMorado frameMorado;
    FragmentAmarillo frameAmarillo;
    FragmentAzul frameAzul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frameAmarillo = new FragmentAmarillo();
        frameAzul = new FragmentAzul();
        frameMorado = new FragmentMorado();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor,frameAmarillo).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void onClick(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (view.getId()){
            case R.id.btn_morado:
                transaction.replace(R.id.contenedor,frameMorado);
                break;
            case  R.id.btn_amarillo:
                transaction.replace(R.id.contenedor, frameAmarillo);
                break;
            case R.id.btn_azul:
                transaction.replace(R.id.contenedor, frameAzul);
                break;
        }

        transaction.commit();
    }
}
