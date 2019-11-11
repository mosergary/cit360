package com.cit360;

import static com.cit360.Model.Database;

//Referenced Geeks for geeks website
public class MVC3 {

    public static void main(String[] args) {
        Model model  = Database();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.updateView();
    }



}
