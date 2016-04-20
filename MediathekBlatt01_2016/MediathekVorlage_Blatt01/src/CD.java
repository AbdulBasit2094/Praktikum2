import javax.swing.JTextArea;

/**
 * Eine CD ist ein Medium. Zusätzlich zu den Eigenschaften eines Mediums erfasst
 * sie Informationen zu Spiellänge und Interpret.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2016
 */
class CD implements Medium
{
    /**
     * Der Interpret der CD
     */
    private String _interpret;

    /**
     * Die Spiellänge der CD in Minuten
     */
    private int _spiellaenge;

    /**
     * Ein Kommentar zum Medium
     */
    private String _kommentar;

    /**
     * Der Titel des Mediums
     * 
     */
    private String _titel;

    /**
     * Initialisiert ein neues Exemplar.
     * 
     * @param titel Der Titel der CD
     * @param kommentar Ein Kommentar zu der CD
     * @param interpret Der Interpret der CD
     * @param spiellaenge Die Spiellaenge der CD in Minuten
     * 
     * @require titel != null
     * @require kommentar != null
     * @require interpret != null
     * @require spiellaenge > 0
     * 
     * @ensure getTitel() == titel
     * @ensure getKommentar() == kommentar
     * @ensure getInterpret() == interpret
     * @ensure getSpiellaenge() == spiellaenge
     */
    public CD(String titel, String kommentar, String interpret, int spiellaenge)
    {
        assert titel != null : "Vorbedingung verletzt: titel != null";
        assert kommentar != null : "Vorbedingung verletzt: kommentar != null";
        assert interpret != null : "Vorbedingung verletzt: interpret != null";
        assert spiellaenge > 0 : "Vorbedingung verletzt: spiellaenge > 0";
        _titel = titel;
        _kommentar = kommentar;
        _spiellaenge = spiellaenge;
        _interpret = interpret;
    }

    /**
     * Gibt den Interpreten der CD zurück.
     * 
     * @return Den Interpreten der CD.
     * 
     * @ensure result != null
     */
    public String getInterpret()
    {
        return _interpret;
    }

    @Override
    public String getMedienBezeichnung()
    {
        return "CD";
    }

    /**
     * Gibt die Spiellänge (in Minuten) der CD zurück.
     * 
     * @return Die Spiellänge der CD.
     * 
     * @ensure result > 0
     */
    public int getSpiellaenge()
    {
        return _spiellaenge;
    }

    @Override
    public String getKommentar()
    {
        return _kommentar;
    }

    public String getFormatiertenString()
    {
    	
    	String neu = "Interpreter: "+getInterpret()+"\n"+getMedienBezeichnung()+"\n"+ "Spiellänge: "+getSpiellaenge()+"\n"+getKommentar()+"\n";
    	
     return neu;
    	
//    	String s="\n";
//		for(Medium inhalt: medien)
//		{
//			
//			if(inhalt instanceof CD)
//			{
//				JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//				selectedMedienTextArea.setText("Interpreter: " + ((CD) inhalt).getInterpret()+"\n"+
//											   "Spiellänge: "  + ((CD) inhalt).getSpiellaenge()+"\n"+
//											   "" + ((CD) inhalt).getTitel()+"\n"
//											   );
//				s = s +   ("-------CD--------\n"+
//							"Interpreter: " + ((CD) inhalt).getInterpret()+"\n"+
//						   "Spiellänge: "  + ((CD) inhalt).getSpiellaenge()+"\n"+
//						   "" + ((CD) inhalt).getTitel()+"\n\n"
//						   );
//				
//			}
//			else if(inhalt instanceof DVD)
//			{
//				JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//				selectedMedienTextArea.setText("Laufzeit: " + ((DVD) inhalt).getLaufzeit()+"\n"+
//											   "Kommentar: "  + ((DVD) inhalt).getKommentar()+"\n"+
//											   "Titel: " + ((DVD) inhalt).getTitel()+"\n"
//											   );
//				s = s +   ("-------DVD--------\n"+
//						   "Laufzeit: " + ((DVD) inhalt).getLaufzeit()+"\n"+
//						   "Kommentar: "  + ((DVD) inhalt).getKommentar()+"\n"+
//						   "Titel: " + ((DVD) inhalt).getTitel()+"\n\n"
//						   );
//				
//			}
//			else
//			{
//				System.out.println("häääää");
//			}
//			JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//			selectedMedienTextArea.setText(s);
//    	
//    	return "";
}
    @Override
    public String getTitel()
    {
        return _titel;
    }

}
