package com.pushD.doctor.exceptionhelper;

public class doctornotFoundException extends Exception
{
    public doctornotFoundException()
    {
        super("Doctor  with this name is  not present in DB !! try with another one");
    }
    public doctornotFoundException(String msg)
    {
        super(msg);
    }
}
