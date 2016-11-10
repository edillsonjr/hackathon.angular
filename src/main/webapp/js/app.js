var App = angular.module('App', [ 'ngRoute', 'controllers', 'services' ,'ngMaterial']);

App.config(function($routeProvider) {
	$routeProvider.when('/agente', {
		templateUrl : 'views/agente/agente.html',
		controller : 'AgenteCtrl'
	}).when('/categoria', {
		templateUrl : 'views/categoria/categoria.html',
		controller : 'CategoriaCtrl'
	})
});

App.value('API', 'http://localhost:8080/primefaces-app/service/');