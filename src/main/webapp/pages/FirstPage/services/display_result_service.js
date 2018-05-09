'use strict';

angular
    .module('myapp')
    .factory('DisplayResultServices',firstPageServices);
firstPageServices.$inject=['HttpService'];

function firstPageServices(HttpService) {
    var REST_SERVICE_URL='http://localhost:8080/display';


    var factory = {
        getData: getData,
        Delete :Delete,
    };

    return factory;

    function getData(u, p) {

        return HttpService.get(REST_SERVICE_URL);
    }


    function Delete(id) {
        var deleteUser={
            id:id
        }
        return HttpService.post(REST_SERVICE_URL+'/DeleteUser',deleteUser);
    };



}