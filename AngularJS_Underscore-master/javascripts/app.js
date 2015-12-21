(function(angular, data, _){
  // Your code should be here

  var myAPP = angular.module('myAPP', []);
  myAPP.controller('mainController', function($scope) {
    $scope.books = data.books;
    $scope.publishers = _.uniq(_.map(data.books,function(book){
      return book.publisher;
    }));
    $scope.booktags = _.uniq(_.flatten(_.map(data.books,function(book){
      return book.tags;
    })));
  });
})(angular, data, _);
