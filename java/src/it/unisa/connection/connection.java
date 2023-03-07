package it.unisa.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class connection {
	Connection conn;
	String url = "jdbc:mysql://localhost:3306/concessionario?serverTimezone=Europe/Rome";

	public connection() {
		openConn();
	}

	void closeConn() throws SQLException {
		conn.close();
	}

	void openConn() {
		try {
			conn = DriverManager.getConnection(url, "root", "123Ciao33");

			if (conn != null)
				System.out.println("Connected to the database!");
			else
				System.out.println("Failed to make connection!");
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* INSERIMENTO RIPARAZIONE */
	public void operazione1(int Codice, String data_inizio, String data_fine, String veicolo_TARGA, int officina_CODICE)
			throws SQLException {

		Statement st = conn.createStatement();

		st.execute("INSERT INTO riparazione (Codice, data_inizio, data_fine, veicolo_TARGA, officina_CODICE)"
				+ "VALUES ('" + Codice + "', '" + data_inizio + "', '" + data_fine + "', '" + veicolo_TARGA + "', '"
				+ officina_CODICE + "'); ");

		st.close();

	}

	/* OPERAZIONE 2 */
	public String operazione2(String Targa) throws SQLException {

		String n = "";
		Statement stmt = conn.createStatement();

		// esegue la query
		ResultSet rs = stmt.executeQuery(
				"SELECT Count(Codice) from riparazione as r,veicolo as v WHERE r.veicolo_TARGA = v.Targa && v.Targa = '"
						+ Targa + "'; ");

		while (rs.next()) {

			int numeroRiparazioni = rs.getInt(1);

			n += "COUNT = " + numeroRiparazioni + "\n\n";
		}

		return n;

	}

	/* OPERAZIONE 3 */
	public String operazione3(int riparazione_CODICE) throws SQLException {

		String n = "";
		Statement stmt = conn.createStatement();

		// esegue la query
		ResultSet rs = stmt.executeQuery(
				"SELECT Count(i.riparazione_CODICE) from riparazione as r,ricambio_info as i WHERE r.Codice=i.riparazione_CODICE && r.Codice = '"
						+ riparazione_CODICE + "'; ");

		while (rs.next()) {

			int numeroPezziRicambio = rs.getInt(1);

			n += "COUNT = " + numeroPezziRicambio + "\n\n";
		}

		return n;

	}

	/* OPERAZIONE 4 */
	public void operazione4(String targa, float prezzo, String modello, String codice_telaio, int kw, String colore,
			String marchio, String admin_CF, int sconto, int numero_passegeri, String auto_veicolo_TARGA)
			throws SQLException {

		Statement st = conn.createStatement();

		st.execute("INSERT INTO veicolo (Targa, prezzo, modello, codice_telaio, kw, colore, marchio, admin_CF)"
				+ "VALUES ('" + targa + "', '" + prezzo + "', '" + modello + "', '" + codice_telaio + "', '" + kw
				+ "', '" + colore + "', '" + marchio + "', '" + admin_CF + "');");

		st.execute("INSERT INTO auto(sconto,numero_passegeri,auto_veicolo_TARGA)" + "VALUES ('" + sconto + "', '"
				+ numero_passegeri + "', '" + auto_veicolo_TARGA + "');");
		st.close();

	}

	/* OPERAZIONE 5 */
	public void operazione5(String targa, float prezzo, String modello, String codice_telaio, int kw, String colore,
			String marchio, String admin_CF, String custom, String moto_veicolo_TARGA) throws SQLException {

		Statement st = conn.createStatement();

		st.execute("INSERT INTO veicolo (Targa, prezzo, modello, codice_telaio, kw, colore, marchio, admin_CF)"
				+ "VALUES ('" + targa + "', '" + prezzo + "', '" + modello + "', '" + codice_telaio + "', '" + kw
				+ "', '" + colore + "', '" + marchio + "', '" + admin_CF + "');");

		st.execute("INSERT INTO moto(custom,moto_veicolo_TARGA)" + "VALUES ('" + custom + "',  '" + moto_veicolo_TARGA
				+ "');");
		st.close();

	}

	/* OPERAZIONE 6 */
	public void operazione6(String targa, float prezzo, String modello, String codice_telaio, int kw, String colore,
			String marchio, String admin_CF, int sconto, int numero_passegeri, String auto_veicolo_TARGA, int numero_km,
			String anno_di_immatricolazione, String usato_auto_veicolo_TARGA, String CF, String nome, String cognome,
			String proprietarioCF, String proprietario_usato_auto_veicolo_TARGA) throws SQLException {

		Statement st = conn.createStatement();

		st.execute("INSERT INTO veicolo (Targa, prezzo, modello, codice_telaio, kw, colore, marchio, admin_CF)"
				+ "VALUES ('" + targa + "', '" + prezzo + "', '" + modello + "', '" + codice_telaio + "', '" + kw
				+ "', '" + colore + "', '" + marchio + "', '" + admin_CF + "');");

		st.execute("INSERT INTO auto(sconto,numero_passegeri,auto_veicolo_TARGA)" + "VALUES ('" + sconto + "', '"
				+ numero_passegeri + "', '" + auto_veicolo_TARGA + "');");

		st.execute("INSERT INTO usato(numero_km,anno_di_immatricolazione,usato_auto_veicolo_TARGA)" + "VALUES ('"
				+ numero_km + "', '" + anno_di_immatricolazione + "', '" + usato_auto_veicolo_TARGA + "');");

		st.execute("INSERT INTO proprietario(CF,nome,cognome)" + "VALUES ('" + CF + "', '" + nome + "', '" + cognome
				+ "');");

		st.execute("INSERT INTO ha_avuto(proprietario_CF,usato_auto_veicolo_TARGA)" + "VALUES ('" + proprietarioCF
				+ "', " + "'" + proprietario_usato_auto_veicolo_TARGA + "');");

		st.close();

	}

	/* OPERAZIONE 7 */
	public void operazione7(String CF, String sesso, String nome, String cognome, String indirizzo, String citta,
			String data_di_nascita, String Numero_carta, String scadenza, String carta_cliente_CF, String numero, String cliente_CF) throws SQLException {

		Statement st = conn.createStatement();

		st.execute("INSERT INTO cliente (CF, sesso, nome, cognome, indirizzo, città, data_di_nascita)" + "VALUES ('"
				+ CF + "', '" + sesso + "', '" + nome + "', '" + cognome + "', '" + indirizzo + "', '" + citta + "', '"
				+ data_di_nascita + "');");

		st.execute("INSERT INTO carta(Numero_carta,scadenza,carta_cliente_CF)" + "VALUES ('" + Numero_carta + "', '"
				+ scadenza + "', '" + carta_cliente_CF + "');");
		
		st.execute("INSERT INTO telefono(Numero,cliente_CF)" + "VALUES ('" + numero + "', '" + cliente_CF + "');");

		st.close();

	}

	/* OPERAZIONE 8 */
	public String operazione8() throws SQLException {

		String n = "";
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(
				"SELECT v.Targa, v.prezzo, v.modello, v.codice_telaio, v.kw, v.colore, v.marchio, v.admin_CF "
						+ " FROM veicolo as v WHERE (v.Targa) NOT IN(SELECT v1.Targa"
						+ " FROM veicolo as v1, acquistato as a" + " WHERE v1.Targa = a.acquistato_veicolo_TARGA) "
						+ " GROUP BY(v.Targa);");

		while (rs.next()) {

			String targa = rs.getString(1);
			double prezzo = rs.getDouble(2);
			String modello = rs.getString(3);
			String codice_telaio = rs.getString(4);
			int kw = rs.getInt(5);
			String colore = rs.getString(6);
			String marchio = rs.getString(7);
			String adminCF = rs.getString(8);

			n += "TARGA= " + targa + " PREZZO= " + prezzo + " MODELLO= " + modello + " CODICE TELAIO= " + codice_telaio + " KW= " + kw
					+ " COLORE= " + colore + " MARCHIO= " + marchio + " CODICE FISCALE ADMIN= " + adminCF + "\n\n";
		}

		return n;
	}

	/* OPERAZIONE 9 */
	public String operazione9() throws SQLException {

		String n = "";
		Statement stmt = conn.createStatement();

		// esegue la query
		ResultSet rs = stmt.executeQuery(
				"SELECT r.veicolo_TARGA  from riparazione as r,ricambio_info as ri WHERE r.Codice=ri.riparazione_CODICE "
						+ "group by r.veicolo_TARGA having COUNT(ri.riparazione_CODICE)> 2 ");

		while (rs.next()) {

			String veicolo_Targa = rs.getString(1);

			n += "TARGA VEICOLO = " + veicolo_Targa + "\n\n";
		}

		return n;
	}

	/* OPERAZIONE 10 */
	public String operazione10() throws SQLException {
		String n = "";
		Statement stmt = conn.createStatement();
		// esegue la query
		ResultSet rs = stmt.executeQuery(
				"Select v.Targa,v.modello,v.marchio,v.colore,v.codice_telaio " + "from veicolo as v,riparazione as r "
						+ "WHERE v.Targa=r.veicolo_TARGA AND (r.data_fine BETWEEN '2022-12-20' AND '2023-02-27' )");

		while (rs.next()) {

			String targa = rs.getString(1);
			String modello = rs.getString(2);
			String marchio = rs.getString(3);
			String colore = rs.getString(4);
			String codice_telaio = rs.getString(5);

			n += "TARGA= " + targa + " MODELLO= " + modello + " MARCHIO= " + marchio + " COLORE= " + colore
					+ " CODICE TELAIO= " + codice_telaio + "\n\n";
		}

		return n;
	}

	/* OPERAZIONE 11 */
	public void operazione11(String acquistato_cliente_CF, String acquistato_veicolo_TARGA) throws SQLException {

		Statement st = conn.createStatement();

		st.execute("INSERT INTO acquistato(acquistato_cliente_CF,acquistato_veicolo_TARGA)" + "VALUES ('"
				+ acquistato_cliente_CF + "', " + "'" + acquistato_veicolo_TARGA + "');");

		st.close();

	}

	/* OPERAZIONE 12 */
	public String operazione12(String cfAdmin) throws SQLException {
		String n = "";

		Statement stmt = conn.createStatement();

		// esegue la query
		ResultSet rs = stmt.executeQuery("Select v.Targa,v.modello,v.marchio,v.colore,v.codice_telaio "
				+ "from veicolo as v, admin as a,acquistato as ac,cliente as c " + "where a.CF= '" + cfAdmin
				+ "' and a.CF=v.admin_CF and v.colore='rosso' and ac.acquistato_cliente_CF=c.CF "
				+ "and c.nome='Marco' " + " AND ac.acquistato_veicolo_TARGA = v.Targa");

		while (rs.next()) {

			String targa = rs.getString(1);
			String modello = rs.getString(2);
			String marchio = rs.getString(3);
			String colore = rs.getString(4);
			String codice_telaio = rs.getString(5);

			n += "TARGA= " + targa + " MODELLO= " + modello + " MARCHIO= " + marchio + " COLORE= " + colore
					+ " CODICE TELAIO= " + codice_telaio + "\n\n";

		}

		return n;

	}
	
	/* OPERAZIONE 13 */ 
	public void operazione13(String CF, String nome, String cognome, String targa, float prezzo, String modello, String codice_telaio, int kw, String colore,
			String marchio, String admin_CF, int sconto, int numero_passegeri, String auto_veicolo_TARGA) throws SQLException {

			Statement st = conn.createStatement();

			st.execute(
					"INSERT INTO admin (CF, nome, cognome)"
							+ "VALUES ('" + CF + "', '" + nome + "', '" + cognome + "');");
			
			st.execute("INSERT INTO veicolo (Targa, prezzo, modello, codice_telaio, kw, colore, marchio, admin_CF)"
					+ "VALUES ('" + targa + "', '" + prezzo + "', '" + modello + "', '" + codice_telaio + "', '" + kw
					+ "', '" + colore + "', '" + marchio + "', '" + admin_CF + "');");
			
			st.execute("INSERT INTO auto(sconto,numero_passegeri,auto_veicolo_TARGA)" + "VALUES ('" + sconto + "', '"
					+ numero_passegeri + "', '" + auto_veicolo_TARGA + "');");
			
			
			st.close();

		}
	
	public void operazione14(String numero_telefono, String nome, int codice) throws SQLException {
		Statement st = conn.createStatement();
		
		st.execute("INSERT INTO officina(numero_telefono,nome,Codice)" + "VALUES ('" + numero_telefono + "',  '" + nome
				+ "', '" + codice + "');");
		st.close();
	}
	
	/* OPERAZIONE 15 */
	public String operazione15() throws SQLException {
		String n = "";

		Statement stmt = conn.createStatement();

		// esegue la query
		ResultSet rs = stmt.executeQuery(
				"SELECT c.CF, c.sesso, c.nome, c.cognome, c.indirizzo, c.città, c.data_di_nascita "
						+ "FROM cliente as c ORDER BY c.nome ASC; ");

		while (rs.next()) {

			String codice_fiscale = rs.getString(1);
			String sesso = rs.getString(2);
			String nome = rs.getString(3);
			String cognome = rs.getString(4);
			String indirizzo = rs.getString(5);
			String citta = rs.getString(6);
			Date data_di_nascita = rs.getDate(7);

			n += "CODICE FISCALE= " + codice_fiscale + " SESSO= " + sesso + " NOME= " + nome + " COGNOME= " + cognome + " INDIRIZZO= " 
			+ indirizzo + " CITTA'= " + citta +  " DATA DI NASCITA= " + data_di_nascita + "\n\n";

		}

		return n;
	}
	
	/* OPERAZIONE 16 */
	public String operazione16() throws SQLException {
		
		String n = "";

		Statement stmt = conn.createStatement();

		// esegue la query
		ResultSet rs = stmt.executeQuery("SELECT v.Targa, v.prezzo, v.modello, v.codice_telaio, v.kw, v.colore, v.marchio, v.admin_CF"
				+ " FROM veicolo as v, auto as a, usato as u, ha_avuto as h"
				+ " WHERE a.auto_veicolo_TARGA = u.usato_auto_veicolo_TARGA AND v.Targa = a.auto_veicolo_TARGA AND u"
				+ ".usato_auto_veicolo_TARGA = h.usato_auto_veicolo_TARGA "
				+ "GROUP BY v.Targa "
				+ "HAVING COUNT(h.usato_auto_veicolo_TARGA) < 5 ");
		
		while (rs.next()) {

			String targa = rs.getString(1);
			double prezzo = rs.getDouble(2);
			String modello = rs.getString(3);
			String codice_telaio = rs.getString(4);
			int kw = rs.getInt(5);
			String colore = rs.getString(6);
			String marchio = rs.getString(7);
			String adminCF = rs.getString(8);

			n += "TARGA= " + targa + " PREZZO= " + prezzo + " MODELLO= " + modello + " CODICE TELAIO= " + codice_telaio + " KW= " + kw
					+ " COLORE= " + colore + " MARCHIO= " + marchio + " CODICE FISCALE ADMIN= " + adminCF + "\n\n";
		}

		return n;
		
	}
	
	/* OPERAZIONE 17 */
	public String operazione17(int numero) throws SQLException {
		
		String n = "";

		Statement stmt = conn.createStatement();
		
		// esegue la query
				ResultSet rs = stmt.executeQuery("SELECT v.Targa, v.prezzo, v.modello, v.codice_telaio, v.kw, v.colore, v.marchio, v.admin_CF "
						+ "FROM veicolo as v, auto as a " + "where a.numero_passegeri > '" + numero
						+ "' and v.Targa = a.auto_veicolo_TARGA; ");
				
				while (rs.next()) {

					String targa = rs.getString(1);
					double prezzo = rs.getDouble(2);
					String modello = rs.getString(3);
					String codice_telaio = rs.getString(4);
					int kw = rs.getInt(5);
					String colore = rs.getString(6);
					String marchio = rs.getString(7);
					String adminCF = rs.getString(8);

					n += "TARGA= " + targa + " PREZZO= " + prezzo + " MODELLO= " + modello + " CODICE TELAIO= " + codice_telaio + " KW= " + kw
							+ " COLORE= " + colore + " MARCHIO= " + marchio + " CODICE FISCALE ADMIN= " + adminCF + "\n\n";
				}

				return n;
	}
	
	/* OPERAZIONE 18 */
	public String operazione18(int sconto) throws SQLException {
		
		String n = "";

		Statement stmt = conn.createStatement();
		
		// esegue la query
				ResultSet rs = stmt.executeQuery("SELECT v.Targa, v.prezzo, v.modello, v.codice_telaio, v.kw, v.colore, v.marchio, v.admin_CF "
						+ "FROM veicolo as v, auto as a " + "where a.sconto > '" + sconto
						+ "' and v.Targa = a.auto_veicolo_TARGA; ");
				
				while (rs.next()) {

					String targa = rs.getString(1);
					double prezzo = rs.getDouble(2);
					String modello = rs.getString(3);
					String codice_telaio = rs.getString(4);
					int kw = rs.getInt(5);
					String colore = rs.getString(6);
					String marchio = rs.getString(7);
					String adminCF = rs.getString(8);

					n += "TARGA= " + targa + " PREZZO= " + prezzo + " MODELLO= " + modello + " CODICE TELAIO= " + codice_telaio + " KW= " + kw
							+ " COLORE= " + colore + " MARCHIO= " + marchio + " CODICE FISCALE ADMIN= " + adminCF + "\n\n";
				}

				return n;
	}
	
	/* OPERAZIONE 19 */
	public String operazione19() throws SQLException {
		
		Statement stmt = conn.createStatement();
		String n = "";
		// esegue la query
		ResultSet rs = stmt.executeQuery(
				"SELECT c.CF, c.nome, c.cognome, c.sesso, c.indirizzo, c.città, c.data_di_nascita "
						+ "FROM cliente as c, acquistato as a"
						+ " WHERE c.CF = a.acquistato_cliente_CF"
						+ " GROUP BY c.CF"
						+ " HAVING COUNT(a.acquistato_cliente_CF) >= 2;");

		while (rs.next()) {

			String codice_fiscale = rs.getString(1);
			String nome = rs.getString(2);
			String cognome = rs.getString(3);
			String sesso = rs.getString(4);
			String indirizzo = rs.getString(5);
			String citta = rs.getString(6);
			Date data_di_nascita = rs.getDate(7);

			n += "CODICE FISCALE= " + codice_fiscale + " NOME= " + nome + " COGNOME= " + cognome + " SESSO= " + sesso + " INDIRIZZO= " 
			+ indirizzo + " CITTA'= " + citta +  " DATA DI NASCITA= " + data_di_nascita + "\n\n";

		}

		return n;
	}
	
	/* OPERAZIONE 20 */
	public String operazione20(String marchio) throws SQLException {
		
		String n = "";

		Statement stmt = conn.createStatement();
		
		// esegue la query
				ResultSet rs = stmt.executeQuery("SELECT v.Targa, v.prezzo, v.modello, v.codice_telaio, v.kw, v.colore, v.marchio, v.admin_CF "
						+ "FROM veicolo as v, auto as a, usato as u, ha_avuto as h " 
						+ "WHERE a.auto_veicolo_TARGA = u.usato_auto_veicolo_TARGA AND v.Targa = a.auto_veicolo_TARGA "
						+ " AND u.usato_auto_veicolo_TARGA = h.usato_auto_veicolo_TARGA AND a.auto_veicolo_TARGA = v.Targa "
						+ "AND v.marchio = '" + marchio
						+ "' GROUP BY v.Targa "
						+ "HAVING COUNT(h.usato_auto_veicolo_TARGA) >= 2; ");
				
				while (rs.next()) {

					String targa = rs.getString(1);
					double prezzo = rs.getDouble(2);
					String modello = rs.getString(3);
					String codice_telaio = rs.getString(4);
					int kw = rs.getInt(5);
					String colore = rs.getString(6);
					String marchiol = rs.getString(7);
					String adminCF = rs.getString(8);

					n += "TARGA= " + targa + " PREZZO= " + prezzo + " MODELLO= " + modello + " CODICE TELAIO= " + codice_telaio + " KW= " + kw
							+ " COLORE= " + colore + " MARCHIO= " + marchiol + " CODICE FISCALE ADMIN= " + adminCF + "\n\n";
				}

				return n;
		
	}
	
	public void operazione21(String numero_telefono, String codice_fiscale) throws SQLException {
		Statement st = conn.createStatement();
		
		st.execute("DELETE FROM telefono as t WHERE t.Numero= '" + numero_telefono + "' and t.cliente_CF = '" + codice_fiscale
				 + "';");
		st.close();
	}
	
	public String controllo(String codice_fiscale) throws SQLException {
		
		String n = "";
		
		Statement stmt = conn.createStatement();
		// esegue la query
				ResultSet rs = stmt.executeQuery(
						"SELECT a.cf from admin as a WHERE a.CF = '"
								+ codice_fiscale + "'; ");

				while (rs.next()) {

					String codice = rs.getString(1);

					n += codice;
				}

		return n;
	}
	
}


