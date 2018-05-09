package com.SpringDemo.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@NoArgsConstructor
@Getter
@Setter
public class ImageUploadDTO {
    private String name;
    private List<imageSelected> imageSelected;

    public List<imageSelected> getListOfFiles()
    {
        return imageSelected;
    }

    public void setListOfFiles(List<imageSelected> listOfFiles) {
        this.imageSelected = listOfFiles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<imageSelected> getImageSelected() {
        return imageSelected;
    }

    public void setImageSelected(List<imageSelected> imageSelected) {
        this.imageSelected = imageSelected;
    }

    @Override
    public String toString() {
        return "ImageUploadDTO{" +
                "name='" + name + '\'' +
                ", listOfFiles=" + imageSelected +
                '}';
    }
}
