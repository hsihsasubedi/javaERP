angular
    .module('myapp')
    .controller('DisplayController',displayController);

displayController.$inject=['DisplayServices','$location'];

function displayController(DisplayServices,$location) {

    var vm=this;
    vm.users=[];
    vm.images=[];

    fetchAllImage();
    function fetchAllImage() {

        DisplayServices.fetchData()
            .then(
                function (d) {
                 vm.images=d;
                 console.log(vm.images);
                    console.log('data fetch image file');

                },
                function (errResponse) {
                    console.log('Error while fetching data');
                }
            );
    }






}