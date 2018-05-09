angular
    .module('myapp')
    .controller('Email_Controller',emailController);

emailController.$inject=['Email_Services','$location'];

function emailController(Email_Services,$location) {

    var vm =this;
    vm.emaildata = {
        email:'',
        subject:'',
        message:''
    }


    vm.send = send;

    function send() {

        Email_Services.send(vm.emaildata)
            .then(
                function() {
                    vm.emaildata = {
                        email:'',
                        subject:'',
                        message:''
                    };
                    console.log("this user is tagged fav");
                },
                function(errResponse){
                    console.error('this user is not tagged fav');
                });


    }



}
