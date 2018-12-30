package rpggame;
import java.util.*;

/**
 * @author Darragh O'Connor
 */
final class Menu {
  public void display_menu() {
    System.out.println ( "1) Fight! \n2) Go for it! \n3) Run Away" );
    System.out.print ( "Choose Your Fate: " );
  }
  
  public Menu() {
    Scanner in = new Scanner ( System.in );
    
    display_menu();
    switch ( in.nextInt() ) {
      case 1:
        System.out.println ( "On to Adventure!! " );
        break;
      case 2:
        System.out.println ( "Onward Hero!!" );
        break;
      case 3:
        System.out.println ( "You are a coward! You're still goina fight! " );
        break;
      default:
        System.err.println ( "Unrecognized option" );
        break;
    }
  }
  
}