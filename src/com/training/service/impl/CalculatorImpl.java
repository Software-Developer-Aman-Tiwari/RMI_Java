package com.training.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.training.service.Calculator;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {

    // Mandatory constructor that throws RemoteException
    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) throws RemoteException {
        return a - b;
    }
}
