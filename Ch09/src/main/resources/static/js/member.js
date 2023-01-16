/**
 * 
 */

 $(document).ready(function(){
			// member 목록1 요청
			$('.member_list1').click(function(){
				
				$.ajax({
					'url':'/Ch09/member',
					'method':'GET',
					'dataType':'json',
					'success': function(data){
						console.log(data);
						
					}
				});
			});
			
			
			// member 목록2 요청
			$('.member_list2').click(function(){
				
				$.ajax({
					'url':'/Ch09/member/r101',
					'method':'GET',
					'dataType':'json',
					'success': function(data){
						console.log(data);
						
					}
				});
			});
			
			
			// member 등록 요청
			$('.member_register').click(function(){
				
				let jsonData = {
					"uid": "c101",	
					"name": "진윤희",	
					"hp": "010-9999-7777",	
					"pos": "사원",	
					"dep": "108"	
				};
				
				$.ajax({
					url:'/Ch09/member',
					method:'POST',
					data: jsonData,
					dataType:'json',
					success: function(data){
						if(data > 0)
							alert('등록완료');
					}
				});
			});
			
			// member 수정 요청
			$('.member_modify').click(function(){
				
				
					let jsonData = {
						"uid": "r101",	
						"name": "홍길동",	
						"hp": "010-5555-4444",	
						"age": 21
					};
					
					$.ajax({
						url:'/Ch09/member',
						method:'PUT',
						data: jsonData,
						dataType:'json',
						success: function(data){
							console.log(data);
						}
					});
				});
				
				
			// member 삭제 요청
			$('.member_delete').click(function(){
				let answer = confirm('정말 삭제하시겠습까?');
				if(answer){
					$.ajax({
					url:'/Ch09/member/c101',
					method:'DELETE',
					dataType:'json',
					success: function(data){
						if(data > 0){
							alert('삭제되었습니다.');
						}else{
							alert('다시 시도하세요.')
						}
					}
				});
				}
			});
		});