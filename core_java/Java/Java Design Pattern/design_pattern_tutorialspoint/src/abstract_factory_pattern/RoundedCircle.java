/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstract_factory_pattern;

/**
 *
 * @author HP
 */
public class RoundedCircle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside RoundedCircle::draw() method.");    
    }
    
}
