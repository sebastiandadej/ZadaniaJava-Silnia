/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package marcin.testapp.impl;

import marcin.testapp.KalkulatorSilni;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;


/**
 *
 * @author mgr
 */
public class GuavaSilnia implements KalkulatorSilni{

    public String licz(int arg) {
        
        //return BigIntegerMath.factorial(arg).toString();
        
        /*
         * 
         * żeby użyć biblioteki Guava do liczenia silni wystarczy dodać
         *     <dependency>
         *       <groupId>com.google.guava</groupId>
         *       <artifactId>guava</artifactId>
         *       <version>14.0.1</version>
         *       <type>jar</type>
         *     </dependency>
         * do pliku pom.xml
         * 
         */
        throw new NotImplementedException();
        
    }
}
