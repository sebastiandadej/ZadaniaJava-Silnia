
package javahive.util;

/**
 * @author Marcin Grabowiecki
 * zlicza czas wykonania kodu
 */
public abstract class Runner<T> {
    private long start=System.nanoTime();
    public abstract T run();
    public long getCzasWykonania(){
        this.run();
        return System.nanoTime()-start;
    };
}
