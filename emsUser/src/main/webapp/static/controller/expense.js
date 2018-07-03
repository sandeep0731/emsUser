'use strict';


var addexp=angular.module('emsExpenseApp',[ ]);

addexp.controller('addExpCtrl',[ '$scope', '$http', '$location' ,function($scope,$http,$location){
	
	console.log("Reached the Angular controller");
	
	var vm=this;
	vm.expense={};
	vm.expenses={};
	
	vm.submit=function(){
  
		console.log("Inside Submit Function");
		
		console.log(vm.expense);	
		 $http({
	         method: 'POST',
	         url: 'addintoexp.html',
             data: vm.expense,
	         dataType: 'application/json',
	         headers: {'Content-Type': 'application/json'}
	        }).success(function(response) {
	        	alert(' Success '); 
	        	console.dir(response); 
	        }).error(function(response){ 
	        	 
	        	
	            alert(response);	        
	        });	
		 
		//The http method is used to
		 $http.get('getallexpense.json').success(function(response) {
			   console.log('response',response);
			   vm.expenses = resposne;		   
		    }).error(function(response){ 
		    	//bootbox.alert("Cannot edit row (error in console)");
		    	console.dir(response); 
		    	alert(response);
	     });
		 
}		
	
	 
	
	
	
}]);