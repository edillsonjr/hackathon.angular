var app = angular.module('controllers');

app.controller('CategoriaCtrl', function($scope, CategoriaSvc, $route) {
	
	var self = $scope;
	self.template = {
			name : "listar",
			url : "views/categoria/listar.html"
	}
	
	self.categorias = [];
	self.notFound = false;
	
	CategoriaSvc.list().then(function(data){
		self.categoria = data.data;
		if(data.data.length == 0){
			self.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});

	self.deletar = function(id){
		CategoriaSvc.delete(id).then(function(data){
			console.log(data);
			$route.reload();
		});	
	}
	
	self.setCadastro = function() {
		self.template.name = "cadastrar";
		self.template.url = "views/categoria/cadastro.html";
	}
	
	self.setListar = function() {
		self.template.name = "listar";
		self.template.url = "views/categoria/listar.html";
	}
	
	self.setEditar = function (index) {
		self.categoriaEditar = self.categorias[index];
		console.log(self.categoriaEditar);
		self.template.name = "editar";
		self.template.url = "views/categoria/editar.html";
	}
});