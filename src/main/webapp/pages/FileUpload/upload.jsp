<div ng-controller="Upload_Controller as xxx">

    <input type="text" ng-model="xxx.person.name">
    <input type="file" ng-model="xxx.person.imageSelected" multiple base-sixty-four-input>

    <button ng-click="xxx.postUploadData(xxx.person)">image upload</button>
    <button ng-click="xxx.ImageDetails()">Images details</button>
</div>

