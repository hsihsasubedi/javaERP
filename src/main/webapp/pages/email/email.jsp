<div ng-controller="Email_Controller as xxx">

    E-mail/username:<input type="text"  ng-model="xxx.emaildata.email"><br><br>
    subject:<input  type="text" ng-model="xxx.emaildata.subject"><br><br>
    message :<input type="text"  ng-model="xxx.emaildata.message"><br><br>

    <button ng-click="xxx.send()">send</button>

</div>