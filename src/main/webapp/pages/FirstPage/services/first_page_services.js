'use strict';

angular
.module('myapp')
.factory('FirstPageServices',firstPageServices);
firstPageServices.$inject=['HttpService'];

function firstPageServices(HttpService) {

    var REST_SERVICE_URL='http://localhost:8080/addData/';


    var factory = {
        addData: addData,
    };

    return factory;

    function addData(userInfo) {


        return HttpService.post(REST_SERVICE_URL, userInfo);
    }


}