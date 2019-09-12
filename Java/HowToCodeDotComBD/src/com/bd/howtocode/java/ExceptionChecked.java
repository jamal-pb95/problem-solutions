package com.bd.howtocode.java;

public class ExceptionChecked {
    public void fetchData(String url) {
        try {
            String data = fetchDataFromUrl(url);
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }

    public String fetchDataFromUrl(String url) throws CheckedException {
        if (url == null) {
            throw new CheckedException("Url Not found");
        }

        String data = null;
        //read lots of data over HTTP and return
        //it as a String instance.

        return data;
    }
}
