package singleton_pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SingleObject {
    
    private static SingleObject instance = new SingleObject();
    
    //make the constructor private so that this class cannot be
   //instantiated
    private SingleObject(){}
    
    //Get the only object available
    public static SingleObject getInstance(){
        return instance;
    }
    
    public void showMessege(){
        System.out.println("Hello Maria!");
    }
}
