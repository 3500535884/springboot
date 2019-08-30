package com.raindow.helloworld;

public class Greeting {

    private final long id;

    public long getId() {
        return id;
    }

    private final String content;

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }


}
