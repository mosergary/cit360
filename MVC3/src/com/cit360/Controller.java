package com.cit360;
class Controller
{
private Model model;
private View view;

public Controller(Model model, View view)
        {
        this.model = model;
        this.view = view;
        }

public void setMyFirstName(String firstName)
        {
        model.setFirstName(firstName);
        }

public String getMyFirstName()
        {
        return model.getFirstName();
        }

public void setMyLastName(String lastName)
        {
        model.setLastName(lastName);
        }

public String getMyLastName()
        {
        return model.getLastName();
        }

public void updateView()
        {
        view.MyInformation(model.getFirstName(), model.getLastName(),model.getProject());
        }
        }
