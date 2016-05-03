package pt.bucho.utilities.geopt;

/**
 * There are 18 districts (English: counties) and two autonomous regions.
 * 
 * @author Pedro Bucho
 *
 */
public enum District {
	
	AVEIRO(Region.MAINLAND),
	BEJA(Region.MAINLAND),
	BRAGA(Region.MAINLAND),
	BRAGANCA(Region.MAINLAND),
	CASTELO_BRANCO(Region.MAINLAND),
	COIMBRA(Region.MAINLAND),
	EVORA(Region.MAINLAND),
	FARO(Region.MAINLAND),
	GUARDA(Region.MAINLAND),
	LEIRIA(Region.MAINLAND),
	LISBOA(Region.MAINLAND),
	PORTALEGRE(Region.MAINLAND),
	PORTO(Region.MAINLAND),
	SANTAREM(Region.MAINLAND),
	SETUBAL(Region.MAINLAND),
	VIANA_DO_CASTELO(Region.MAINLAND),
	VILA_REAL(Region.MAINLAND),
	VISEU(Region.MAINLAND),
	MADEIRA_AR(Region.MADEIRA),
	AZORES_AR(Region.AZORES);
	
	private final Region region;
	
	private District(Region region) {
		this.region = region;
	}
	
	/**
	 * Returns the region where this district is located.
	 * 
	 * @return region
	 */
	public Region getRegion() {
		return region;
	}

}
