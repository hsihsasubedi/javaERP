'use strict';

angular
    .module('myapp')
    .factory('modalServices',modalServices);
modalServices.$inject=['HttpService'];

function modalServices(HttpService) {

    var REST_SERVICE_URL='http://localhost:8080/addData/';


    var factory = {
        addData: addData,
        edit:edit,

    };

    return factory;

    function addData(userInfo) {


        return HttpService.post(REST_SERVICE_URL, userInfo);
    }

    function edit(id){
        return HttpService.post(REST_SERVICE_URL+'edit/', id);
    }



}