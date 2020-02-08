package sample;

import java.util.UUID;

public class Employee implements Worker
{
    public String firstName;
    public String lastName;
    public UUID id;
    public boolean isActive;

    @Override
    public String toString()
    {
        return this.firstName + " " + this.lastName; //this = in this class use this variable
    }


    @Override
    public void hire()
    {
        isActive = true;
    }

    @Override
    public void fire()
    {
        isActive = false;
    }
}
