(function(){
    'use strict';
    angular
        .module("myapp")
        .controller("modalController", modalController);
    modalController.$inject = ['$uibModalInstance','modalServices','id','$scope'];

    function modalController($uibModalInstance,modalServices,id,$scope){

        var vm = this;

        vm.user={id:'', userName: '', password: ''};

        vm.user.id=id;

        vm.addData = addData;
        edit(id);



        vm.cancelModal = cancelModal;
        function cancelModal(){
            $uibModalInstance.close('save');
        }



        function addData() {

            modalServices.addData(vm.user)
                .then(
                    function() {

                        cancelModal();

                        console.log("this user is tagged fav");
                    },
                    function(errResponse){
                        console.error('this user is not tagged fav');
                    });

        }



        function edit(id) {
            modalServices.edit(id)
                .then(
                    function (d) {
                       vm.user=d;
                    },
                    function (errResponse) {
                        console.error('errore while deleting data');
                    }
                )
        }



    };
})();
