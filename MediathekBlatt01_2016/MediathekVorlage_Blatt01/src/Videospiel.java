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
	 * Die konsole auf der das Videospiel benutzt werden kann.
	 */
	private String _konsole;
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
	public Videospiel(String titel, String kommentar , String konsole)
	{
		assert titel != null : "Vorbedingung verletzt: titel != null";
		assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
		assert konsole != null : "Vorbedingung verletzt: Platform != null";
		_titel = titel;
		_kommentar = kommentar;

	}

	public String getKommentar()
	{
		return _kommentar;
	}

	public String getMedienBezeichnung()
	{
		return "Videospiel";
	}

	public String getTitel()
	{
		return _titel;
	}

}
