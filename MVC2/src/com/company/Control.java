package com.company;
import java.io.FileNotFoundException;
import static com.company.Model.*;
import static com.company.View.*;


public abstract class Control {

    public static void userSelection() throws FileNotFoundException {
//controller displays the view to the user to make a selection
        userView();

        Integer selection = userView();
//user selection is brought back to the controller to pass reach the proper program in the model
        if (selection == 1){
            http();
            userSelection();
        }
        else if (selection == 2){
            map();
            System.out.print(parse());
            System.out.print(displayJSON());
            userSelection();
        }
        else if (selection == 3){
            String zip = collecionInput();
            System.out.print(collections(zip));
            userSelection();

        }
        else{
            System.out.print("please choose a number 1 - 3");
            userView();
        }

        }

}


