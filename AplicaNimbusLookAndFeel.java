
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


class AplicaNimbusLookAndFeel {
       public static void pegaNimbus() {
            try {  
                
                UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
            } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
}
