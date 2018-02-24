package com.makenv.InterceptingFilter;

public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new FirstFilter());
        filterManager.setFilter(new SecondFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        //FirstFilter request
        //SecondFilter request
        //Target request
        client.sendRequest("request");
    }

}
