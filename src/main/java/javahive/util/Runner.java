/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javahive.util;

/**
 *
 * @author mgr
 */
public abstract class Runner<T> {
    private long start=System.nanoTime();
    public abstract T run();
    public long getCzasWykonania(){
        this.run();
        return System.nanoTime()-start;
    };
}
