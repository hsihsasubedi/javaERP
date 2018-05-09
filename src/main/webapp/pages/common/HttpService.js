angular
.module('myapp')
.factory('HttpService',HttpService);

HttpService.$inject=['$http','$q','$location'];
function HttpService($http,$q,$location){
    var vm=this;


    return{
        //function that handles the get method
        get:function(resourceURL){
            return $http.get(resourceURL)
                .then(
                    function (resp) {
                        return resp.data;
                    },
                    function(err){
                        return $q.reject(err);
                    }
                )
        },
        post: function (resourceURI, data) {
            return $http.post(resourceURI, data)
                .then(
                    function (resp) {
                        return resp.data;
                    },
                    function (err) {
                        return $q.reject(err);
                    }
                );
        },


        put: function (resourceURI, id, user) {
            return $http.put(resourceURI+id, user)
                .then(
                    function (resp) {
                        return resp.data;
                    },
                    function (err) {
                        return $q.reject(err);
                    }
                );
        },
    }

}