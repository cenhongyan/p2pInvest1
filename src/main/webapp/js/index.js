

    $("#title1").click(function () {
        $("#line").addClass("border");
        $("#line").removeClass("border1");
    });
    $("#title2").click(function () {
        $("#line").addClass("border1");
        $("#line").removeClass("border");
    });

    
    
    
    function over(obj) {
        $("#line").addClass("border");
        $("#line").removeClass("border1");
    }

    function over2(obj) {
        $("#line").addClass("border1");
        $("#line").removeClass("border");
    }


    $(function() {
        $('.circle').each(function(index, el) {
            var num = $(this).find('span').text() * 3.6;
            if (num<=180) {
                $(this).find('.right').css('transform', "rotate(" + num + "deg)");
            } else {
                $(this).find('.right').css('transform', "rotate(180deg)");
                $(this).find('.left').css('transform', "rotate(" + (num - 180) + "deg)");
            }
        })
    });
    
    
    var dataUrl = "home";
    var borrowUrl = "borrower";
    var transferUrl = "transfer";
    var productUrl = "product";
 
   
  
  var app = new Vue({
        el:"body",
        data:{
        	data:[],
        	borrow:[],
        	transfer:[],
        	product1:[],
            data1:"block",
            data2:'none',
            login:true
        },
        computed:{
            productlist:function () {
                var productli=new Array(4);
                for (var i=1; i<5; i++) {
                    //alert(this.product1[i]+"gfgf");
                    productli[i-1]=this.product1[i];
                    
                }
                return productli;
            },
            transferlist:function () {
                var invest = new Array();
                var total = new Array();
                var p;
                var tran = new Array(4);
                for(var i = 0;i< 4;i++)
                {
                    invest[i] = this.transfer[i].investMoney;
                    total[i] = this.transfer[i].total;
                    p =  Math.floor(invest[i]/total[i] *100);
                    this.transfer[i].percent = [p];
                    tran[i] = this.transfer[i];
                }
                return tran;
            },
            borrowlist:function () {
                var invest = new Array();
                var total = new Array();
                var p;
                var borrow1 = new Array(4);
                for (var i = 1; i < 5; i++) {
               
                    invest[i] = this.borrow[i].investMoney;
                    total[i] = this.borrow[i].total;
                    p= Math.floor(invest[i]/total[i] *100);
                    this.borrow[i].percent = [p];
                    borrow1[i - 1] = this.borrow[i];
                }
                return borrow1;
            }
        },

        methods:{
            click:function () {
               this.data1 = "block";
                this.data2 = "none";
            },
            click1:function () { 
                this.data1 = "none";
                this.data2 = "block";
            },
            buyClick:function(){
            	$.ajax({
            		url:"BorrowBuy",
            		data:{
            			bid:this.data.product.id
            			
            		},
            	
            		success:function(data){
            			if(data.code != 0)
            				{
            				 window.location.href="login.html";
            				}else{
            					alert("进入"+app.data.product.id)
            					window.location.assign("productinfo?bid="+app.data.product.id);
            				}
            		}
            	});
            	 
            },
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

    $(function($){
    	$.ajax({
    		url:dataUrl,
    		type:'POST',
    		success:function(data){
    			app.data= data;
    	
    		}
    	});
    });
    
    $(function($){
    	$.ajax({
    		url:productUrl,
    		type:'POST',
    		success:function(data){
    			app.product1= data;
    		
    		}
    	});
    });
    
    $(function($){
    	$.ajax({
    		url:borrowUrl,
    		type:'POST',
    		success:function(data){
    			app.borrow = data;
    		}
    	});
    });
    
    
    $(function($){
    	$.ajax({
    		url:transferUrl,
    		type:'POST',
    		success:function(data){
    			app.transfer = data;
    		}
    	});
    });
    
    $(function($){
    	$.ajax({
    		url:"judge",
    		type:'POST',
    		success:function(data){
    			if(data.code == 0)
				{
				   app.login = false;
				}
	
					
				
    		}
    	});
    });