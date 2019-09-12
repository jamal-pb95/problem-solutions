package com.bd.howtocode.java;

public class ExceptionUnchecked {
    public void fetchData(String url) {
        String data = fetchDataFromUrl(url);
    }

    public String fetchDataFromUrl(String url) {
        if (url == null) {
            throw new UncheckedException("Url Not found");
        }

        String data = null;
        //read lots of data over HTTP and return
        //it as a String instance.

        return data;
    }
}
