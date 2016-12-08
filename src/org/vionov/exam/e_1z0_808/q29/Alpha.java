package org.vionov.exam.e_1z0_808.q29;

/**
 * Created by user on 04.12.2016.
 */
public class Alpha {
    int ns;
    static  int s;
    Alpha(int ns){
        if(s<ns){
            s=ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}
