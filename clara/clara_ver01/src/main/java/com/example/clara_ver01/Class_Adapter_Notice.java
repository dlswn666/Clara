package com.example.clara_ver01;

import java.io.Serializable;

public class Class_Adapter_Notice implements Serializable {

    String tv_nt_title, tv_nt_contents;

    public Class_Adapter_Notice() {
    }

    public Class_Adapter_Notice(String et_nt_title, String tv_nt_notice) {
        this.tv_nt_title = tv_nt_title;
        this.tv_nt_contents = tv_nt_contents;
    }

    public void setTv_nt_title(String et_nt_title) {this.tv_nt_title = et_nt_title; }

    public void setTv_nt_contents(String et_nt_contents) { this.tv_nt_contents = et_nt_contents;  }

    public String getTv_nt_title() {  return tv_nt_title;    }

    public String getTv_nt_contents() {  return tv_nt_contents;  }
}
