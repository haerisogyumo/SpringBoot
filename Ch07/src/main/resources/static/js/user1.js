/**
 * 
 */

 $(document).ready(function(){
			// user1 목록1 요청
			$('.user1_list1').click(function(){
				
				$.ajax({
					'url':'/Ch09/user1',
					'method':'GET',
					'dataType':'json',
					'success': function(data){
						console.log(data);
						
					}
				});
			});
			
			
			// user1 목록2 요청
			$('.user1_list2').click(function(){
				
				$.ajax({
					'url':'/Ch09/user1/r101',
					'method':'GET',
					'dataType':'json',
					'success': function(data){
						console.log(data);
						
					}
				});
			});
			
			
			// user1 등록 요청
			$('.user1_register').click(function(){
				
				let jsonData = {
					"uid": "r101",	
					"name": "홍길동",	
					"hp": "010-9999-7777",	
					"age": 45
				};
				
				$.ajax({
					url:'/Ch09/user1',
					method:'POST',
					data: jsonData,
					dataType:'json',
					success: function(data){
						console.log(data);
					}
				});
			});
			
			// user1 수정 요청
			$('.user1_modify').click(function(){
				
				
					let jsonData = {
						"uid": "r101",	
						"name": "홍길동",	
						"hp": "010-5555-4444",	
						"age": 21
					};
					
					$.ajax({
						url:'/Ch09/user1',
						method:'PUT',
						data: jsonData,
						dataType:'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				
				
			// user1 삭제 요청
			$('.user1_delete').click(function(){
				
				let jsonData = {"uid":"r101"};
				
				$.ajax({
					url:'/Ch09/user1/r101',
					method:'DELETE',
					dataType:'json',
					success: function(data){
						console.log(data);
					}
				});
			});
		});