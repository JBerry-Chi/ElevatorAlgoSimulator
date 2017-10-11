/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.elevatorsimulation;

/**
 *
 * @author johnberry
 */
public class ElevatorFactory {
    
    public static Elevator createElevator(int elevatorIDIn, long travelTimeMillsIn,
                                   long doorActionTimeMillsIn, int maxNumberPeopleIn){
      
        return new Elevator(elevatorIDIn, travelTimeMillsIn, 
                        doorActionTimeMillsIn, maxNumberPeopleIn);
      }
    
}
