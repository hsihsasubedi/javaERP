package com.SpringDemo.controller;
import com.SpringDemo.dto.*;
import com.SpringDemo.model.ImageData;
import com.SpringDemo.model.User;
import com.SpringDemo.services.ImageServices;
import com.SpringDemo.services.userServices;
import com.SpringDemo.util.DemoConstants;
import com.SpringDemo.util.EmailUtil;
import com.SpringDemo.util.FileUtil;
import com.SpringDemo.util.MimeTypeToExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@RestController
public class controller {


    @Autowired
    private userServices userService;

    @Autowired
    private EmailUtil emailUtil;

    @Autowired
    private ImageServices imageServices;

    @PostMapping("/addData")
    public ResponseEntity<User> creatUser(@RequestBody userDTO userdto){
        System.out.println(userdto);
        User user = new User(userdto.getId(), userdto.getUserName(), userdto.getPassword());
        userService.addUser(user);
        return new ResponseEntity<User>( HttpStatus.OK);
    }

    @PostMapping("/emailsend")
    public ResponseEntity<Void> emailsend(@RequestBody EmailDTO emailDTO){
        emailUtil.sendSimpleMessage(emailDTO.getEmail(),emailDTO.getSubject(),emailDTO.getMessage());
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

//    @PostMapping("/upload")
//    public ResponseEntity<ImageData> uploadImage(@RequestBody ImageUploadDTO imageUploadDTO){
//    try{
//        byte[] decodedImg = Base64.getDecoder().decode(imageUploadDTO.getBase64());
//        ImageData imageData=new ImageData();
//        imageData.setImageurl(FileUtil.saveFile(DemoConstants.PRODUCT_REPO,decodedImg,
//                MimeTypeToExtension.MIME_TYPE_TO_EXTENSION.get(imageUploadDTO.getFileType())));
//        imageData.setName(imageUploadDTO.getName());
//
//        imageServices.addImage(imageData);
//    }catch (Exception ex){
//
//        System.out.println(ex);
//    }
//        return new ResponseEntity<ImageData>(HttpStatus.OK);
//    }


    @PostMapping("/multipalUpload")
    public ResponseEntity<Void> uploadImage(@RequestBody ImageUploadDTO imageUploadDTO){

//         try{
//
//            byte[] decodedImg = Base64.getDecoder().decode(imageUploadDTO.getBase64());
//            ImageData imageData=new ImageData();
//            imageData.setImageurl(FileUtil.saveFile(DemoConstants.PRODUCT_REPO,decodedImg,
//                    MimeTypeToExtension.MIME_TYPE_TO_EXTENSION.get(imageUploadDTO.getFileType())));
//            imageData.setName(imageUploadDTO.getName());
//
//            imageServices.addImage(imageData);
//        }catch (Exception ex){
//
//            System.out.println(ex);
//        }

        for (imageSelected imageSelected:imageUploadDTO.getListOfFiles()){
            try{
                byte[] decodedImg = Base64.getDecoder().decode(imageSelected.getBase64());
                ImageData imageData=new ImageData();
                imageData.setImageurl(FileUtil.saveFile(DemoConstants.
                        PRODUCT_REPO,decodedImg,MimeTypeToExtension.MIME_TYPE_TO_EXTENSION.
                        get(imageSelected.getFileType())));
                imageData.setName(imageUploadDTO.getName());
                imageServices.addImage(imageData);
            }catch (Exception ex){
                System.out.println(ex);
            }
        }
      return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @GetMapping("/DisplayImage")
    public ResponseEntity<List<ImageResponseDto>> showImage(){
         List<ImageData> imagedataList=imageServices.getResults();
         List<ImageResponseDto>imageResponseDtos=imageServices.getResult(imagedataList);
         return new ResponseEntity<List<ImageResponseDto>>(imageResponseDtos,HttpStatus.OK);
    }

    @GetMapping("/display")
    public ResponseEntity<List<User>> showData(){
        List<User> users=userService.getResults();
        return  new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }

    @PostMapping("/display/DeleteUser")
    public ResponseEntity<Void> DeleteUser(@RequestBody userDTO userdto){
        Long id=userdto.getId();
        userService.deleteId(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/addData/edit/")
    public ResponseEntity<User> getUserByid(@RequestBody Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}
