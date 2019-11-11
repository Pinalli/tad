package br.com.pinalli.game;
/**
 *
 * @author AlbertoRochaPinalli
 */
public class MainTorre {
    public static void main(String[] args) {
      
	java.awt.EventQueue.invokeLater(() -> {
            new TelaPRINCIPAL().setVisible(true);
        });
        try {
	    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
		if ("Nimbus".equals(info.getName())) {
		    javax.swing.UIManager.setLookAndFeel(info.getClassName());
		    break;
		}
	    }
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(TelaPRINCIPAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
    }
}
