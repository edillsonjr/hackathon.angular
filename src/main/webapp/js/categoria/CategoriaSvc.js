var App = angular.module('services', []);

App.factory('CategoriaSvc', function($http, API){
	return {
		list: function(){
			return $http.get(API+'categoria');
		},
		
		update: function(item){
			return $http.post(API+'categoria/', item);	
		},
		delete: function(id){
			return $http.delete(API+'categoria/'+id);
		}
	}
})