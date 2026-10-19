package com.footballscanner365;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private LinearLayout contenuto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout schermata = new LinearLayout(this);
        schermata.setOrientation(LinearLayout.VERTICAL);
        schermata.setPadding(24, 35, 24, 20);
        schermata.setBackgroundColor(Color.rgb(15, 23, 42));

        TextView titolo = new TextView(this);
        titolo.setText("⚽ FOOTBALL SCANNER 365");
        titolo.setTextSize(23);
        titolo.setTextColor(Color.WHITE);
        schermata.addView(titolo);

        String[] categorie = {
            "CATEGORIA 1",
            "CATEGORIA 2",
            "CATEGORIA 3"
        };

        for (int i = 0; i < categorie.length; i++) {
            final int categoria = i + 1;

            Button pulsante = new Button(this);
            pulsante.setText(categorie[i]);
            schermata.addView(pulsante);

            pulsante.setOnClickListener(v -> mostraCategoria(categoria));
        }

        ScrollView scorrimento = new ScrollView(this);
        contenuto = new LinearLayout(this);
        contenuto.setOrientation(LinearLayout.VERTICAL);
        scorrimento.addView(contenuto);
        schermata.addView(scorrimento);

        setContentView(schermata);
        mostraCategoria(1);
    }

    private void mostraCategoria(int categoria) {
        contenuto.removeAllViews();

        String descrizione;

        if (categoria == 1) {
            descrizione = "Quote Bet365: 1 < 3.00 e 2 < 3.00";
        } else if (categoria == 2) {
            descrizione = "Quota sfavorita: > 4.00 e < 7.50";
        } else {
            descrizione = "Quote Bet365: 1 e 2 tra 2.80 e 4.00";
        }

        TextView testo = new TextView(this);
        testo.setText(
            "\nCATEGORIA " + categoria +
            "\n\n" + descrizione +
            "\n\nNessuna partita caricata." +
            "\n\nVersione dimostrativa: collegamento alle quote da configurare."
        );
        testo.setTextSize(18);
        testo.setTextColor(Color.WHITE);
        contenuto.addView(testo);
    }
}
