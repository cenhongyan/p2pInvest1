 var app = new Vue({
        el:"body",
        data:{
       
            login:true
        },
        methods:{
        	  myinfo:function(){
              	$.ajax({
              		url:"judge",
              		success:function(data){
              			if(data.code != 0)
          				{
          				 window.location.href="login.html";
          				}else{
          	
          					window.location.assign("user");
          				}
              		}
              	});
              }
        }
 });


$(function(){
    	$.ajax({
    		url:"judge",
    		type:'POST',
    		success:function(data){
    			if(data.code == 0)
				{
				   app.login = false;
				}
	
					
				
    		}
    	})
    });