(function(){
  angular.module('lup1')
  .controller('PanelFilterController', [ fileManager, function(fileManagerFactory){
    var controller = this;
    controller.filters = [];
    controller.filterSelected;

    this.selectFilter = function(index){
      controller.filterSelected = controller.filters[index];
    }

    $http.get('models/filters/subject-filter.json').success(function(data) {
     controller.filters = data;
    });

  }]);
})();
