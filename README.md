# Football Scanner 365 — prova tecnica Android (codice sorgente)

Questo progetto NON è un APK pronto, né un lettore di quote Bet365 verificato. È un esperimento locale per capire se il servizio di accessibilità Android può vedere il testo mostrato dall'app Diretta.it quando è aperta.

## Compilazione
1. Aprire la cartella in Android Studio (Gradle e Android SDK necessari).
2. Eseguire Sync e Build > Build APK(s).
3. Installare l'APK di debug su un dispositivo Android.
4. Aprire l'app, attivare il servizio di accessibilità nelle Impostazioni Android, aprire Diretta.it e una pagina campionato, tornare nell'app e premere **Verifica testo rilevato**.

## Privacy e limiti
- Il servizio acquisisce solo i nodi testuali delle schermate il cui nome pacchetto contiene `livesport` o `flashscore`. Verificare il nome pacchetto effettivo sul dispositivo: potrebbe essere differente.
- I testi rilevati rimangono in preferenze private sul dispositivo; nessun invio in rete.
- L'accessibilità può mostrare testi incompleti e non legge schermate di altre app quando non sono in primo piano.
- Non esiste qui un aggiornamento periodico ogni minuto, né il riconoscimento certo del bookmaker, né i filtri di produzione.
- Prima di implementare acquisizione automatica sistematica, verificare permessi e condizioni d'uso della fonte.
