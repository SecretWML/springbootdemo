package com.teststh.testdesignmode.testadapter;

public class TestAdapter {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
