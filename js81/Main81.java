/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js81;

/**
 *
 * @author HaiTr
 */
public class Main81 {

    public static void main(String[] args) {
        BeeList beeList = new BeeList();
        while (true) {
            Management.menu();
            System.out.print("Your option: ");
            int option = Validation.checkInputIntLimit(1, 3);

            switch (option) {
                case 1:
                    beeList.createBeeList();
                    beeList.display();
                    break;
                case 2:
                    beeList.damage();
                    beeList.display();
                    break;
                case 3:
                    return;
            }
        }

    }

}
