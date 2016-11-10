var app = angular.module('controllers');

app.controller('AgenteCtrl', function($scope, AgenteSvc, $route) {
	
	var self = $scope;
	self.template = {
			name : "listar",
			url : "views/agente/listar.html"
	}
	
	self.agentes = [];
	self.notFound = false;
	
	AgenteSvc.list().then(function(data){
		self.agentes = data.data;
		if(data.data.length == 0){
			self.notFound = true;
		}
	},function(data){
		console.log("data", data);
	});

	self.deletar = function(id){
		AgenteSvc.delete(id).then(function(data){
			console.log(data);
			$route.reload();
		});	
	}
	
	self.setCadastro = function() {
		self.agenteEditar ={};
		self.template.name = "cadastrar";
		self.template.url = "views/agente/editar.html";
	}
	
	self.setListar = function() {
		self.template.name = "listar";
		self.template.url = "views/agente/listar.html";
	}
	
	self.setEditar = function (index) {
		self.agenteEditar = self.agentes[index];
		console.log(self.agenteEditar);
		self.template.name = "editar";
		self.template.url = "views/agente/editar.html";
	}
	self.updateAgente= function () {
		 var agente =self.agenteEditar;
		 
		 AgenteSvc.update(agente);
		 self.setListar();
	}
});