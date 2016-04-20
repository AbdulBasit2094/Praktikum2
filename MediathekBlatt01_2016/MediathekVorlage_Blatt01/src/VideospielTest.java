import static org.junit.Assert.*;

import org.junit.Test;

public class VideospielTest
{
   
    private static final String KOMMENTAR = "Kommentar";
    private static final String TITEL = "Titel";
    private static final String BEZEICHNUNG = "Videospiel";
    private static final String SYSTEM = "KONSOLE";
   
 
    private Videospiel _videospiel1;
    private Videospiel _videospiel2;

    public VideospielTest()
    {
        _videospiel1 = getMedium();
        _videospiel2 = getMedium();
    }

    @Test
    public void testGetMedienBezeichnung()
    {
        String videospielBezeichnung = BEZEICHNUNG;
        assertEquals(videospielBezeichnung, _videospiel1.getMedienBezeichnung());
    }

    @Test
    public void testKonstruktor()
    {
        assertEquals(TITEL, _videospiel1.getTitel());
        assertEquals(KOMMENTAR, _videospiel1.getKommentar());
        assertEquals(SYSTEM, _videospiel1.getSystem());
    }

    @Test
    /*
     * Von ein und dem selben Videspiel kann es mehrere Exemplare geben, die von
     * unterschiedlichen Personen ausgeliehen werden können.
     */
    public void testEquals()
    {
        assertFalse("Mehrere Exemplare der gleichen Spiele sind ungleich",
                _videospiel1.equals(_videospiel2));
        assertTrue("Dasselbe Exemplare des gleichen Spiels ist gleich",
                _videospiel1.equals(_videospiel1));
    }

    private Videospiel getMedium()
    {
        return new Videospiel(TITEL, KOMMENTAR,SYSTEM);
    }

}