var App = angular.module('services', []);

App.factory('AgenteSvc', function($http, API){
	return {
		list: function(){
			return $http.get(API+'agente');
		},
		
		update: function(item){
			return $http.post(API+'agente/', item);	
		},
		delete: function(id){
			return $http.delete(API+'agente/'+id);
		}
	}
})