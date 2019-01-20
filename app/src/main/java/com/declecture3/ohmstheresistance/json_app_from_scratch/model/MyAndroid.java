package com.declecture3.ohmstheresistance.json_app_from_scratch.model;

public class MyAndroid {
//this returns the inside objects and make sure each variable matches the variables on the actual json site
    //if not, when you get the information you will get null values
   private String api;
   private String name;
   private String ver;

    public MyAndroid( String api, String name, String version) {

        this.api = api;
        this.name = name;
        this.ver = version;
    }
//getters to get the information from the website
    public String getApi() {
        return api;
    }

    public String getName() {
        return name;
    }

    public String getVersion(){
        return ver;
    }
}
