class Videospiel implements Medium
{
	/**
	 * Ein Kommentar zum Medium.
	 */
	private String _kommentar;
	/**
	 * Der Titel des Mediums.
	 */
	private String _titel;
	/**
	 * Die system auf der das Videospiel benutzt werden kann.
	 */
	private String _system;
	/**
	 * Initialisiert eine neues Videospiel mit den gegebenen Daten.
	 * 
	 * @param titel
	 *            Der Titel des Videospiel.
	 * @param kommentar
	 *            Ein Kommentar zu deVideospiel.
	 * 
	 * 
	 * @require titel != null
	 * @require kommentar != null
	 * 
	 * 
	 * @ensure getTitel() == titel
	 * @ensure getKommentar() == kommentar
	 */
	public Videospiel(String titel, String kommentar , String system)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		assert  system != null : "Vorbedingung verletzt: system != null";
		_titel = titel;
		_kommentar = kommentar;
		_system = system;
	}
	@Override
	public String getKommentar()
	{
		return _kommentar;
	}
	@Override
	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}
	@Override
	public String getTitel()
	{
		return _titel;
	}
	
	public String getSystem()
	{
		return _system;
	}
	@Override
    public String getFormatiertenString()
    {
		String foramtierterString = getMedienBezeichnung()+"\n"+getTitel()"\n"+getSystem()+"\n"+
									getKommentar();
		return formatierterString;
    }
}
