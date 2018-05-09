angular
    .module('myapp')
    .controller('Upload_Controller',uploadController);

uploadController.$inject=['Upload_Services','$location'];

function uploadController(Upload_Services,$location) {

    var vm =this;
    vm.myfiles=[{name:'',fileType:'',fileName:'',base64:''}];

   // var myfiles=[{name:'',fileType:'',fileName:'',base64:''}];
    // vm.userdata={name:'',fileType:'',fileName:'',base64:''}
    // vm.imagedata=[];


    vm.postUploadData =postUploadData;
    vm.ImageDetails=ImageDetails;
   vm.saveFileList=saveFileList;

    // vm.doupload = doupload;
    //
    // function postUploadData(name,imageSelected) {
    // vm.userdata.name=name;
    // vm.userdata.fileName=imageSelected.filename;
    // vm.userdata.fileType=imageSelected.filetype;
    // vm.userdata.base64=imageSelected.base64;
    // doupload(vm.userdata);
    //
    // }

    // function doupload(userdata) {
    //
    //     Upload_Services.doupload(userdata)
    //         .then(
    //             function() {
    //
    //                 console.log("image upload process");
    //             },
    //             function(errResponse){
    //                 console.error('this user is not tagged fav');
    //             });
    //
    //
    // }

    function saveFileList(name,imageSelected) {
        for(var i=0;i<imageSelected.length;i++){
            vm.myfiles.name=name[i];
            vm.myfiles.fileType=imageSelected[i].filetype;
            vm.myfiles.fileName=imageSelected[i].filename;
            vm.myfiles.base64=imageSelected[i].base64;
        }
    }

    function postUploadData(person){
        //vm.saveFileList(name,imageSelected);
        Upload_Services.uploadfile(person)
            .then(
                function(response) {
                    console.log('multipal image uploading ');
                },
                function (errResponse) {
                    console.error('uploading error');
                }
            )
    }
    function ImageDetails() {
        $location.path('/ImageDetails')
    }

}
