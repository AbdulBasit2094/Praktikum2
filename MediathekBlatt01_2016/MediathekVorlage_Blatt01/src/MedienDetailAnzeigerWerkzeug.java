import java.util.Collection;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * Ein MedienDetailAnzeigerWerkzeug ist ein Werkzeug um die Details von Medien
 * anzuzeigen.
 * 
 * @author SE2-Team, PM2-Team
 * @version SoSe 2016
 */
class MedienDetailAnzeigerWerkzeug
{
	private MedienDetailAnzeigerUI _ui;

	/**
	 * Initialisiert ein neues MedienDetailAnzeigerWerkzeug.
	 */
	public MedienDetailAnzeigerWerkzeug()
	{
		_ui = new MedienDetailAnzeigerUI();
	}

	/**
	 * Setzt die Liste der Medien deren Details angezeigt werden sollen.
	 * 
	 * @param medien
	 *            Eine Liste von Medien.
	 * 
	 * @require (medien != null)
	 */
	public void setMedien(List<Medium> medien)
	{
		assert medien != null : "Vorbedingung verletzt: (medien != null)";

		String s="\n";
		for(Medium inhalt: medien)
		{
			JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
			selectedMedienTextArea.setText(s = s +inhalt.getFormatiertenString()+"\n");
			
//			if(inhalt instanceof CD)
//			{
//				JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//				selectedMedienTextArea.setText(s = s +inhalt.getFormatiertenString()+"\n");
//				
//				
//			
//			}
//			else if(inhalt instanceof DVD)
//			{
//				JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//				selectedMedienTextArea.setText(s = s +inhalt.getFormatiertenString()+"\n");
//			}
//			else
//			{
//				if (inhalt instanceof Videospiel)
//				{
//					JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//					selectedMedienTextArea.setText(s = s +inhalt.getFormatiertenString()+"\n");
//				}
//			}
//			
//			JTextArea selectedMedienTextArea = _ui.getMedienAnzeigerTextArea();
//			selectedMedienTextArea.setText(s);
		}
	}
	

	




	/**
	 * Gibt das Panel dieses Subwerkzeugs zurück.
	 * 
	 * @ensure result != null
	 */
	public JPanel getUIPanel()
	{
		return _ui.getUIPanel();
	}
}
