import java.util.*;
import java.util.concurrent.TimeoutException;
import com.github.koraktor.steamcondenser.*;
import com.github.koraktor.steamcondenser.exceptions.SteamCondenserException;
import com.github.koraktor.steamcondenser.steam.SteamPlayer;
import com.github.koraktor.steamcondenser.steam.servers.GoldSrcServer;
import io.github.cdimascio.dotenv.Dotenv;



public class kicker	{
/*
 * HLTV Kicker Version 5.9
 * 10/15/2025
 * Swapped to .env with Dot.env for push to git
 */
	//#region New York
	public static String KTP_NY1 = "";
	public static String KTP_NY1_HLTV = "";
	public static String KTP_NY1_HLTVNAME = "";
	public static String KTP_NY1_PASSWORD = "";
	public static String KTP_NY1_RCON = "";

	public static String KTP_NY2 = "";
	public static String KTP_NY2_HLTV = "";
	public static String KTP_NY2_HLTVNAME = "";
	public static String KTP_NY2_PASSWORD = "";
	public static String KTP_NY2_RCON = "";

	public static String MTP_NY = "";
	public static String MTP_NY_HLTV = "";
	public static String MTP_NY_HLTVNAME = "";
	public static String MTP_NY_PASSWORD = "";
	public static String MTP_NY_RCON = "";

	public static String THUNDER_NY = "";
	public static String THUNDER_NY_HLTV = "";
	public static String THUNDER_NY_HLTVNAME = "";
	public static String THUNDER_NY_PASSWORD = "";
	public static String THUNDER_NY_RCON = "";

	public static String WASHEDUP_NY = "";
	public static String WASHEDUP_NY_HLTV = "";
	public static String WASHEDUP_NY_HLTVNAME = "";
	public static String WASHEDUP_NY_PASSWORD = "";
	public static String WASHEDUP_NY_RCON = "";
	//#endregion

	//#region Chicago
	public static String KTP_CHI1 = "";
	public static String KTP_CHI1_HLTV = "";
	public static String KTP_CHI1_HLTVNAME = "";
	public static String KTP_CHI1_PASSWORD = "";
	public static String KTP_CHI1_RCON = "";

	public static String MTP_CHI = "";
	public static String MTP_CHI_HLTV = "";
	public static String MTP_CHI_HLTVNAME = "";
	public static String MTP_CHI_PASSWORD = "";
	public static String MTP_CHI_RCON = "";

	public static String THUNDER_CHI = "";
	public static String THUNDER_CHI_HLTV = "";
	public static String THUNDER_CHI_HLTVNAME = "";
	public static String THUNDER_CHI_PASSWORD = "";
	public static String THUNDER_CHI_RCON = "";
	//#endregion

	//#region Dallas
	public static String KTP_DAL1 = "";
	public static String KTP_DAL1_HLTV = "";
	public static String KTP_DAL1_HLTVNAME = "";
	public static String KTP_DAL1_PASSWORD = "";
	public static String KTP_DAL1_RCON = "";

	public static String NEIN_DAL = "";
	public static String NEIN_DAL_HLTV = "";
	public static String NEIN_DAL_HLTVNAME = "";
	public static String NEIN_DAL_PASSWORD = "";
	public static String NEIN_DAL_RCON = "";

	public static String ICYHOT_DAL = "";
	public static String ICYHOT_DAL_HLTV = "";
	public static String ICYHOT_DAL_HLTVNAME = "";
	public static String ICYHOT_DAL_PASSWORD = "";
	public static String ICYHOT_DAL_RCON = "";

	public static String SHAKYTABLE_DAL = "";
	public static String SHAKYTABLE_DAL_HLTV = "";
	public static String SHAKYTABLE_DAL_HLTVNAME = "";
	public static String SHAKYTABLE_DAL_PASSWORD = "";
	public static String SHAKYTABLE_DAL_RCON = "";
	//#endregion

	//#region Atlanta
	public static String THREEH_ATL_PIFF = "";
	public static String THREEH_ATL_PIFF_HLTV = "";
	public static String THREEH_ATL_PIFF_HLTVNAME = "";
	public static String THREEH_ATL_PIFF_PASSWORD = "";
	public static String THREEH_ATL_PIFF_RCON = "";

	public static String IYCHOT_ATL = "";
	public static String IYCHOT_ATL_HLTV = "";
	public static String IYCHOT_ATL_HLTVNAME = "";
	public static String IYCHOT_ATL_PASSWORD = "";
	public static String IYCHOT_ATL_RCON = "";
	//#endregion

	//#region Los Angeles
	public static String CPRICE_LA = "";
	public static String CPRICE_LA_HLTV = "";
	public static String CPRICE_LA_HLTVNAME = "";
	public static String CPRICE_LA_PASSWORD = "";
	public static String CPRICE_LA_RCON = "";
	//#endregion

	public static void main(String args[]){
		Dotenv dotenv = Dotenv.load();

		//#region New York
		KTP_NY1             = dotenv.get("KTP_NY1");
		KTP_NY1_HLTV        = dotenv.get("KTP_NY1_HLTV");
		KTP_NY1_HLTVNAME    = dotenv.get("KTP_NY1_HLTVNAME");
		KTP_NY1_PASSWORD    = dotenv.get("KTP_NY1_PASSWORD");
		KTP_NY1_RCON        = dotenv.get("KTP_NY1_RCON");

		KTP_NY2             = dotenv.get("KTP_NY2");
		KTP_NY2_HLTV        = dotenv.get("KTP_NY2_HLTV");
		KTP_NY2_HLTVNAME    = dotenv.get("KTP_NY2_HLTVNAME");
		KTP_NY2_PASSWORD    = dotenv.get("KTP_NY2_PASSWORD");
		KTP_NY2_RCON        = dotenv.get("KTP_NY2_RCON");

		MTP_NY              = dotenv.get("MTP_NY");
		MTP_NY_HLTV         = dotenv.get("MTP_NY_HLTV");
		MTP_NY_HLTVNAME     = dotenv.get("MTP_NY_HLTVNAME");
		MTP_NY_PASSWORD     = dotenv.get("MTP_NY_PASSWORD");
		MTP_NY_RCON         = dotenv.get("MTP_NY_RCON");

		THUNDER_NY          = dotenv.get("THUNDER_NY");
		THUNDER_NY_HLTV     = dotenv.get("THUNDER_NY_HLTV");
		THUNDER_NY_HLTVNAME = dotenv.get("THUNDER_NY_HLTVNAME");
		THUNDER_NY_PASSWORD = dotenv.get("THUNDER_NY_PASSWORD");
		THUNDER_NY_RCON     = dotenv.get("THUNDER_NY_RCON");

		WASHEDUP_NY          = dotenv.get("WASHEDUP_NY");
		WASHEDUP_NY_HLTV     = dotenv.get("WASHEDUP_NY_HLTV");
		WASHEDUP_NY_HLTVNAME = dotenv.get("WASHEDUP_NY_HLTVNAME");
		WASHEDUP_NY_PASSWORD = dotenv.get("WASHEDUP_NY_PASSWORD");
		WASHEDUP_NY_RCON     = dotenv.get("WASHEDUP_NY_RCON");
		//#endregion

		//#region Chicago
		KTP_CHI1             = dotenv.get("KTP_CHI1");
		KTP_CHI1_HLTV        = dotenv.get("KTP_CHI1_HLTV");
		KTP_CHI1_HLTVNAME    = dotenv.get("KTP_CHI1_HLTVNAME");
		KTP_CHI1_PASSWORD    = dotenv.get("KTP_CHI1_PASSWORD");
		KTP_CHI1_RCON        = dotenv.get("KTP_CHI1_RCON");

		MTP_CHI              = dotenv.get("MTP_CHI");
		MTP_CHI_HLTV         = dotenv.get("MTP_CHI_HLTV");
		MTP_CHI_HLTVNAME     = dotenv.get("MTP_CHI_HLTVNAME");
		MTP_CHI_PASSWORD     = dotenv.get("MTP_CHI_PASSWORD");
		MTP_CHI_RCON         = dotenv.get("MTP_CHI_RCON");

		THUNDER_CHI          = dotenv.get("THUNDER_CHI");
		THUNDER_CHI_HLTV     = dotenv.get("THUNDER_CHI_HLTV");
		THUNDER_CHI_HLTVNAME = dotenv.get("THUNDER_CHI_HLTVNAME");
		THUNDER_CHI_PASSWORD = dotenv.get("THUNDER_CHI_PASSWORD");
		THUNDER_CHI_RCON     = dotenv.get("THUNDER_CHI_RCON");
		//#endregion

		//#region Dallas
		KTP_DAL1             = dotenv.get("KTP_DAL1");
		KTP_DAL1_HLTV        = dotenv.get("KTP_DAL1_HLTV");
		KTP_DAL1_HLTVNAME    = dotenv.get("KTP_DAL1_HLTVNAME");
		KTP_DAL1_PASSWORD    = dotenv.get("KTP_DAL1_PASSWORD");
		KTP_DAL1_RCON        = dotenv.get("KTP_DAL1_RCON");

		NEIN_DAL             = dotenv.get("NEIN_DAL");
		NEIN_DAL_HLTV        = dotenv.get("NEIN_DAL_HLTV");
		NEIN_DAL_HLTVNAME    = dotenv.get("NEIN_DAL_HLTVNAME");
		NEIN_DAL_PASSWORD    = dotenv.get("NEIN_DAL_PASSWORD");
		NEIN_DAL_RCON        = dotenv.get("NEIN_DAL_RCON");

		ICYHOT_DAL           = dotenv.get("ICYHOT_DAL");
		ICYHOT_DAL_HLTV      = dotenv.get("ICYHOT_DAL_HLTV");
		ICYHOT_DAL_HLTVNAME  = dotenv.get("ICYHOT_DAL_HLTVNAME");
		ICYHOT_DAL_PASSWORD  = dotenv.get("ICYHOT_DAL_PASSWORD");
		ICYHOT_DAL_RCON      = dotenv.get("ICYHOT_DAL_RCON");

		SHAKYTABLE_DAL       = dotenv.get("SHAKYTABLE_DAL");
		SHAKYTABLE_DAL_HLTV  = dotenv.get("SHAKYTABLE_DAL_HLTV");
		SHAKYTABLE_DAL_HLTVNAME = dotenv.get("SHAKYTABLE_DAL_HLTVNAME");
		SHAKYTABLE_DAL_PASSWORD = dotenv.get("SHAKYTABLE_DAL_PASSWORD");
		SHAKYTABLE_DAL_RCON  = dotenv.get("SHAKYTABLE_DAL_RCON");
		//#endregion

		//#region Atlanta
		THREEH_ATL_PIFF      = dotenv.get("THREEH_ATL_PIFF");
		THREEH_ATL_PIFF_HLTV = dotenv.get("THREEH_ATL_PIFF_HLTV");
		THREEH_ATL_PIFF_HLTVNAME = dotenv.get("THREEH_ATL_PIFF_HLTVNAME");
		THREEH_ATL_PIFF_PASSWORD = dotenv.get("THREEH_ATL_PIFF_PASSWORD");
		THREEH_ATL_PIFF_RCON = dotenv.get("THREEH_ATL_PIFF_RCON");

		IYCHOT_ATL           = dotenv.get("IYCHOT_ATL");
		IYCHOT_ATL_HLTV      = dotenv.get("IYCHOT_ATL_HLTV");
		IYCHOT_ATL_HLTVNAME  = dotenv.get("IYCHOT_ATL_HLTVNAME");
		IYCHOT_ATL_PASSWORD  = dotenv.get("IYCHOT_ATL_PASSWORD");
		IYCHOT_ATL_RCON      = dotenv.get("IYCHOT_ATL_RCON");
		//#endregion

		//#region Los Angeles
		CPRICE_LA            = dotenv.get("CPRICE_LA");
		CPRICE_LA_HLTV       = dotenv.get("CPRICE_LA_HLTV");
		CPRICE_LA_HLTVNAME   = dotenv.get("CPRICE_LA_HLTVNAME");
		CPRICE_LA_PASSWORD   = dotenv.get("CPRICE_LA_PASSWORD");
		CPRICE_LA_RCON       = dotenv.get("CPRICE_LA_RCON");
		//#endregion

		System.out.println(kill_all_hltv_servers());
		}
	
		public static String kill_all_hltv_servers() {
			String report = "--KICKING HLTV REPORT--\n";

			//#region New York Servers
			try{
				report += kill_hltv_server(KTP_NY1, KTP_NY1_RCON, KTP_NY1_HLTVNAME, KTP_NY1_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(KTP_NY2, KTP_NY2_RCON, KTP_NY2_HLTVNAME, KTP_NY2_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(MTP_NY, MTP_NY_RCON, MTP_NY_HLTVNAME, MTP_NY_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(THUNDER_NY, THUNDER_NY_RCON, THUNDER_NY_HLTVNAME, THUNDER_NY_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(WASHEDUP_NY, WASHEDUP_NY_RCON, WASHEDUP_NY_HLTVNAME, WASHEDUP_NY_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			//#endregion
			
			//#region Chicago Servers
			try{
				report += kill_hltv_server(KTP_CHI1, KTP_CHI1_RCON, KTP_CHI1_HLTVNAME, KTP_CHI1_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(MTP_CHI, MTP_CHI_RCON, MTP_CHI_HLTVNAME, MTP_CHI_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(THUNDER_CHI, THUNDER_CHI_RCON, THUNDER_CHI_HLTVNAME, THUNDER_CHI_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			//#endregion

			//#region Dallas Servers
			try{
				report += kill_hltv_server(KTP_DAL1, KTP_DAL1_RCON, KTP_DAL1_HLTVNAME, KTP_DAL1_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(NEIN_DAL, NEIN_DAL_RCON, NEIN_DAL_HLTVNAME, NEIN_DAL_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(ICYHOT_DAL, ICYHOT_DAL_RCON, ICYHOT_DAL_HLTVNAME, ICYHOT_DAL_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(SHAKYTABLE_DAL, SHAKYTABLE_DAL_RCON, SHAKYTABLE_DAL_HLTVNAME, SHAKYTABLE_DAL_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			//#endregion

			//#region Atlanta Servers
			try{
				report += kill_hltv_server(THREEH_ATL_PIFF, THREEH_ATL_PIFF_RCON, THREEH_ATL_PIFF_HLTVNAME, THREEH_ATL_PIFF_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			try{
				report += kill_hltv_server(IYCHOT_ATL, IYCHOT_ATL_RCON, IYCHOT_ATL_HLTVNAME, IYCHOT_ATL_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			//#endregion

			//#region Los Angeles Servers
			try{
				report += kill_hltv_server(CPRICE_LA, CPRICE_LA_RCON, CPRICE_LA_HLTVNAME, CPRICE_LA_PASSWORD);
				report += "\n";
			}
			catch (Exception ex){
				report += ex.getMessage();
				report += "\n";
			}
			//#endregion

			//#region Miami Servers
			//#endregion
			return report;
		}
	
	public static String kill_hltv_server(String serverIP, String rcon, String hltv, String password){
		try {
		GoldSrcServer server = new GoldSrcServer(serverIP);
		  hltv = " \"" + hltv + "\"";
		  server.rconAuth(rcon);
		  //bool f = server.isRconAuthenticated();
		  //server.rconExec("host_players_show" + " 1");
		  //System.out.println(server.getPlayers());
		  System.out.println(server.rconExec("say KTP_RCON KICKING HLTV"));
		  server.rconExec("kick" + hltv);
		  //System.out.println(server.rconExec("status"));
		  return "Successfully kicked " + hltv + "  on " + serverIP;
		}
		catch(SteamCondenserException ex) {
		  System.err.println("Could not authenticate with the game server.");
		  return "Failed to authenticate RCON, failed to kick HLTV on " + serverIP;
		}
		catch(TimeoutException ex) {
			System.err.println("Timed Out");
			return "Timed out, failed to kick HLTV on " + serverIP;
		}  
	}

	public static String change_map(String serverIP, String rcon, String hltv, String password){
		try {
		GoldSrcServer server = new GoldSrcServer(serverIP);
		  hltv = " \"" + hltv + "\"";
		  server.rconAuth(rcon);
		  //bool f = server.isRconAuthenticated();
		  server.rconExec("host_players_show" + " 1");
		  System.out.println(server.getPlayers());
		  System.out.println(server.rconExec("say KTP_RCON CHANGING MAP"));
		  server.rconExec("chankick" + hltv);
		  //System.out.println(server.rconExec("status"));
		  return "Successfully kicked HLTV on " + serverIP;
		}
		catch(SteamCondenserException ex) {
		  System.err.println("Could not authenticate with the game server.");
		  return "Failed to authenticate RCON, failed to kick HLTV on " + serverIP;
		}
		catch(TimeoutException ex) {
			System.err.println("Timed Out");
			return "Timed out, failed to kick HLTV on " + serverIP;
		  }  
	}
}