package com.chadani.frontendui.service;

import com.chadani.frontendui.model.Informa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Informa> informationList = new ArrayList<>();

    public List<Informa> getMessage() {
        return informationList;
    }

    public void setMessage(Informa informa) {
        if (informa.getProfileUrl() == null || informa.getProfileUrl() == "") {
            informa.setProfileUrl("http://prod-upp-image-read.ft.com/5ecccf40-b7e5-11e9-96bd-8e884d3ea203");
        }
        informationList.add(informa);
    }
}
