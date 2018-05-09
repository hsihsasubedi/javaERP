angular
    .module('myapp')
    .controller('Auth_Controller',authController);

authController.$inject=['Auth_Services','$location'];

function authController(Auth_Services,$location) {

    var vm =this;

    vm.RegisterUser = RegisterUser;
    vm.Register=Register;
    vm.userInfo = {
        username:'',
        password:''
    }

    vm.user = {
        username:'',
        password:'',
        usertype:'',
        name:'',
        contact:''
    }

    vm.LogInDemo = LogInDemo;

    function LogInDemo() {
        Auth_Services.LogInDemo(vm.userInfo)
            .then(
                function() {
                    vm.userInfo = {
                        username:'',
                        password:''
                    };
                    console.log("this user is tagged fav");
                },
                function(errResponse){
                    console.error('this user is not tagged fav');
                });
    }


    function RegisterUser() {
        Auth_Services.registerUser(vm.user)
            .then(
                function() {
                    vm.user = {
                        username:'',
                        password:'',
                        usertype:'',
                        name:'',
                        contact:''
                    };
                    console.log("this user is tagged fav");
                },
                function(errResponse){
                    console.error('this user is not tagged fav');
                });
    }


    function Register() {
    $location.path("/register");
}

}
