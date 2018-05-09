<div ng-controller="Auth_Controller as xxx">
    User-Name/E-mail:<input type="text" ng-model="xxx.userInfo.username"><br><br>
    Password:<input type="password" ng-model="xxx.userInfo.password"><br>
    <button ng-click="xxx.LogInDemo()">login</button>

    <button ng-click="xxx.Register()">Register</button>
</div>