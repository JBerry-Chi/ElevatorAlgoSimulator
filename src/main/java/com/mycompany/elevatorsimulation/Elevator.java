/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.elevatorsimulation;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author johnberry
 */
public class Elevator implements ElevatorInterface {
    private ArrayList<Person> peopleInElevator;
    private ArrayList<Integer> floorsToVisit;
    
    private int elevatorID;
    private boolean doorsOpen;
    private int maxNumberPeople;
    private int currentFloor;
    
    private long travelTimeMills;
    private long doorActionTimesMills;
  
    private ElevatorProcessor processor = ElevatorProcessor.getInstance();
    
    private String direction;
    private boolean idle;

    public Elevator(int elevatorIDIn, long travelTimeMillsIn,
                                   long doorActionTimeMillsIn, int maxNumberPeopleIn){
        elevatorID = elevatorIDIn;
        doorsOpen = false;
        travelTimeMills = travelTimeMillsIn;
        currentFloor = 1;
        floorsToVisit = new ArrayList<Integer>();
    }
    
    // SIMULATING MOVEMENT
    public void move(int destFloor){
        currentFloor = destFloor;
    }
    
    public void addFloorToVisit(int floorID){
        floorsToVisit.add(floorID);
        System.out.println("Updated stops for elevator " + elevatorID);
        System.out.println("List of stops:  ");
        
        for(int i : floorsToVisit){
            System.out.println("Floor: " + i);
        } 
    }
    public void openDoors(){
    }
    
    public void closeDoors(){
    }
    
    public int getCurrentFloor(){
        return currentFloor;
    }
    
    public int getElevatorID(){
        return elevatorID;
    }
}