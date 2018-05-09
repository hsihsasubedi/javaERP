'use strict';

angular
    .module('myapp')
    .factory('DisplayServices',displayServices);
displayServices.$inject=['HttpService'];

function displayServices(HttpService) {
    var REST_SERVICE_URL = 'http://localhost:8080/DisplayImage';


    var factory = {
        fetchData: fetchData,

    };

    return factory;

    function fetchData(imagedata) {

        return HttpService.get(REST_SERVICE_URL);
    }


}