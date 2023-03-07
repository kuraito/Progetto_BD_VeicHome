package it.unisa.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;

/**************
 * IMPORTANTE PER SQL ---- SET GLOBAL FOREIGN_KEY_CHECKS=0;
 *******************************/

public class concessionarioDB {

	static int scelta = 0;

	public static int menu() {

		System.out.println("********* SCEGLI OPERAZIONE *********");
		System.out.println("OPERAZIONE 1");
		System.out.println("OPERAZIONE 2");
		System.out.println("OPERAZIONE 3");
		System.out.println("OPERAZIONE 4");
		System.out.println("OPERAZIONE 5");
		System.out.println("OPERAZIONE 6");
		System.out.println("OPERAZIONE 7");
		System.out.println("OPERAZIONE 9");
		System.out.println("OPERAZIONE 10");
		System.out.println("OPERAZIONE 11");
		System.out.println("OPERAZIONE 12");
		System.out.println("OPERAZIONE 13");
		System.out.println("OPERAZIONE 14");
		System.out.println("OPERAZIONE 15");
		System.out.println("OPERAZIONE 16");
		System.out.println("OPERAZIONE 17");
		System.out.println("OPERAZIONE 18");
		System.out.println("OPERAZIONE 19");
		System.out.println("OPERAZIONE 20");
		System.out.println("OPERAZIONE 21");

		System.out.println("INSERISCI SCELTA:");
		Scanner in = new Scanner(System.in);
		scelta = in.nextInt();

		return scelta;

	}

	public static void main(String[] args) throws SQLException, IOException {
		connection database = new connection();
		while (true) {
			int sceltaOperazione = menu();
			if (sceltaOperazione == 1) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();

				String control = database.controllo(codice_fiscale_temp);
				if (!control.isEmpty()) {

					System.out.println("INSERISCI Codice:");
					Scanner in = new Scanner(System.in);
					int codice = in.nextInt();

					System.out.println("INSERISCI data_inizio:");
					Scanner in2 = new Scanner(System.in);
					String data_inzio = in2.nextLine();

					System.out.println("INSERISCI data_fine:");
					Scanner in3 = new Scanner(System.in);
					String data_fine = in3.nextLine();

					System.out.println("INSERISCI targa veicolo:");
					Scanner in4 = new Scanner(System.in);
					String targa_veicolo = in4.nextLine();

					System.out.println("INSERISCI codice officina:");
					Scanner in5 = new Scanner(System.in);
					int codice_officina = in5.nextInt();

					database.operazione1(codice, data_inzio, data_fine, targa_veicolo, codice_officina);
					System.out.println("OPERAZIONE EFFETTUATA");
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}

			}

			if (sceltaOperazione == 2) {

				System.out.println("INSERISCI targa veicolo:");
				Scanner in6 = new Scanner(System.in);
				String targa_veicolo = in6.nextLine();
				System.out.println(database.operazione2(targa_veicolo));
			}

			if (sceltaOperazione == 3) {
				System.out.println("INSERISCI riparazione codice:");
				Scanner in7 = new Scanner(System.in);
				int riparazione_CODICE = in7.nextInt();
				System.out.println(database.operazione3(riparazione_CODICE));
			}

			if (sceltaOperazione == 4) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {

					System.out.println("INSERISCI TARGA:");
					Scanner in8 = new Scanner(System.in);
					String Targa = in8.nextLine();

					System.out.println("INSERISCI Prezzo:");
					Scanner in9 = new Scanner(System.in);
					Float prezzo = in9.nextFloat();

					System.out.println("INSERISCI MODELLO:");
					Scanner in10 = new Scanner(System.in);
					String modello = in10.nextLine();

					System.out.println("INSERISCI CODICE TELAIO:");
					Scanner in11 = new Scanner(System.in);
					String codice_telaio = in11.nextLine();

					System.out.println("INSERISCI KW:");
					Scanner in12 = new Scanner(System.in);
					int kw = in12.nextInt();

					System.out.println("INSERISCI COLORE:");
					Scanner in13 = new Scanner(System.in);
					String colore = in13.nextLine();

					System.out.println("INSERISCI MARCHIO:");
					Scanner in14 = new Scanner(System.in);
					String marchio = in14.nextLine();

					System.out.println("INSERISCI CODICE FISCALE ADMIN:");
					Scanner in15 = new Scanner(System.in);
					String adminCF = in15.nextLine();

					System.out.println("INSERISCI SCONTO:");
					Scanner in16 = new Scanner(System.in);
					int sconto = in16.nextInt();

					System.out.println("INSERISCI NUMERO PASSEGERI:");
					Scanner in17 = new Scanner(System.in);
					int numero_passegeri = in17.nextInt();

					// INSERIMENTO TARGA VEICOLO PER AUTO
					// String auto_veicolo = in8.nextLine();

					database.operazione4(Targa, prezzo, modello, codice_telaio, kw, colore, marchio, adminCF, sconto,
							numero_passegeri, Targa);
					System.out.println("OPERAZIONE EFFETTUATA");
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}

			}

			if (sceltaOperazione == 5) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {

					System.out.println("INSERISCI TARGA:");
					Scanner in8 = new Scanner(System.in);
					String Targa = in8.nextLine();

					System.out.println("INSERISCI Prezzo:");
					Scanner in9 = new Scanner(System.in);
					Float prezzo = in9.nextFloat();

					System.out.println("INSERISCI MODELLO:");
					Scanner in10 = new Scanner(System.in);
					String modello = in10.nextLine();

					System.out.println("INSERISCI CODICE TELAIO:");
					Scanner in11 = new Scanner(System.in);
					String codice_telaio = in11.nextLine();

					System.out.println("INSERISCI KW:");
					Scanner in12 = new Scanner(System.in);
					int kw = in12.nextInt();

					System.out.println("INSERISCI COLORE:");
					Scanner in13 = new Scanner(System.in);
					String colore = in13.nextLine();

					System.out.println("INSERISCI MARCHIO:");
					Scanner in14 = new Scanner(System.in);
					String marchio = in14.nextLine();

					System.out.println("INSERISCI CODICE FISCALE ADMIN:");
					Scanner in15 = new Scanner(System.in);
					String adminCF = in15.nextLine();

					System.out.println("INSERISCI CUSTOM:");
					Scanner in16 = new Scanner(System.in);
					String custom = in16.nextLine();

					// INSERIMENTO TARGA VEICOLO PER MOTO
					// String moto_veicolo = in8.nextLine();

					database.operazione5(Targa, prezzo, modello, codice_telaio, kw, colore, marchio, adminCF, custom,
							Targa);
					System.out.println("OPERAZIONE EFFETTUATA");
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}
			}

			if (sceltaOperazione == 6) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {

					System.out.println("INSERISCI TARGA:");
					Scanner in8 = new Scanner(System.in);
					String Targa = in8.nextLine();

					System.out.println("INSERISCI Prezzo:");
					Scanner in9 = new Scanner(System.in);
					Float prezzo = in9.nextFloat();

					System.out.println("INSERISCI MODELLO:");
					Scanner in10 = new Scanner(System.in);
					String modello = in10.nextLine();

					System.out.println("INSERISCI CODICE TELAIO:");
					Scanner in11 = new Scanner(System.in);
					String codice_telaio = in11.nextLine();

					System.out.println("INSERISCI KW:");
					Scanner in12 = new Scanner(System.in);
					int kw = in12.nextInt();

					System.out.println("INSERISCI COLORE:");
					Scanner in13 = new Scanner(System.in);
					String colore = in13.nextLine();

					System.out.println("INSERISCI MARCHIO:");
					Scanner in14 = new Scanner(System.in);
					String marchio = in14.nextLine();

					System.out.println("INSERISCI CODICE FISCALE ADMIN:");
					Scanner in15 = new Scanner(System.in);
					String adminCF = in15.nextLine();

					System.out.println("INSERISCI SCONTO:");
					Scanner in16 = new Scanner(System.in);
					int sconto = in16.nextInt();

					System.out.println("INSERISCI NUMERO PASSEGERI:");
					Scanner in17 = new Scanner(System.in);
					int numero_passegeri = in17.nextInt();

					// INSERIMENTO TARGA VEICOLO PER AUTO
					// String auto_veicolo = in8.nextLine();

					System.out.println("NUMERO KM:");
					Scanner in18 = new Scanner(System.in);
					int numero_km = in18.nextInt();

					System.out.println("ANNO IMMATRICOLAZIONE:");
					Scanner in19 = new Scanner(System.in);
					String anno_immatricolazione = in19.nextLine();

					// INSERIMENTO TARGA VEICOLO AUO USATO

					System.out.println("CODICE FISCALE PROPRIETARIO:");
					Scanner in20 = new Scanner(System.in);
					String proprietario_CF = in20.nextLine();

					System.out.println("INSERIRE NOME:");
					Scanner in21 = new Scanner(System.in);
					String nome_Proprietario = in21.nextLine();

					System.out.println("INSERIRE COGNOME:");
					Scanner in22 = new Scanner(System.in);
					String cognome_Proprietario = in22.nextLine();

					database.operazione6(Targa, prezzo, modello, codice_telaio, kw, colore, marchio, adminCF, sconto,
							numero_passegeri, Targa, numero_km, anno_immatricolazione, Targa, proprietario_CF,
							nome_Proprietario, cognome_Proprietario, proprietario_CF, Targa);
					System.out.println("OPERAZIONE EFFETTUATA");
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}

			}

			if (sceltaOperazione == 7) {

				System.out.println("INSERIRE CODICE FISCALE:");
				Scanner in23 = new Scanner(System.in);
				String CF = in23.nextLine();

				System.out.println("INSERIRE SESSO:");
				Scanner in24 = new Scanner(System.in);
				String sesso = in24.nextLine();

				System.out.println("INSERIRE NOME:");
				Scanner in25 = new Scanner(System.in);
				String nome = in25.nextLine();

				System.out.println("INSERIRE COGNOME:");
				Scanner in26 = new Scanner(System.in);
				String cognome = in26.nextLine();

				System.out.println("INSERIRE INDIRIZZO:");
				Scanner in27 = new Scanner(System.in);
				String indirizzo = in27.nextLine();

				System.out.println("INSERIRE CITTA':");
				Scanner in28 = new Scanner(System.in);
				String citta = in28.nextLine();

				System.out.println("INSERIRE DATA DI NASCITA:");
				Scanner in29 = new Scanner(System.in);
				String data_di_nascita = in29.nextLine();

				System.out.println("INSERIRE NUMERO DI CARTA:");
				Scanner in30 = new Scanner(System.in);
				String numero_carta = in30.nextLine();

				System.out.println("INSERIRE SCADENZA:");
				Scanner in31 = new Scanner(System.in);
				String scadenza = in31.nextLine();
				
				System.out.println("INSERIRE NUMERO TELEFONO:");
				Scanner in36 = new Scanner(System.in);
				String numero = in36.nextLine();

				database.operazione7(CF, sesso, nome, cognome, indirizzo, citta, data_di_nascita, numero_carta,
						scadenza, CF,numero,CF);
				System.out.println("OPERAZIONE EFFETTUATA");

			}

			if (sceltaOperazione == 8) {
				System.out.println(database.operazione8());
			}

			if (sceltaOperazione == 9) {
				System.out.println(database.operazione9());
			}

			if (sceltaOperazione == 10) {
				System.out.println(database.operazione10());
			}

			if (sceltaOperazione == 11) {

				System.out.println("INSERIRE CODICE FISCALE CLIENTE:");
				Scanner in32 = new Scanner(System.in);
				String acquistato_cliente_CF = in32.nextLine();

				System.out.println("INSERIRE VEICOLO TARGA:");
				Scanner in33 = new Scanner(System.in);
				String acquistato_veicolo_TARGA = in33.nextLine();

				database.operazione11(acquistato_cliente_CF, acquistato_veicolo_TARGA);
				System.out.println("OPERAZIONE EFFETTUATA");
			}

			if (sceltaOperazione == 12) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {

					System.out.println("INSERIRE CODICE FISCALE ADMIN:");
					Scanner in34 = new Scanner(System.in);
					String cfAdmin = in34.nextLine();
					System.out.println(database.operazione12(cfAdmin));
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}
			}

			if (sceltaOperazione == 13) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {
					System.out.println("INSERISCI CODICE FISCALE ADMIN:");
					Scanner in1 = new Scanner(System.in);
					String CF = in1.nextLine();

					System.out.println("INSERISCI NOME ADMIN:");
					Scanner in2 = new Scanner(System.in);
					String nome = in2.nextLine();

					System.out.println("INSERISCI COGNOME ADMIN:");
					Scanner in3 = new Scanner(System.in);
					String cognome = in3.nextLine();

					System.out.println("INSERISCI TARGA:");
					Scanner in8 = new Scanner(System.in);
					String Targa = in8.nextLine();

					System.out.println("INSERISCI Prezzo:");
					Scanner in9 = new Scanner(System.in);
					Float prezzo = in9.nextFloat();

					System.out.println("INSERISCI MODELLO:");
					Scanner in10 = new Scanner(System.in);
					String modello = in10.nextLine();

					System.out.println("INSERISCI CODICE TELAIO:");
					Scanner in11 = new Scanner(System.in);
					String codice_telaio = in11.nextLine();

					System.out.println("INSERISCI KW:");
					Scanner in12 = new Scanner(System.in);
					int kw = in12.nextInt();

					System.out.println("INSERISCI COLORE:");
					Scanner in13 = new Scanner(System.in);
					String colore = in13.nextLine();

					System.out.println("INSERISCI MARCHIO:");
					Scanner in14 = new Scanner(System.in);
					String marchio = in14.nextLine();

					System.out.println("INSERISCI CODICE FISCALE ADMIN:");
					Scanner in15 = new Scanner(System.in);
					String adminCF = in15.nextLine();

					System.out.println("INSERISCI SCONTO:");
					Scanner in16 = new Scanner(System.in);
					int sconto = in16.nextInt();

					System.out.println("INSERISCI NUMERO PASSEGERI:");
					Scanner in17 = new Scanner(System.in);
					int numero_passegeri = in17.nextInt();

					// INSERIMENTO TARGA VEICOLO PER AUTO
					// String auto_veicolo = in8.nextLine();

					database.operazione13(CF, nome, cognome, Targa, prezzo, modello, codice_telaio, kw, colore, marchio,
							adminCF, sconto, numero_passegeri, Targa);
					System.out.println("OPERAZIONE EFFETTUATA");
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}
			}

			if (sceltaOperazione == 14) {

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {

					System.out.println("INSERISCI NUMERO TELEFONO:");
					Scanner in1 = new Scanner(System.in);
					String numero_telefono = in1.nextLine();

					System.out.println("INSERISCI NOME OFFICINA:");
					Scanner in2 = new Scanner(System.in);
					String nome = in2.nextLine();

					System.out.println("INSERISCI CODICE OFFICINA:");
					Scanner in3 = new Scanner(System.in);
					int codice = in3.nextInt();

					database.operazione14(numero_telefono, nome, codice);
					System.out.println("OPERAZIONE EFFETTUATA");
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}
			}

			if (sceltaOperazione == 15) {
				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {
					System.out.println(database.operazione15());
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}
			}

			if (sceltaOperazione == 16) {
				System.out.println(database.operazione16());
			}

			if (sceltaOperazione == 17) {

				System.out.println("INSERISCI NUMERO PASSEGERI:");
				Scanner in3 = new Scanner(System.in);
				int numero = in3.nextInt();
				System.out.println(database.operazione17(numero));
			}

			if (sceltaOperazione == 18) {

				System.out.println("INSERISCI SCONTO:");
				Scanner in3 = new Scanner(System.in);
				int sconto = in3.nextInt();
				System.out.println(database.operazione18(sconto));
			}

			if (sceltaOperazione == 19) {
				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in25 = new Scanner(System.in);
				String codice_fiscale_temp = in25.nextLine();
				String control = database.controllo(codice_fiscale_temp);

				if (!control.isEmpty()) {
					System.out.println(database.operazione19());
				} else {
					System.err.println("ERRORE INSERIMENTO CODICE FISCALE");
				}
			}

			if (sceltaOperazione == 20) {

				System.out.println("INSERISCI MARCHIO VEICOLO:");
				Scanner in3 = new Scanner(System.in);
				String marchio = in3.nextLine();
				System.out.println(database.operazione20(marchio));
			}
			
			if(sceltaOperazione == 21) {
				System.out.println("INSERISCI NUMERO TELEFONO:");
				Scanner in1 = new Scanner(System.in);
				String numero_telefono = in1.nextLine();

				System.out.println("INSERISCI CODICE FISCALE:");
				Scanner in2 = new Scanner(System.in);
				String fiscale = in2.nextLine();
				
				database.operazione21(numero_telefono,fiscale);
			}

		}
	}

}
