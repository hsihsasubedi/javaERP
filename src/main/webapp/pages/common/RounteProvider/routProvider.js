(function(){
    'use strict';
    angular
        .module("myapp")
        .config(routeFunc)

    function routeFunc($routeProvider){

        $routeProvider
            .when('/',{templateUrl: 'pages/FirstPage/firstpage.jsp'})
            .when('/displayResult',{templateUrl:'pages/FirstPage/displayResult.jsp'})
            .when('/displayNumber',{templateUrl:'pages/LoginPage/login.jsp'})
            .when('/register',{templateUrl:'pages/LoginPage/register.jsp'})
            .when('/roleRegister',{templateUrl:'pages/LoginPage/addrole.jsp'})
            .when('/emailPage',{templateUrl:'pages/email/email.jsp'})
            .when('/uploadPage',{templateUrl:'/pages/FileUpload/upload.jsp'})
            .when('/ImageDetails',{templateUrl:'/pages/FileUpload/ImageDetails.jsp'})
            .when('/login',{templateUrl:'/pages/auth/auth.jsp'})
            .when('/register',{templateUrl:'/pages/auth/UserRegisterPage.jsp'})

        }


})();
