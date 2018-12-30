/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpggame;
import java.util.*;

/**
 * @author Darragh O'Connor
 */
final class bossMenu {
  public void display_menu() {
      
    System.out.println ( "Do you want to fight the boss with your strongest hero?!" );  
    System.out.println ( "1) Yes! Send out the wizard \n2) Let's fight! \n3) Run Away" );
    System.out.print ( "The Wizard exclaims 'What should I do? :  " );
  }
  
  public bossMenu()
  
  {
    Scanner in = new Scanner ( System.in );
    
    display_menu();
    switch ( in.nextInt() ) {
      case 1:
        System.out.println ( "It will not end here!! " );
        break;
      case 2:
        System.out.println ( "Onward Wizard!!" );
        break;
      case 3:
        System.out.println ( "You are a coward! The dark lord kills two of your companions while you tried to run and forced you to fight." );
        break;
      default:
        System.err.println ( "Unrecognized option" );
        break;
    }
  }
  
}