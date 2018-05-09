package com.SpringDemo.services;


import com.SpringDemo.dto.ImageResponseDto;
import com.SpringDemo.model.ImageData;

import java.util.List;


public interface ImageServices {
    void addImage(ImageData i);
    List<ImageData> getResults();

    List<ImageResponseDto> getResult(List<ImageData>imageDataList);
}
