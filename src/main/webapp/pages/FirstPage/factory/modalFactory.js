(function(){
    angular
        .module("myapp")
        .factory('ModalFactory',['$uibModal', modalFactory])
    function modalFactory($uibModal){
        return {
            open: function(template, controller, size, controllerAs, id) {
                return $uibModal.open({
                    ariaLabelledBy: 'modal-title',
                    ariaDescribedBy: 'modal-body',
                    templateUrl: template,
                    controller: controller,
                    controllerAs: controllerAs,
                    size: size,
                    resolve: {
                        id:id
                    }
                });
            }
        };
    }

})();