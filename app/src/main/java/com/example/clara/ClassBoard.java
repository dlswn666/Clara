package com.example.clara;

import java.io.Serializable;

public class ClassBoard implements Serializable {

    String title;
    String contents;

    public ClassBoard() {
    }

    public ClassBoard(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void setTitle(String title) { this.title = title;  }

    public void setContents(String contents) { this.contents = contents; }

    public String getTitle() { return title; }

    public String getContents() { return contents; }
}
