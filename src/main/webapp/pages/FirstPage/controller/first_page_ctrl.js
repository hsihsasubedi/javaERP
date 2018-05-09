angular
.module('myapp')
.controller('first_page_ctrl',firstpagecontroller);

firstpagecontroller.$inject=['FirstPageServices','$location'];

function firstpagecontroller(FirstPageServices,$location) {

    var vm =this;
    vm.login=login;
    vm.userInfo = {
        userName:'',
        password:''
    }
   vm.user = '';
    vm.addData = addData;
    vm.displayPage=displayPage;
    vm.displayNumber=displayNumber;
    vm.emailPage=emailPage;
    vm.uploadPage=uploadPage;

function addData() {
    FirstPageServices.addData(vm.userInfo)
        .then(
            function() {
                vm.userInfo = {
                    userName:'',
                    password:''
                };
                console.log("this user is tagged fav");
            },
            function(errResponse){
                console.error('this user is not tagged fav');
            });
    }

    function displayPage() {
        $location.path('/displayResult')
    }

    function displayNumber() {
        $location.path('/displayNumber')
    }

    function emailPage() {
        $location.path('/emailPage')
    }


    function login() {
        $location.path('/login')
    }

    function uploadPage() {
        $location.path('/uploadPage')
    }
    }
