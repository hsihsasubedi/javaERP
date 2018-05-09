package com.SpringDemo.services.impl;


import com.SpringDemo.dto.ImageResponseDto;
import com.SpringDemo.model.ImageData;
import com.SpringDemo.repository.ImageRipository;
import com.SpringDemo.services.ImageServices;
import com.SpringDemo.util.DemoConstants;
import com.SpringDemo.util.FileUtil;
import org.apache.commons.io.FileUtils;
import org.codehaus.plexus.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
//import java.util.Base64;
import java.util.List;

@Service
@Transactional
public class ImageServicesImp implements ImageServices{

    @Autowired
    ImageRipository imageRipository;


    @PersistenceContext
    EntityManager em;

    @Override
    public void addImage(ImageData i) {
        imageRipository.saveAndFlush(i);
    }

    @Override
    public List<ImageData> getResults() {

        String sql="select * from imagedata";
        Query query=em.createNativeQuery(sql,ImageData.class);
        List<ImageData> results=query.getResultList();
        return results;
    }

    @Override
    public List<ImageResponseDto> getResult(List<ImageData>imageDataList) {
       List<ImageResponseDto>listOfImageResponse=new ArrayList<>();
        for(ImageData imageData:imageDataList)
       {
           try {
               File file=new File(DemoConstants.PRODUCT_REPO+"//"+imageData.getImageurl());
               String encoded= new String (Base64.encodeBase64(FileUtils.readFileToByteArray(file)),"UTF-8");
               System.out.println(encoded);
               ImageResponseDto imageResponseDto=new ImageResponseDto();
               imageResponseDto.setName(imageData.getName());
               imageResponseDto.setBase64Image(encoded);
               listOfImageResponse.add(imageResponseDto);
           }catch (Exception ex){
               System.out.println(ex);
           }

       }

        return listOfImageResponse;
    }
}
