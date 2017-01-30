angular.module('tradeApp', []).controller('tradeCtrl', function($scope, tradeService, $filter) {
	tradeService.getTradesList().then(function(tradesList) {
		$scope.tradeData = $filter('groupdata')(tradesList.trades);
	});
}).service('tradeService', function($http, $q) {
	return {
		getTradesList: getTradesList
	};
	
	function getTradesList() {s
		var defer = $q.defer();
		$http.get('../api/tradeslist').then(function(res) {
			defer.resolve(res.data);
		}, function(error) {
			defer.reject(error);
		});
		return defer.promise;
	}
}).filter('groupdata', function() {
	function groupBy(list, property) {
		var i = 0, val, result = {};
		for (; i < list.length; i++) {
			val = list[i][property];
			if (!result[val])
				result[val]=[];
			result[val].push(list[i]);
		}
		return result;
	};

	return function(array) {
		var result = null;
		if(array && array.length) {
			result =  groupBy(array, 'symbol');
			for(var key in result) {
				if (result.hasOwnProperty(key)) {
					var subArray = result[key];
					result[key] = groupBy(subArray, 'action');
				}
			}
		}
		return result;
	};
});