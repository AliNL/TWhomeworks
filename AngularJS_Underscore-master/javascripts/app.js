(function(angular, data, _){
  // Your code should be here

  var myAPP = angular.module('myAPP', []);
  myAPP.controller('mainController', function($scope) {
    $scope.books = data.books;
    $scope.booksFiltered = data.books;
    $scope.publishers = _.uniq(_.map(data.books,function(book){return book.publisher;}));
    $scope.booktags = _.uniq(_.flatten(_.map(data.books,function(book){return book.tags;})));
    $scope.change = function(){
			var temp = $scope.books;
    	if(!_.isNull($scope.publisher))
    		temp = _.where($scope.books, {publisher: $scope.publisher});
    	if(!_.isNull($scope.booktag)){
    		temp = _.filter(temp, function(book){
    			return _.contains(_.pluck(book.tags, 'name'), $scope.booktag);
    		});
    	}
    	$scope.booksFiltered = temp;
    }
  });
})(angular, data, _);
