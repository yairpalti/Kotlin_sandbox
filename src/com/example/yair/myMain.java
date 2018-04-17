package com.example.yair;

public final class myMain {
    public static final void main(String[] args) {
        new PupilJava("aaa");
        new PupilJava("bbb");
        new PupilJava("ccc");
        String var4 = "Pupils: " + PupilJava.howMany();
        System.out.println(var4);

        SomeSingletonJava.display();
//        SomeSingletonJava someSingletonJava = SomeSingletonJava.INSTANCE;
    }
}
