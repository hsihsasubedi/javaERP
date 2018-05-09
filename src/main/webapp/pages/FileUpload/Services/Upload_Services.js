'use strict';

angular
    .module('myapp')
    .factory('Upload_Services',uploadServices);
uploadServices.$inject=['HttpService'];

function uploadServices(HttpService) {

    var REST_SERVICE_URL='http://localhost:8080/multipalUpload';


    var factory = {
        uploadfile: uploadfile,
    };

    return factory;

    function uploadfile(person) {

        return HttpService.post(REST_SERVICE_URL,person);
    }


}