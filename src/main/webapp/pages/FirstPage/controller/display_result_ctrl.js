angular
    .module('myapp')
    .controller('display_result_ctrl',displayresultctrl);

displayresultctrl.$inject=['DisplayResultServices','ModalFactory','$location', '$scope'];



function displayresultctrl(DisplayResultServices,ModalFactory,$location, $scope) {

var vm=this;

vm.user={id:'',username:'',password:''};
vm.tData=[];
vm.users=[];

vm.Delete=Delete;
vm.Edit=Edit;
fetchAllUsers();



function fetchAllUsers() {
    DisplayResultServices.getData()
        .then(
            function (d) {
                vm.users=d;

            },
            function (errResponse) {
                console.log('Error while fetching data');
            }
        );
}


function Delete(id) {
    DisplayResultServices.Delete(id)
    .then(
        function () {
            fetchAllUsers();

            console.log("delete from database");
        },
        function (errResponse) {
            console.error('errore while deleting data');
        }
    )

}

function Edit(id) {
    var editModal = ModalFactory.open('pages/FirstPage/template/modal.html', 'modalController', 'md', 'xxx',id);
    editModal.result.then(function(){
        //$scope.$apply();
        fetchAllUsers();
    },function(){

    })
}





}