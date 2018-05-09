package com.SpringDemo.dto;

import com.SpringDemo.model.ImageData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.nio.file.Path;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DisplayImageResponseDTO {
private List<ImageData>listOfImages;
private String listOfPath;

    public List<ImageData> getListOfImages() {
        return listOfImages;
    }

    public void setListOfImages(List<ImageData> listOfImages) {
        this.listOfImages = listOfImages;
    }

    public String getListOfPath() {
        return listOfPath;
    }

    public void setListOfPath(String listOfPath) {
        this.listOfPath = listOfPath;
    }
}
