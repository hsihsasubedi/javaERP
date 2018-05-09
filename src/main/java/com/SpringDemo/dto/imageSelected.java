package com.SpringDemo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class imageSelected {

    private String base64;
    private String filename;
    private String filetype;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public imageSelected(String base64, String filename, String filetype) {
        this.base64 = base64;
        this.filename = filename;
        this.filetype = filetype;
    }

    public String getFileType() {
        return filetype;
    }

    public void setFileType(String fileType) {
        this.filetype = fileType;
    }

    public String getFileName() {
        return filename;
    }

    public void setFileName(String fileName) {
        this.filename = fileName;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }
}
