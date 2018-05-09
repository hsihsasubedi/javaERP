'use strict';

angular
    .module('myapp')
    .factory('Auth_Services',authServices);
authServices.$inject=['HttpService'];

function authServices(HttpService) {

    var REST_SERVICE_URL='http://localhost:8080/login';


    var factory = {
        LogInDemo: LogInDemo,
        registerUser:registerUser
    };

    return factory;

    function LogInDemo(userInfo) {
        return HttpService.post(REST_SERVICE_URL, userInfo);
    }

    function registerUser(userInfo) {
        return HttpService.post(REST_SERVICE_URL+'/register',user);
    }

}