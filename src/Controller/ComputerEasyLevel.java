/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Random;

/**
 *
 * @author Azza Helmy
 */
public class ComputerEasyLevel extends GameHelper {

    //==================================================
    @Override
    public void setComputerChoice() {
        int[] buttons2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        if (!isWinning(player1) && counter < 8) {
            while (true) {
                int rnd = new Random().nextInt(buttons2.length);
                System.out.println(rnd);
                if (rnd == 0 && !buttons.get(0).isDisabled()) {
                    setPlayingIcon(imags.get(0), buttons.get(0));
                    break;
                } else if (rnd == 1 && !buttons.get(1).isDisabled()) {
                    setPlayingIcon(imags.get(1), buttons.get(1));
                    break;
                } else if (rnd == 2 && !buttons.get(2).isDisabled()) {
                    setPlayingIcon(imags.get(2), buttons.get(2));
                    break;
                } else if (rnd == 3 && !buttons.get(3).isDisabled()) {
                    setPlayingIcon(imags.get(3), buttons.get(3));
                    break;
                } else if (rnd == 4 && !buttons.get(4).isDisabled()) {
                    setPlayingIcon(imags.get(4), buttons.get(4));
                    break;
                } else if (rnd == 5 && !buttons.get(5).isDisabled()) {
                    setPlayingIcon(imags.get(5), buttons.get(5));
                    break;
                } else if (rnd == 6 && !buttons.get(6).isDisabled()) {
                    setPlayingIcon(imags.get(6), buttons.get(6));
                    break;
                } else if (rnd == 7 && !buttons.get(7).isDisabled()) {
                    setPlayingIcon(imags.get(7), buttons.get(7));
                    break;
              } else if (rnd == 8 && !buttons.get(8).isDisabled()) {
                    setPlayingIcon(imags.get(8), buttons.get(8));
                    break;
                    
                }               
            }

        }
    }
//==================================================== 

}
