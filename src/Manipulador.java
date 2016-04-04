
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;




public class Manipulador {
	
	private static String path = "../desafio_02/";
	static int totalChrome = 0;
	static int totalSafari = 0;
	static int totalFirefox = 0;
	static int totalMsie = 0;
	static int totalWindows = 0;
	static int totalMac = 0;
	static int totalLinux = 0;
	static String ip;
	static LocalDateTime absoluteDate;
	static int totalBanda = 0;
	static String typeFile;
	static String nomeNavegador;
	static String nomeNavegadorComp;
	static String nomeSo;
	static ArrayList<Acesso> listaGeralAcessos = new ArrayList<Acesso>();
	static ArrayList<Acesso> navegadores = new ArrayList<Acesso>();
	static ArrayList<Acesso> sistemas = new ArrayList<Acesso>();
	static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss").withLocale(Locale.ENGLISH);
	
	public List<Path> leitorDeArquivo() throws IOException{
		return Files.list(new File(path).toPath())
	        .filter(arquivo -> arquivo.toFile().isFile())
	        .filter(arquivo -> arquivo.toFile().getAbsolutePath().endsWith(".log"))
	        .collect(Collectors.toList());
	
	}
	public void lerLinha(String linha) {
		String[] campos = linha.split(" - - ");
		if(campos[1].contains("200") && campos[1].contains(".docx")){
			typeFile = "docx";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".txt")){
			typeFile = "txt";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".csv")){
			typeFile = "csv";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".png")){
			typeFile = "png";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".jpg")){
			typeFile = "jpg";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".gif")){
			typeFile = "gif";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".css")){
			typeFile = "css";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".js")){
			typeFile = "js";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}else if(campos[1].contains("200") && campos[1].contains(".i")){
			typeFile = "i";
			String[] getIp = campos[0].split(" - ");
			if(getIp[1].length() > 15){
				String[] getLastIp = getIp[1].split(", ");
				ip = getLastIp[1];
			}else{
				ip = getIp[1];
			}
			
			String[] getDate = campos[1].substring(1, 21).split("-0300] ");
			absoluteDate = LocalDateTime.parse(getDate[0], formatter);
			
			
			String[] getBand = campos[1].split(" ");
			if(campos[1].contains("Windows")){
				nomeSo = "Windows";
				totalWindows++;
				if(campos[1].contains("Chrome")){
					nomeNavegador = "Chrome/Safari";
					totalChrome++;
					totalSafari++;
				}else if(campos[1].contains("Msie")){
					nomeNavegador = "MSIE";
					totalMsie++;
				}else if (campos[1].contains("Firefox")){
					nomeNavegador = "Firefox";
					totalFirefox++;
				}
			}else if(campos[1].contains("Mac")){
				nomeSo = "Mac";
				nomeNavegador = "Safari";
				totalMac++;
				totalSafari++;
			}else if(campos[1].contains("Linux")){
				nomeSo = "Linux";
				nomeNavegador = "Safari";
				totalSafari++;
				totalLinux++;
			}
			
			listaGeralAcessos.add(new Acesso(ip, absoluteDate, typeFile.toUpperCase(), Integer.parseInt(getBand[6]), nomeSo, nomeNavegador));
		}
			
		
		
		for (Acesso acesso : listaGeralAcessos) {
//			System.out.println("IP: " + acesso.getLastIpAcces());
//			System.out.println("Data: " + acesso.getDataTime());
//			System.out.println("Tipo de arquivo: " + acesso.getTypeFile());
//			System.out.println("Banda Consumida: " + acesso.getBandwidth());
//			System.out.println("S.O: : " + acesso.getSysOp());
//			System.out.println("Navegador: " + acesso.getNavegador());
//			System.out.println("-------------------------------------------");
			System.out.println(totalWindows);
		}
	}
	
}

