'use strict';

angular
    .module('myapp')
    .factory('Email_Services',emailServices);
emailServices.$inject=['HttpService'];

function emailServices(HttpService) {

    var REST_SERVICE_URL='http://localhost:8080/emailsend';


    var factory = {
        send: send,
    };

    return factory;

    function send(emaildata) {


        return HttpService.post(REST_SERVICE_URL, emaildata);
    }


}