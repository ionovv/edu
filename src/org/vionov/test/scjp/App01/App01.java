package org.vionov.test.scjp.App01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class App01 {
    ActionListener al = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
    };
}

class TestClass {
    public TestClass(int i) {
    }

    public void m1() {
        TestClass al = new TestClass(10) {
            public void actionPerformed(ActionEvent e) {
            }
        };
    }
}