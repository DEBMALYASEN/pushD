package com.pushD.doctor.exceptionhelper;

public class patientFoundException  extends  Exception
{
    public patientFoundException()
    {
        super("Patient with this email  is already there in DB !! try with another one");
    }

    public patientFoundException(String msg)
    {
        super(msg);
    }
}
