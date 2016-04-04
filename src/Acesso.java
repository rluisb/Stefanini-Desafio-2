import java.time.LocalDateTime;

public class Acesso {
	
	private String lastIpAcces;
	private LocalDateTime dataTime;
	private String typeFile;
	private int bandwidth;
	private String sysOp;
	private String navegador;

	public Acesso(String lastIpAcces, LocalDateTime dataTime, String typeFile, int bandwidth, String sysOp,
			String navegador) {
		this.lastIpAcces = lastIpAcces;
		this.dataTime = dataTime;
		this.typeFile = typeFile;
		this.bandwidth = bandwidth;
		this.sysOp = sysOp;
		this.navegador = navegador;
	}

	public String getLastIpAcces() {
		return lastIpAcces;
	}

	public void setLastIpAcces(String lastIpAcces) {
		this.lastIpAcces = lastIpAcces;
	}

	public LocalDateTime getDataTime() {
		return dataTime;
	}

	public void setDataTime(LocalDateTime dataTime) {
		this.dataTime = dataTime;
	}

	public String getTypeFile() {
		return typeFile;
	}

	public void setTypeFile(String typeFile) {
		this.typeFile = typeFile;
	}

	public int getBandwidth() {
		return bandwidth;
	}

	public void setBandwidth(int bandwidth) {
		this.bandwidth = bandwidth;
	}

	public String getSysOp() {
		return sysOp;
	}

	public void setSysOp(String sysOp) {
		this.sysOp = sysOp;
	}

	public String getNavegador() {
		return navegador;
	}

	public void setNavegador(String navegador) {
		this.navegador = navegador;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	
	
	

	
	
	
	

	
	
	
	
	
	
	
}
