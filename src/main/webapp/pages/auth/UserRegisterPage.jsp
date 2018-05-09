<div ng-controller="Auth_Controller as xxx">
    User-Name/E-mail:<input type="text" ng-model="xxx.user.username"><br><br>
    Password:<input type="password" ng-model="xxx.user.password"><br>
    User-Type:<input type="text" ng-model="xxx.user.usertype"><br><br>
    Name:<input type="text" ng-model="xxx.user.name"><br>
    Contact Number:<input type="text" ng-model="xxx.user.contact"><br>
    <%--Active:<input type="password" ng-model="xxx.user.active"><br>--%>
    <%--Passwod:<input type="password" ng-model="xxx.user.password"><br>--%>

    <button ng-click="xxx.RegisterUser()">Register</button>


</div>